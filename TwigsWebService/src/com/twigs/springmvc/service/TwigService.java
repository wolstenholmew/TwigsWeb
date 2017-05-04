package com.twigs.springmvc.service;

import com.twigs.springmvc.api.ITwigService;
import com.twigs.springmvc.api.entity.Booking;
import com.twigs.springmvc.service.booking.BookingDAO;
import com.twigs.springmvc.api.request.BookingRequest;
import com.twigs.springmvc.api.response.BookingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

@Component
public class TwigService implements ITwigService {

    @Autowired
    private BookingDAO bookingDAO;

    @Override
    public BookingResponse findBookingById( BookingRequest bookingRequest ) {
        BookingResponse response = new BookingResponse();
        try {
            Booking booking = bookingDAO.findBookingById( bookingRequest.getBookingId() );
            response.setBooking( booking );
        } catch ( DataAccessException dae ) {
            response.updateResponse( false, "Failed to get booking for bookingId " + bookingRequest.getBookingId() );
        }
        return response;
    }
}
