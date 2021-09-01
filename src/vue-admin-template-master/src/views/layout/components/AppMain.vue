<template>
  <section class="app-main">
    <transition name="fade-transform" mode="out-in">
      <!-- or name="fade" -->
      <router-view :key="key"></router-view>
      <!-- <router-view/> -->
    </transition>
  </section>
</template>

<script>
export default {
  name: 'AppMain',
  computed: {
    //路由跳转到同一页面，组件只会加载一次。打开下面注解让组件每次都要重新加载
    key() {
      return this.$route.name !== undefined ? this.$route.name + +new Date() : this.$route + +new Date()
    }
  }
}
</script>

<style scoped>
.app-main {
  /*50 = navbar  */
  min-height: calc(100vh - 50px);
  position: relative;
  overflow: hidden;
}
</style>
