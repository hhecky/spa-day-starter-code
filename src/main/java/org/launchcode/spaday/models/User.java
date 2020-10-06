package org.launchcode.spaday.models;

import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class User {

    @NotBlank(message = "User name is required.")
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters long.")
    private String username;

    @Email(message = "Email is optional but if you provide one it must be a valid email address.")
    private String email;

    @NotBlank(message = "Password is required.")
    @Size(min =6, message = "Sorry, but the given password is too short. Passwords must be at least 6 characters long.")
    private String password;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
