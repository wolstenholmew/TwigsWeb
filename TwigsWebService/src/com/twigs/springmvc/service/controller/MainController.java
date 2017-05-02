package com.twigs.springmvc.service.controller;

import com.twigs.springmvc.api.request.BookingRequest;
import com.twigs.springmvc.api.response.BookingResponse;
import com.twigs.springmvc.api.ITwigService;
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

    @RequestMapping(value = "/booking-summary", method = RequestMethod.GET)
    public String bookingSummary( @Valid BookingRequest bookingRequest,
                        BindingResult bindingResult,
                        Model model) {
        if ( bindingResult.hasErrors() ) {
            return "booking-search-form";
        }
        BookingResponse bookingResponse = twigService.findBookingById(bookingRequest);
        model.addAttribute("bookingResponse", bookingResponse);
        return "booking-summary";
    }

}
