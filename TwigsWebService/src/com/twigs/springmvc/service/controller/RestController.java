package com.twigs.springmvc.service.controller;

import com.twigs.springmvc.api.ITwigService;
import com.twigs.springmvc.api.request.BookingRequest;
import com.twigs.springmvc.api.response.BookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rs")
public class RestController {

    @Autowired
    @Qualifier("twigService")
    private ITwigService twigService;

    @RequestMapping(value = "/booking-summary/{bookingId}", method = RequestMethod.GET)
    public BookingResponse rsBookingSummary2( @PathVariable long bookingId) {
        BookingRequest bookingRequest = new BookingRequest();
        bookingRequest.setBookingId( bookingId );
        return twigService.findBookingById( bookingRequest );
    }

}
