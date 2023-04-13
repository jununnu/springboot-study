package com.example.entity;

import lombok.Data;

/**
 * @author Jun
 * @date 2023/4/13 21:25
 * @description Account
 */
@Data
public class Account {
    private int id;
    private String username;
    private String password;
    private String email;
}
