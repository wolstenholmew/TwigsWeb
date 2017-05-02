package com.twigs.springmvc.service.controller;

import com.twigs.springmvc.service.booking.Booking;
import com.twigs.springmvc.api.BookingRequest;
import com.twigs.springmvc.api.ITwigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rs")
public class RestController {

    @Autowired
    @Qualifier("twigService")
    private ITwigService twigService;

    @RequestMapping(value = "/booking-summary", method = RequestMethod.POST)
    public Booking rsBookingSummary( @Valid BookingRequest bookingRequest ) {
        return twigService.findBookingById( bookingRequest );
    }

}