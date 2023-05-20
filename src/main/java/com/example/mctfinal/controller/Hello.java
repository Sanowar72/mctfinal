package com.example.mctfinal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping(value = "/home")
    public String home(){
        return "this is home....";
    }
    @GetMapping(value = "/home2")
    public String home2(){
        return "this is home2......";
    }
}
