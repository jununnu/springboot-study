import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import 'element-plus/dist/index.css'
import router from "./router/index.js";
import { createPinia } from 'pinia'
import axios from "axios";

createApp(App).use(createPinia).use(router).mount('#app')
