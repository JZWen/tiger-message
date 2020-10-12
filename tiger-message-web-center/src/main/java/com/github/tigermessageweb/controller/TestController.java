package com.github.tigermessageweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author JZWen
 * @Date 2020/10/12
 */
@RestController("/")
public class TestController {
    @RequestMapping("/test")
    public String test() {
        return "is ok!";
    }

}
