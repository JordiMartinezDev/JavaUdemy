package com.example.udemyCourse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapp")
public class HelloController {
    
    @GetMapping("/")
    public String index(){
        return "Hello Worldss ";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
