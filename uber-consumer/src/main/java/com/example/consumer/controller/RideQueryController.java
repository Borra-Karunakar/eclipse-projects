package com.example.consumer.controller;

import com.example.consumer.model.Ride;
import com.example.consumer.repository.RideRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rides")
public class RideQueryController {

    private final RideRepository rideRepository;

    public RideQueryController(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    @GetMapping
    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }

    @GetMapping("/{id}")
    public Ride getRideById(@PathVariable Long id) {
        return rideRepository.findById(id).orElse(null);
    }
}
