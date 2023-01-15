package com.codeup.blogapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//    CONTROLLERS EXAMPLE
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello from Spring";
    }


//     PATH VARIABLES
    @GetMapping("hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        return "Hello " + name + " !";
    }
}
