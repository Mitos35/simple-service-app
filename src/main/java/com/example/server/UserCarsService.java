package com.example.server;

import com.example.dto.Car;
import com.example.dto.User;
import com.example.dto.UserCars;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class UserCarsService {
    public static int MAX_RANGE_VALUE = 1;
    private final UserService userService;
    public final CarService carService;

    public List<UserCars> getUserCars() {
        return generateUserCars(userService.getUsers(), carService.getCars());
    }

    private List<UserCars> generateUserCars(List<User> users, List<Car> cars) {
        List<UserCars> userCarsList = new ArrayList<>();
        int maxRangeValue = users.size() + 1;

        for (User user : users) {
            var randomCarList = getRandomCarList(cars, new Random().nextInt(MAX_RANGE_VALUE, maxRangeValue));
            UserCars userCars = new UserCars(user, randomCarList);
            userCarsList.add(userCars);
        }
        return userCarsList;
    }

    private static <T> List<T> getRandomCarList(List<T> list, int n) {
        if (n > list.size()) {
            throw new IndexOutOfBoundsException();
        }
        List<T> copy = new ArrayList<>(list);
        Collections.shuffle(copy);
        return copy.subList(0, n);
    }

}


