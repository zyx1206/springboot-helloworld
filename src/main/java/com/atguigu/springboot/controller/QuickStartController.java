package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickStartController {
    @RequestMapping("/hello")
    public String hello(){
        return "ok";
    }
}
