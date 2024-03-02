package com.jwt.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private List<User> users = new ArrayList<User>();

    public UserService() {
        users.add(new User(UUID.randomUUID().toString(), "Ankit Savani", "ankitmsavani@gmail.com"));

    }

    public List<User> getAllUsers() {
        return this.users;
    }

}
