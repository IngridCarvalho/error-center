package com.codenation.errorcenter.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 50)
    @NotEmpty(message = "Username is require")
    @Column(unique = true)
    private String username;

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    @NotEmpty(message = "Email is require")
    @Email
    private String email;

    @NotNull
    @NotEmpty(message = "Password is require")
    private String password;

    public Long getId() {
        return id;
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
