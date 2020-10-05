package com.example.springdemo.controllers;

import com.example.springdemo.models.Ad;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdController {

    @GetMapping("/ads/{id}")
    public String showAd(@PathVariable long id, Model model) {
        // get by id
        Ad ad = new Ad("Single ad Title", "Description for a single ad.");
        model.addAttribute("ad", ad);
        return("ads/ad");
    }
}
