尝试集成vue和boot
---

先说，这是个尴尬的处境。java后端的惯性思维，让我还是亲不自禁想把vue弄到后端代码里来，最后还是不跨域的访问。
实际上应该是前后端分离的，我猜测，这个问题最终通过部署来解决的吧，在内部分开部署，对外通过Nginx反向代理。



## 明确职责：

- vue负责前端页面

- spring-boot负责后端

- 前后端通信采用ajax

## 主要问题

1. 开发时webpack需要编译，并且通过webpack-dev-server 实现热部署，那么如何同时开发呢？
一个办法是通过webpack的代理设置将请求代理给后端
webpack.dev.conf.js的配置中有proxy,实际配置在config/index.js中

```js

 proxyTable: {
      '/api':{
        target:"http://localhost:8080",
        changeOrigin:true,
        pathRewrite: {
          '^/api':'/api'
        }
      }
      
```

2. 部署时，前端需要编译，后端也需要编译，如何同步执行呢？

首先，通过exec-maven-plugin将执行`npm run build `；

然后通过maven-resources-plugin 执行 拷贝操作，将npm生成的dist内容拷贝到resources的static目录下；

执行 java -jar target/{生成的jar}.jar 即可看到效果
打开首页是空白，究其原因是js、css等静态资源的路径不正确，在index.js的build中将assetsPublicPath改成'./',就是加个点


