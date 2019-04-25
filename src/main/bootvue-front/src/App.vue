<template>
  <div id="app">
    <el-container>
      <el-header>
        <el-menu mode="horizontal" router>
          <el-menu-item index="/">首页</el-menu-item>
          <el-submenu index="">
            <template slot="title">解决方案</template>
            <el-menu-item index="2-1">金融</el-menu-item>
            <el-menu-item index="2-2">医疗</el-menu-item>
          </el-submenu>
          <el-menu-item index="/solution">联系我们</el-menu-item>
        </el-menu>

      </el-header>
      <el-main>
        <router-view/>
      </el-main>
      <el-footer>脚部</el-footer>
    </el-container>
  </div>
</template>

<script>

export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
