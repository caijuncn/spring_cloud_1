package com.test.test1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring_cloud_1
 * @description:
 * @author: caijun
 * @create: 2018-11-19 15:16
 **/
@RestController
public class HelloControlller {

    @GetMapping("/hw")
    public String hw(){
        return "hw";
    }
}
