package com.example.portfolio.manager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PortfolioController {

    // This endpoint returns a sample portfolio data
    @GetMapping("/portfolio")
    public String getPortfolio() {
        return "Sample Portfolio Data";
    }
}
