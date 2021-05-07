package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

    @Autowired
    LoginDataRepository loginDataRepository;

    public void loginData(LoginData data){
        loginDataRepository.save(data);
    }

    public String userName(LoginData data){
        String username = data.getUsername();
        String password = data.getPassword();

        LoginData value = loginDataRepository.findById(data.getId()).orElseThrow(null);
        String username1 = value.getUsername();
        String password1 = value.getPassword();

        if(username.equals(username1) && password.equals(password1)){
            String message = "Authentication Successful";
            return message;
        }
        String message = "Invalid username or password";
        return message;
    }
}