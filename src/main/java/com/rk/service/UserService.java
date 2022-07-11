package com.rk.service;

import com.rk.dto.LoginRequest;
import com.rk.dto.RegisterRequest;
import com.rk.model.User;
import com.rk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void signup(RegisterRequest registerRequest){
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }

    public String login(LoginRequest loginRequest){
        User user=userRepository.findByEmail(loginRequest.getEmail());
        if(user!=null)
            return "loggedin";
        else
            return "fail";

    }

}
