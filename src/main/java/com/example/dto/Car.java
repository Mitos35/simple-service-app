package com.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String name;
    private String model;

    public List<Car> initializeListCar() {
        return List.of(new Car("Mercedes‑Benz", "A‑Class"),
                new Car("Audi", "A3"),
                new Car("Kia", "Rio"));
    }
}
