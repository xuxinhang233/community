package com.example.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/greeting")
    // 接收一个参数，名为 "name"
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "world")
                           String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
