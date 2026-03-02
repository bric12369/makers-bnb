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
        Integer nBookings = 123;
        modelAndView.addObject("nSpaces", nSpaces);
        modelAndView.addObject("nBookings", nBookings);
        return modelAndView;
    }

    @GetMapping("/contact-us")
    public ModelAndView contactUs() {
        return new ModelAndView("ContactUs");
    }
}
