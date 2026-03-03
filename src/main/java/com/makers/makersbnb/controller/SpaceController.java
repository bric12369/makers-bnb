package com.makers.makersbnb.controller;

import com.makers.makersbnb.model.Space;
import com.makers.makersbnb.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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

    @GetMapping("/spaces/new")
    public ModelAndView newSpaceForm() {
        Space space = new Space();
        ModelAndView newSpaceFormView = new ModelAndView("spaces/New");
        newSpaceFormView.addObject("space", space);
        return newSpaceFormView;
    }

    @PostMapping("/spaces")
    public RedirectView createSpace(Space space) {
        spaceRepository.save(space);
        return new RedirectView("/spaces");
    }
}
