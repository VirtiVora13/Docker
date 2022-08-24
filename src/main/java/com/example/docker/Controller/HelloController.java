package com.example.docker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/hello")
public class HelloController {
    //https://www.youtube.com/watch?v=FlSup_eelYE
    @GetMapping
    public String hello(){
        return "Hello";
    }
}
