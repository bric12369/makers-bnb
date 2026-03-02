package com.makers.makersbnb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticPageController {

    @GetMapping("/")
    public String landingPage() {
        return "<h1>Welcome to MakersBnB!</h1>";
    }

    @GetMapping("/contact-us")
    public String contactUs() {
        return "<p>contact@makersbnb.co.uk</p>";
    }
}
