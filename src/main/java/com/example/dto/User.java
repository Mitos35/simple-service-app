package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public final class User {
    private String firstName;
    private String lastName;

    public List<User> initializeListUsers() {
        return List.of(new User("Robert", "Baratheon"),
                new User("Jaime", "Lannister"),
                new User("Eddard", "Stark"));
    }
}
