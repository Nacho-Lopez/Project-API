package com.uade.tpo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.uade.tpo.demo.entity.Role;
import com.uade.tpo.demo.entity.User;

public interface UserService {
    //public ResponseEntity<List<User>> getAllUsers();

    public List<User> getAllUsers();

    public Optional<User> getUserByEmail(String email);

    public User changeUserRole(String email, Role newRole);
}
