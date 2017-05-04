package com.twigs.springmvc.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twigs.springmvc.BookingSummary;
import org.jboss.logging.Logger;
import org.springframework.web.client.RestTemplate;

public class TwigsRestClientApp {

    private static final Logger LOGGER = Logger.getLogger( TwigsRestClientApp.class );

    private static int bookingId = 1;
    private static final String SERVER = ""; //http://localhost:8080/
    private static final String SERVICE = "TwigsWebService1.0/rs/booking-summary/{bookingId}";
    private static final String URI = SERVER + SERVICE;

    public static void main(String[] args) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        LOGGER.info("Get bookingSummary for bookingId: " + bookingId);
        BookingSummary bookingSummary = restTemplate.getForObject( URI, BookingSummary.class, bookingId );
        LOGGER.info( new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(bookingSummary) );
    }

}
