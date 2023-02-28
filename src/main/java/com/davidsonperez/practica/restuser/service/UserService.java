package com.davidsonperez.practica.restuser.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.davidsonperez.practica.restuser.data.entity.User;
import com.davidsonperez.practica.restuser.data.repository.UserRepository;
import com.davidsonperez.practica.restuser.web.dto.UserDto;

@Service
public class UserService {
    private UserRepository userRepository;
    private ModelMapper modelMapper;

    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }
    
    public UserDto save(UserDto user) {
        User myUser = modelMapper.map(user, User.class);
        myUser = userRepository.save(myUser);
        UserDto resp = modelMapper.map(myUser, UserDto.class);
        return resp;
    }
    
    public List<UserDto> listAll() {
        return null;
    }
    
    public UserDto findOne(Long id) {
        return null;
    }
}
