package com.nwpu.npu_wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello world!";
    }
}
