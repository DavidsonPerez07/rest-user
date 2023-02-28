package com.davidsonperez.practica.restuser.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.davidsonperez.practica.restuser.data.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
}
