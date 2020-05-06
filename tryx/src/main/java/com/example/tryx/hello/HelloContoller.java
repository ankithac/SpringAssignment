package com.example.tryx.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {
    @GetMapping("/")
    public String hello(){
        return "Hello Checkingg!";
    }
    @GetMapping("/bean/path-variable/{name}")
    public helloBean  getbean(@PathVariable String name){
        return new helloBean (String.format ("Hello Bean,%s",name));
    }
}
