package com.example.deliveryclient.controller;

import com.example.deliveryclient.service.DeliveryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeliveryController {

    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping("/api/delivery/status")
    public ResponseEntity<String> getStatus() {
        String result = deliveryService.getDeliveryStatus();
        return ResponseEntity.ok(result);
    }
}