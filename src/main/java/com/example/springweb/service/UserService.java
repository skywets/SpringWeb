package com.example.springweb.service;

import com.example.springweb.entity.User;
import com.example.springweb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {

//    @Autowired
//    private UserRepo userRepo;
//
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    public void save(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        userRepo.save(user);
//    }
//
//    public User findByUserName(String username) {
//        return userRepo.findByUsername(username);
//    }
}
