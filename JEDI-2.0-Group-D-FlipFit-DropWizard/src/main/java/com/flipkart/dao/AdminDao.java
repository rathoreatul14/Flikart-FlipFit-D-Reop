package com.flipkart.dao;

import java.sql.Connection;
import java.util.ArrayList;
import com.flipkart.bean.*;
import org.checkerframework.checker.units.qual.A;

public class AdminDao {
    public ArrayList<Gym> viewAllGyms(){
//        Connection conn = null;
//        PreparedStatement stmt = null;
//
//        try {
//            conn = DBUtils.getConnection();
//
//            stmt = conn.prepareStatement(SQLConstants.SQL_FETCH_ALL_GYM_QUERY_ADMIN);
//            ResultSet output = stmt.executeQuery();
//            List<String> headers = new ArrayList<>();
//            headers.add("Id");
//            headers.add("Name");
//            headers.add("Status");
//
//            if (output.next()) {
//                List<List> data = new ArrayList<>();
//                //data.add(List.of(output.getInt(1), output.getString(2), output.getString(5)));
//
//                do {
//                    data.add(List.of(output.getInt(1), output.getString(2), output.getString(5)));
//                    //System.out.println("\t" + output.getInt(1) + " \t " + output.getString(2)+ " \t\t" + output.getInt(5));
//                } while (output.next());
//                OutputFormatter.outputData(headers, data);
//            } else {
//                System.out.println("No gyms available");
//            }
//        } catch(Exception e) {
//            System.out.println(e);
//        }
        return new ArrayList<>();
    }
}
