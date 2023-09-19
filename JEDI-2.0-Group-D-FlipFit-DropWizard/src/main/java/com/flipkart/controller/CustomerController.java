package com.flipkart.controller;

import com.flipkart.bean.Gym;
import com.flipkart.service.CustomerServices;
import com.flipkart.service.CustomerServicesInterface;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.ArrayList;

@Path("/customer")
public class CustomerController
{

    private final CustomerServicesInterface customerService = new CustomerServices();
    @GET
    @Path("/login")
    public String login(){
        return "Login";
    }

    @GET
    @Path("/register")
    public String register(){
        return "Register";
    }

    @GET
    @Path("/profile")
    public String viewProfile(){
        return "Profile";
    }

    @GET
    @Path("/gyms")
    public String viewGyms(){
        return "Gym List";
    }
    @GET
    @Path("/book")
    public String bookSlot(){
        return "Book Slot";
    }

    @GET
    @Path("/bookings")
    public String viewBookings(){
        return "view bookings";
    }
}
