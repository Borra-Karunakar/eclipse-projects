package com.example.employeeservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/{id}")
    public ResponseEntity<Map<String,Object>> getEmployee(
            @PathVariable String id,
            @RequestHeader Map<String, String> headers) {

        // log headers so we can see the header added by the gateway
        logger.info("Headers received at Employee service: {}", headers);

        Map<String,Object> response = new HashMap<>();
        response.put("id", id);
        response.put("name", "karunakar");
        // echo a specific header (optional)
        response.put("xFromGateway", headers.get("x-from-gateway"));

        return ResponseEntity.ok(response);
    }
}
