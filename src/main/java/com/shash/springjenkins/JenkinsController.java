package com.shash.springjenkins;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("/hello")
    public String wish(){
        return "wish";
    }
}
