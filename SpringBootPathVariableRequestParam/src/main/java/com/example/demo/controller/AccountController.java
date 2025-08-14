package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class AccountController {

    @GetMapping("/users/{id}/accounts")
    public List<String> getAccounts(@PathVariable String id,
                                    @RequestParam String type,
                                    @RequestParam String status) {
        return Arrays.asList("UserID: " + id, "Type: " + type, "Status: " + status);
    }
}