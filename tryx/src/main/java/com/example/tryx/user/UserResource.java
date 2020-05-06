package com.example.tryx.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private dao service;
    @GetMapping ("/users")
    public List retrieveAll(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public Employee retrieveOne(@PathVariable int id){
        return service.findOne(id);
    }

    @PostMapping("/users")
    public Employee addUser(@RequestBody Employee emp){
        if(emp.getPhone().length() == 10){
            Employee savedUser = service.save(emp);
            return savedUser;
        }

       return null;
    }
}
