package com.twigs.springmvc.api;

import com.twigs.springmvc.api.BookingRequest;
import com.twigs.springmvc.api.BookingResponse;

public interface ITwigService {

    public BookingResponse findBookingById( BookingRequest bookingRequest );

}
