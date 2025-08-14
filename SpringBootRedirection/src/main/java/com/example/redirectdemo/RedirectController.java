package com.example.redirectdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    @GetMapping("/example/test")
    public String redirect() {
        return "redirect:/example/test2";
    }

    @GetMapping("/example/test2")
    public String test2() {
        return "test2"; // This will map to test2.html
    }
}
