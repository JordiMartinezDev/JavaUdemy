package com.example.udemyCourse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @GetMapping("/")
    public String index(){
        return "Users path";
    }
    @GetMapping("/{userId}")
    public String displayUser(@PathVariable int userId){
        return "User found: " + userId;

    }
}
