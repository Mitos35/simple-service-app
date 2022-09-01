package com.example.controller;

import com.example.dto.UserCars;
import com.example.server.UserCarsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/simple")
@RequiredArgsConstructor
public class UserCarsController {
    public final UserCarsService userCarsService;

    @GetMapping
    public List<UserCars> getUserCars() {
        return userCarsService.getUserCars();
    }

}
