<template>
    <div style="text-align: center; margin: 0 20px">
        <div style="margin-top: 100px">
            <div style="font-size: 25px; font-weight: bold">注册用户</div>
            <div style="font-size: 14px; color: grey">Welcome</div>
        </div>
        <div style="margin-top: 50px">
            <el-form :model='form' :rules="rules">
                <el-form-item prop="username">
                    <el-input type="text" v-model="form.username" placeholder="用户名">
                        <template #prefix>
                            <el-icon><User /></el-icon>
                        </template>
                    </el-input>
                </el-form-item>
                <el-form-item prop="password">
                    <el-input type="password" v-model="form.password" placeholder="密码" >
                        <template #prefix>
                            <el-icon><Lock /></el-icon>
                        </template>
                    </el-input>
                </el-form-item>
                <el-form-item prob="password_repeat">
                    <el-input type="password" v-model="form.password_repeat" placeholder="重复密码" >
                        <template #prefix>
                            <el-icon><Lock /></el-icon>
                        </template>
                    </el-input>
                </el-form-item>
                <el-form-item>
                    <el-input type="email" v-model="form.email" placeholder="Email" >
                        <template #prefix>
                            <el-icon><Message /></el-icon>
                        </template>
                    </el-input>
                </el-form-item>
                <el-form-item>
                    <el-row :gutter="10" style="width: 100%">
                        <el-col :span="17">
                            <el-input type="email" v-model="form.code" placeholder="请输入验证码">
                                <template #prefix>
                                    <el-icon><EditPen /></el-icon>
                                </template>
                            </el-input>
                        </el-col>
                        <el-col :span="7">
                            <el-button type="success" style="text-align: right" plain>获取验证码</el-button>
                        </el-col>
                    </el-row>
                </el-form-item>
            </el-form>
           
            
            
            
        </div>

        <div style="margin-top: 80px">
            <el-divider></el-divider>
            <el-button style="width: 270px" type="warning" plain>立即注册</el-button>
        </div>
        <div style="margin-top: 20px">
            <span style="font-size: 14px; line-height: 15px; color: grey">已有账号？</span>
            <el-link type="primary" style="translate: 0 -2px" @click="router.push('./')">立即登录</el-link>
            
        </div>
    </div>
</template>

<script setup>

import {EditPen, Lock, Message, User} from "@element-plus/icons-vue";
import router from "@/router/index.js";
import {reactive} from "vue";

const validateUsername = (rule, value, callback) => {
    if (value === '') {
        callback(new Error('请输入用户名'))
    } else if (!/^[a-zA-Z0-9\u4e00-\u9fa5]+$/.test(value)) {
        callback(new Error('用户名仅支持中文、英文和数字'))
    } else {
        callback()
    }
}

const validatePassword = (rule, value, callback) => {
    if (value === '') {
        callback(new Error('请再次输入密码'))
    } else if (value !== form.password) {
        callback(new Error('两次输入的密码不一致'))
    } else {
        callback()
    }
}

const rules = {
    username: [
        { validator: validateUsername, trigger: ['blur', 'change']},
        { min: 2, max: 8, message: '用户名长度范围为2-8个字符', trigger: ['blur', 'change']}
    ],
    password: [
        { required: true, message: '请输入密码', trigger: 'blur'},
        { min: 6, max: 16, message: '密码长度范围为6-16个字符', trigger: ['blur', 'change']}
    ],
    password_repeat: [
        { required: true, message: '123' },
        { validator: validatePassword, trigger: ['blur', 'change'] }
    ]
}

const form = reactive({
    username: '',
    password: '',
    password_repeat: '',
    email: '',
    code: ''
})

</script>


<style scoped>

</style>