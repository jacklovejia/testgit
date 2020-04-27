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
        Map<String, String> map = new HashMap<>();
        map.put("provinceCode","33101");
        map.put("powerUserId","6023256871");
        List<PowerUserIdDo> remote = new ArrayList<>();
        remote.add(new PowerUserIdDo("6023256874","q","q","33101","01"));
        remote.add(new PowerUserIdDo("6023256871","q","q","33101","01"));
        remote.add(new PowerUserIdDo("6023256872","213","123","33111","01"));
        redisTemplate.opsForValue().set(key+"1", JSONObject.toJSONString(remote));
        Object o1 = redisTemplate.opsForValue().get(key          + "1");
        System.out.println(o1);
        System.out.println("=====================================");
        List<PowerUserIdDo> powerUserIdDos = JSONObject.parseArray(o1.toString(), PowerUserIdDo.class);
        powerUserIdDos.removeIf(x->x.getProNo().equals(map.get("provinceCode")) && x.getConsNo().equals(map.get("powerUserId")));
        powerUserIdDos.stream().forEach(System.out::println);
        redisTemplate.opsForValue().set(key+"1", powerUserIdDos);
        System.out.println(redisTemplate.opsForValue().get(key + "1"));

    }


}
