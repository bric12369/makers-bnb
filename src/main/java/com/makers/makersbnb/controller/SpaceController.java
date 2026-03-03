package com.makers.makersbnb.controller;

import com.makers.makersbnb.model.Space;
import com.makers.makersbnb.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SpaceController {

    @Autowired
    SpaceRepository spaceRepository;

    @GetMapping("/spaces")
    public ModelAndView spaces() {
        ModelAndView spacesView = new ModelAndView("Spaces");
        Iterable<Space> currentSpaces = spaceRepository.findAll();
        spacesView.addObject("currentSpaces", currentSpaces);
        return spacesView;
    }
}
