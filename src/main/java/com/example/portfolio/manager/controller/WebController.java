// Create a new Java class `WebController.java` in the appropriate package (e.g., `com.example.portfolio.manager.controller`)

package com.example.portfolio.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/{[path:[^\\.]*}")
    public String redirect() {
        return "forward:/";
    }
}
