package com.shash.springjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class JenkinsController {

    @GetMapping("/wish")
    public String wish(){
        return "wish";
    }
}
