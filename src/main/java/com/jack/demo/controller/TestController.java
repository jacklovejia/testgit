package com.jack.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/01")
    public String test01() {
        return "test01";
    }
    @GetMapping("/04")
    public String test02() {
        return "test02";
    }
}
