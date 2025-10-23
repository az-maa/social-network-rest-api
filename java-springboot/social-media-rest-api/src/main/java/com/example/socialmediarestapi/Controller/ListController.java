package com.example.socialmediarestapi.Controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ListController {

    @GetMapping("/placeholder")
    public String placeholder() {
        return "API is working!";
    }
}
