package com.flipkart.controller;

import com.flipkart.bean.Gym;
import com.flipkart.service.AdminServices;
import com.flipkart.service.AdminServicesInterface;
import com.flipkart.bean.GymOwner;
import com.flipkart.service.*;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/admin")
public class AdminController {

    private final AdminServices adminService = new AdminServices();

    @GET
    @Path("/gyms")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Gym> viewAllGyms(){
        return adminService.viewAllGyms();
    }

    @GET
    @Path("/gymOwners")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<GymOwner> viewAllGymOwners(){
        return adminService.viewAllGymOwners();
    }

    @GET
    @Path("/pending/gyms")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Gym> viewPendingGyms(){
        return adminService.viewPendingGym();
    }

    @GET
    @Path("/pending/gymOwners")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<GymOwner> viewPendingGymOwners(){
        return adminService.viewPendingGymOwner();
    }

    @PUT
    @Path("/approve/gyms")
    public String approveGyms(){
        return "Gyms";
    }

    @PUT
    @Path("/approve/gymOwners")
    public String approveGymOwners(){
        return "Gyms";
    }

}
