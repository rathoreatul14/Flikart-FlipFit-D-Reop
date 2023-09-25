package com.flipkart.controller;


import com.flipkart.bean.Booking;
import com.flipkart.bean.Customer;
import com.flipkart.bean.Gym;
import com.flipkart.service.CustomerServices;
import com.flipkart.service.CustomerServicesInterface;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.checkerframework.checker.optional.qual.Present;



import java.util.ArrayList;
import java.util.List;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerController
{

    private final CustomerServicesInterface customerService = new CustomerServices();
    @GET
    @Path("/login")
    public String login(){
        return "Login";
    }

    @PUT
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response register(Customer customer){
        return Response.ok(customerService.registerCustomer(customer)).build();
    }

    @GET
    @Path("/profile/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewProfile(@PathParam("id") int id){
        Customer customer = customerService.viewProfile(id);
        return Response.ok(customer).build();
    }

    @GET
    @Path("/gyms")
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewGyms(){
        ArrayList<Gym> gyms = customerService.viewGyms();
        return Response.ok(gyms).build();
    }
    @POST
    @Path("/book/{slotId}/{custId}/{GymId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void bookSlot(@PathParam("slotId") int slotId, @PathParam("custId") int custId, @PathParam("GymId") int GymId){
        customerService.bookSlot(slotId, custId, GymId);
    }





    @GET
    @Path("/getAllBookings/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllBookings(@PathParam("id") int id){

        List<Booking> myBookings = customerService.viewBookings(id);
        if(!myBookings.isEmpty())
            return Response.ok(myBookings).build();
        else return Response.status(Response.Status.NOT_FOUND).build();

    }

}
