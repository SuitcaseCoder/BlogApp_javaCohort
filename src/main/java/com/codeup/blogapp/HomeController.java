package com.codeup.blogapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String welcome(){
        return "home";
    }

    @GetMapping("/welcome")
    public String welcomePartial(){
        return "welcome";
    }
}
