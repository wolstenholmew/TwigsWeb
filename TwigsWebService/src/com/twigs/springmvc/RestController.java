package com.twigs.springmvc;

import com.twigs.springmvc.booking.Booking;
import com.twigs.springmvc.booking.BookingRequest;
import com.twigs.springmvc.service.ITwigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
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
