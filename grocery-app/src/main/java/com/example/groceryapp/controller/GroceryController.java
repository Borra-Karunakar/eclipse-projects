package com.example.groceryapp.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/grocery")
public class GroceryController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Welcome to Grocery Store (public)";
    }

    @GetMapping("/items")
    public List<String> getItems() {
        return Arrays.asList("Milk", "Bread", "Eggs");
    }

    @GetMapping("/orders")
    public List<String> getOrders() {
        return Arrays.asList("Order#1001", "Order#1002");
    }
}
