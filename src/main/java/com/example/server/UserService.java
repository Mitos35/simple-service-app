package com.example.server;

import com.example.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getUsers() {
        return new User().initializeListUsers();
    }
}
