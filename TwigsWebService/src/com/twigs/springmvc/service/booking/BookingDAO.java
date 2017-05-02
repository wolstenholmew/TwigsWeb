package com.twigs.springmvc.service.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookingDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Booking findBookingById(long bookingId) {
        String sql = "SELECT * FROM res_booking WHERE booking_id = ?";
        return jdbcTemplate.queryForObject( sql, new Object[]{bookingId}, new BeanPropertyRowMapper<>(Booking.class));
    }

}
