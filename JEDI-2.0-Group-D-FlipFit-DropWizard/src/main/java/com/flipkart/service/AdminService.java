package com.flipkart.service;

import com.flipkart.bean.Gym;
import com.flipkart.dao.AdminDao;

import java.util.ArrayList;

public class AdminService {
    private final AdminDao adminDao =new AdminDao();
    public ArrayList<Gym> viewAllGyms(){
        return adminDao.viewAllGyms();
    }

}
