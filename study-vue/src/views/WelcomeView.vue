<template>
    <div style="width: 100vw; height: 100vh; overflow: hidden; display: flex">
        <div style="flex: 1">
            <el-image style="width: 100%; height: 100%" fit="cover"
                      src="https://cn.bing.com/th?id=OHR.KlostersSerneus_ZH-CN9821473046_UHD.jpg&rf=LaDigue_1920x1080.jpg&pid=hp"/>
        </div>
        
        <div class="welcome-title">
            <div style="font-size: 30px;font-weight: bold">学习园地</div>
            <div style="margin-top: 10px">Java/JavaScript/Python</div>
        </div>
        
        <div style="width: 400px; background-color: white; z-index: 1">
            <transition name="el-fade-in-linear">
                <router-view v-slot="{ Component }">
                    <transition name="el-fade-in-linear">
                        <component :is="Component" />
                    </transition>
                </router-view>
            </transition>
        </div>
    </div>
</template>

<script setup>
import router from "../router/index.js";

</script>

<style scoped>
.welcome-title {
    position: absolute;
    bottom: 30px;
    left: 30px;
    color: white;
    text-shadow: 0 0 10px black;
}
</style>