package com.twigs.springmvc.api.response;

import com.twigs.springmvc.api.entity.Booking;

public class BookingResponse extends AbstractResponse {

    private Booking booking;

    public BookingResponse() {
    }

    public BookingResponse( boolean success ) {
        super(success);
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
