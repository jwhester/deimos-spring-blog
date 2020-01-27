package com.codeup.deimosspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DeimosController {

    @GetMapping("/deimos/{days}")
    public String daysLeft(@PathVariable Integer days, Model model) {
        model.addAttribute("days", days);
        return "deimos";
    }

    @GetMapping("/deimos")
    public String deimos() {
        return "deimos";
    }
    @PostMapping("/deimos")
    public String name(@RequestParam String name, @RequestParam String password, Model model) {
        model.addAttribute("name", "Welcome " + name + "!");
        model.addAttribute("password", "Password: " + password);
        return "deimos";
    }
}
