package com.makers.makersbnb.controller;

import com.makers.makersbnb.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class StaticPageController {

    @Autowired
    SpaceRepository spaceRepository;

    @GetMapping("/")
    public ModelAndView landingPage() {
        ModelAndView modelAndView = new ModelAndView("/LandingPage");
        long nSpaces = spaceRepository.count();
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
