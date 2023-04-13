package com.example.mapper;

import com.example.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Jun
 * @date 2023/4/13 21:25
 * @description UserMapper
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM db_account WHERE username = #{test} OR email = #{text}")
    Account findAccountByNameOrEmail(String text);

}
