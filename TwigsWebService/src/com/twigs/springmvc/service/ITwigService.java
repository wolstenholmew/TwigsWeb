package com.twigs.springmvc.service;

import com.twigs.springmvc.booking.Booking;
import com.twigs.springmvc.booking.BookingRequest;

public interface ITwigService {

    public Booking findBookingById( BookingRequest bookingRequest );

}
