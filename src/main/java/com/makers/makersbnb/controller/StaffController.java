package com.makers.makersbnb.controller;

import com.makers.makersbnb.model.Staff;
import com.makers.makersbnb.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class StaffController {

    @Autowired
    StaffRepository staffRepository;

    @GetMapping("/team")
    public ModelAndView team() {
        ModelAndView modelAndView = new ModelAndView("Staff");
        List<Staff> team = (List<Staff>) staffRepository.findAll();
        modelAndView.addObject("team", team);
        return modelAndView;
    }
}
