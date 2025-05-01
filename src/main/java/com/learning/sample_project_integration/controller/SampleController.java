package com.learning.sample_project_integration.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from Integration";
    }

    @GetMapping("/sample")
    public String saySample(){
        return "Sample ";
    }

    @GetMapping("/test")
    public String  sayTest(){
        return "test";
    }
}
