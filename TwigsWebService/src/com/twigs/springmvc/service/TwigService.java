package com.twigs.springmvc.service;

import com.twigs.springmvc.booking.Booking;
import com.twigs.springmvc.booking.BookingDAO;
import com.twigs.springmvc.booking.BookingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TwigService implements ITwigService {

    @Autowired
    private BookingDAO bookingDAO;

    @Override
    public Booking findBookingById( BookingRequest bookingRequest ) {
        return bookingDAO.findBookingById( bookingRequest.getBookingId() );
    }
}
