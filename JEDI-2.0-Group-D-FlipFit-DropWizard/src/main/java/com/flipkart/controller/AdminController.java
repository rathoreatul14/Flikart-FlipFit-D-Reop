package com.flipkart.controller;

import com.flipkart.bean.Gym;
import com.flipkart.service.AdminService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/admin")
public class AdminController {

    private final AdminService adminService = new AdminService();
    @GET
    @Path("/gyms")
    public ArrayList<Gym> viewAllGyms(){
        return adminService.viewAllGyms();
    }

//    @GET
//    @Path("/gymOwners")
//    public String viewAllGymOwners(){
//        adminServices.viewAllGyms();
//    }
//
//    @GET
//    @Path("/pending/gyms")
//    public String viewPendingGyms(){
//        return "Gyms";
//    }
//
//    @GET
//    @Path("/pending/gymOwners")
//    public String viewPendingGymOwners(){
//        return "Gyms";
//    }
//
//    @PUT
//    @Path("/approve/gyms")
//    public String approveGyms(){
//        return "Gyms";
//    }
//
//    @PUT
//    @Path("/approve/gyms")
//    public String approveGymOwners(){
//        return "Gyms";
//    }

}
