package com.makers.makersbnb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StaticPageController {

    @GetMapping("/")
    public ModelAndView landingPage() {
        ModelAndView modelAndView = new ModelAndView("/LandingPage");
        Integer nSpaces = 100;
        modelAndView.addObject("nSpaces", nSpaces);
        return modelAndView;
    }

    @GetMapping("/contact-us")
    public String contactUs() {
        return "<p>contact@makersbnb.co.uk</p>";
    }
}
