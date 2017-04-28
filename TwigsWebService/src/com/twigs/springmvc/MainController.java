package com.twigs.springmvc;

import com.twigs.springmvc.booking.Booking;
import com.twigs.springmvc.booking.BookingRequest;
import com.twigs.springmvc.service.ITwigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    @Qualifier("twigService")
    private ITwigService twigService;

    @RequestMapping("/booking-search")
    public String bookingSearch( Model model ) {
        model.addAttribute( "bookingRequest", new BookingRequest() );
        return "booking-search-form";
    }

    @RequestMapping(value = "/booking-summary", method = RequestMethod.POST)
    public String bookingSummary( @Valid BookingRequest bookingRequest,
                        BindingResult bindingResult,
                        Model model) {
        if ( bindingResult.hasErrors() ) {
            return "booking-search-form";
        }
        Booking booking = twigService.findBookingById(bookingRequest);
        model.addAttribute("booking", booking);
        return "booking-summary";
    }

}
