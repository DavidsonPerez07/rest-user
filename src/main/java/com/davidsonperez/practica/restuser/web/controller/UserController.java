package com.davidsonperez.practica.restuser.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidsonperez.practica.restuser.service.UserService;
import com.davidsonperez.practica.restuser.web.dto.UserDto;

@RestController
@RequestMapping("user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping() //POST http://localhost:8080/user
    public UserDto insert(@RequestBody UserDto user) {
        return userService.save(user);
    }
    
    @GetMapping
    public List<UserDto> getAll() {
        return userService.listAll();
    }
    
    @GetMapping("/{id}")
    public UserDto getOne(@PathVariable("id") Long id) {
        return userService.findOne(id);
    }
    
    @PutMapping("/{id}")
    public UserDto updateOne(@PathVariable("id") Long id, @RequestBody UserDto user) {
        return null;
    }
    
    @DeleteMapping("/{id}")
    public UserDto removeOne(@PathVariable("id") Long id) {
        return null;
    }
}
