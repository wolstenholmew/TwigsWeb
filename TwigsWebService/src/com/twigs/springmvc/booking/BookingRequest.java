package com.twigs.springmvc.booking;

import javax.validation.constraints.Min;

public class BookingRequest {

    @Min(value = 1, message = "invalid booking id")
    private long bookingId;

    private boolean restResponse;

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public boolean isRestResponse() {
        return restResponse;
    }

    public void setRestResponse(boolean restResponse) {
        this.restResponse = restResponse;
    }
}
