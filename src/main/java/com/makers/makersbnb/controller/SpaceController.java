package com.makers.makersbnb.controller;

import com.makers.makersbnb.model.Booking;
import com.makers.makersbnb.model.Space;
import com.makers.makersbnb.repository.BookingRepository;
import com.makers.makersbnb.repository.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@RestController
public class SpaceController {

    @Autowired
    SpaceRepository spaceRepository;
    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping("/spaces")
    public ModelAndView spaces() {
        ModelAndView spacesView = new ModelAndView("Spaces");
        Iterable<Space> currentSpaces = spaceRepository.findAll();
        spacesView.addObject("currentSpaces", currentSpaces);
        return spacesView;
    }

    @GetMapping("/spaces/{id}")
    public ModelAndView spaceById(@PathVariable Long id) {
        ModelAndView spaceByIdView = new ModelAndView("spaces/Space");
        Optional<Space> optionalCurrentSpace = spaceRepository.findById(id);
        Booking booking = new Booking();
        booking.setSpaceId(id);
        Space currentSpace = optionalCurrentSpace.get();
        Iterable<Booking> bookings = bookingRepository.findBySpaceId(id);
        spaceByIdView.addObject("currentSpace", currentSpace);
        spaceByIdView.addObject("bookings", bookings);
        spaceByIdView.addObject("booking", booking);
        return spaceByIdView;
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

    @PostMapping("/bookings")
    public ModelAndView createBooking(Booking booking) {
        bookingRepository.save(booking);
        return new ModelAndView("/BookingSuccessful");
    }
}
