package com.example.restaurantproducer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants() {
        return List.of(
            new Restaurant(1, "Paradise Biryani", "Hyderabad"),
            new Restaurant(2, "Barbeque Nation", "Secunderabad"),
            new Restaurant(3, "Chutneys", "Hyderabad")
        );
    }
}
