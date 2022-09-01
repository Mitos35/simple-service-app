package com.example.server;

import com.example.dto.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    public List<Car> getCars() {
        return new Car().initializeListCar();
    }
}
