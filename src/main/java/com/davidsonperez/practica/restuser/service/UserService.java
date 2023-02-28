package com.davidsonperez.practica.restuser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.davidsonperez.practica.restuser.web.dto.UserDto;

@Service
public class UserService {
    private List<UserDto> users = new ArrayList<>();
    
    public UserDto save(UserDto user) {
        user.setId(users.size() + 1L);
        user.setUserName(user.getUserName().toLowerCase());
        users.add(user);
        return user;
    }
    
    public List<UserDto> listAll() {
        return users;
    }
    
    public UserDto findOne(Long id) {
        return users.get(id.intValue() + 1);
    }
}
