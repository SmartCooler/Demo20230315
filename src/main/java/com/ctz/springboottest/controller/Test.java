package com.ctz.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    /**
     * hello
     *
     * @return {@link String}
     */
    @GetMapping("/hello")
    public String getHello(){
        System.out.println("hello the world!");
        return "hello the world!";
    }
}
