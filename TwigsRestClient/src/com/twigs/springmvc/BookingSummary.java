package com.twigs.springmvc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.twigs.springmvc.api.entity.Booking;

@JsonIgnoreProperties( ignoreUnknown = true )
public class BookingSummary {

    private boolean success;
    private String message;
    private Booking booking;

    public BookingSummary() {
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BookingSummary{" +
                    "success='" + success + "\'," +
                    "message='" + message + "\'" +
                    booking.toString() +
                "}";
    }
}
