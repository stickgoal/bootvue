<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <div id="content">
      {{userInfo.username}}
    </div>
  </div>
</template>

<script>
  import axios from 'axios'
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      userInfo:{}
    }
  },
  mounted () {
    //发送请求获取用户信息，需要先启动后端提供服务;这里在config/index.js中配置了proxyTable
    axios.get('api/getUserInfo',{params:{userId:1}}).then(resp=>this.userInfo=resp.data);
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
