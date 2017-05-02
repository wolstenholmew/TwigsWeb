package com.twigs.springmvc.api;

import com.twigs.springmvc.service.booking.Booking;
import com.twigs.springmvc.service.AbstractResponse;

public class BookingResponse extends AbstractResponse {

    private Booking booking;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
