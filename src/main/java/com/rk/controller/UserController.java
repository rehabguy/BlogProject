package com.rk.controller;

import com.rk.dto.LoginRequest;
import com.rk.dto.RegisterRequest;
import com.rk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/sign")
    public String signu(@RequestBody RegisterRequest registerRequest){
        userService.signup(registerRequest);
        return "User is created";
    }

    @PostMapping("/log")
    public String logi(@RequestBody LoginRequest loginRequest){

        return userService.login(loginRequest);
//            return "logged in";
//        else
//            return "failed";

    }

}
