package com.example.userregistrationform;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm() {
        return "register";
    }

    @PostMapping("/register")
    public String processForm(@RequestParam String name,
                               @RequestParam String email,
                               @RequestParam String password,
                               Model model) {

        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("password", password);
        return "result";
    }
}
