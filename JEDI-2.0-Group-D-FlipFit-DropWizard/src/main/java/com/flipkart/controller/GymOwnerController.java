package com.flipkart.controller;

import com.flipkart.bean.Gym;
import com.flipkart.bean.GymOwner;
import com.flipkart.service.GymOwnerServices;
import com.flipkart.service.GymOwnerServicesInterface;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/gymowner")
@Produces(MediaType.APPLICATION_JSON)
public class GymOwnerController {
        GymOwnerServicesInterface gymOwnerService = new GymOwnerServices();

        @POST
        @Consumes (MediaType.APPLICATION_JSON)
        @Produces (MediaType.APPLICATION_JSON)
        @Path("/registergymowner/")
        public Response registerGymOwner(GymOwner gymOwner)
        {

            return Response.ok(gymOwnerService.registerGymOwner(gymOwner)).build();
        }
        @GET
        @Produces (MediaType.APPLICATION_JSON)
        @Path("/viewgymownerprofile/{gymOwnerId}")
        public Response viewGymOwner(@PathParam("gymOwnerId") int gymOwnerId)
        {
         return Response.ok(gymOwnerService.viewProfile(gymOwnerId)).build();
        }
        @POST
        @Consumes (MediaType.APPLICATION_JSON)
        @Produces (MediaType.APPLICATION_JSON)
        @Path("/registergym")
        public Response registerGym(Gym gym)
        {

                return Response.ok(gymOwnerService.registerGym(gym)).build();
        }




}
