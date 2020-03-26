package com.jack.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        String key = "osg-p0002:user_power_user_id_list_";
        List<Map<String, String>> list = new ArrayList<>();
        redisTemplate.opsForValue().set(key+"123",list);
        Object o = redisTemplate.opsForValue().get(key + "123");
        System.out.println("空的:"+o);
        List<Map<String, String>> list1 = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("name","jack");
        map.put("age","17");
        list1.add(map);
        Map<String, String> map1 = new HashMap<>();
        map1.put("name","rose");
        map1.put("age","15");
        list1.add(map1);
        redisTemplate.opsForValue().set(key+"456", JSON.toJSON(list1));
        Object o1 = redisTemplate.opsForValue().get(key + "456");
        System.out.println(o1);

        System.out.println(redisTemplate.opsForValue().get(key + "4561"));

    }


}
