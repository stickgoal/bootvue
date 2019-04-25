import Vue from 'vue'
import Router from 'vue-router'
import Index from '@/components/Index'
import Solution from '@/components/Solution'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: Index
    },
    {
      path: '/solution',
      name: 'solution',
      component:Solution
    }
  ]
})
