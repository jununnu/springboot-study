package com.example;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.data.relational.core.sql.In;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jun
 * @date 2023/5/4 18:52
 * @description test
 */
public class test {
    public static void main(String[] args) {
        JSONArray array = new JSONArray();
        JSONObject data = new JSONObject();
        List<String> list = List.of("1", "2");
        for (String s : list) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("totalOutSumWeightKg", 111);
            array.add(jsonObject);
        }
//        array.set(0, array.get(0).)
//        array.add(totalVo);
        data.put("data", array);
        System.out.println(data);
    }
}
