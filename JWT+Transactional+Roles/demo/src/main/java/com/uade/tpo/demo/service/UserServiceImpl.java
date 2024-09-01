package com.uade.tpo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uade.tpo.demo.entity.Role;
import com.uade.tpo.demo.entity.User;
import com.uade.tpo.demo.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository usuarioRepository;
    
    public List<User> getAllUsers() {
        return usuarioRepository.findAll();
    }

    public Optional<User> getUserByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    @Transactional
    public User changeUserRole(String email, Role newRole) {
        User user = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("User not found with email: " + email));

        user.setRole(newRole);
        return usuarioRepository.save(user);
    }

}
