package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginData {

    @Id
    private String id;
    private String username;
    private String password;

    public LoginData(){

    }
    public LoginData(String username, String password, String id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
