package com.twigs.springmvc.api;

import com.twigs.springmvc.api.request.BookingRequest;
import com.twigs.springmvc.api.response.BookingResponse;

public interface ITwigService {

    public BookingResponse findBookingById( BookingRequest bookingRequest );

}
