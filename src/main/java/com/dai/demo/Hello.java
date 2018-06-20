package com.dai.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController//作为HTTp的响应正文+Controller
    public class Hello {
    @RequestMapping(value ="/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello SpringBoot";
    }
}
