package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    Services services;

    @PostMapping("/register")
    public void loginData(@RequestBody LoginData data){
        services.loginData(data);
    }

    @PostMapping("/login")
    public String userName(@RequestBody LoginData data){
        return services.userName(data);
    }

}
