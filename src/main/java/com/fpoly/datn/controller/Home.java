package com.fpoly.datn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Thymeleaf!");
        return "view/Home";
    }
}
