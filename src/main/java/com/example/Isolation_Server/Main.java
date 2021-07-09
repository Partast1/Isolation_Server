package com.example.Isolation_Server;

import com.example.Isolation_Server.Handlers.DBHandler;
import com.example.Isolation_Server.Models.Location;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        DBHandler handler = new DBHandler();
        List<Location> locations = new ArrayList<Location>();
//        Location location = handler.ReadPosition();

        Location location = new Location(55.31246, 11.24156);
               locations = handler.ReadPositions();

                Location location2 = handler.ReadPosition();
//        for (int i = 0; i < locations.size(); i++) {
//            System.out.println("Latitude: " +locations.indexOf(1).getLatitude() + " Longitude: " + locs.getLongitude());
//        }
        for (Location locs: locations) {

            System.out.println("Latitude: " +locs.getLatitude() + " Longitude: " + locs.getLongitude());


        }



    }
}
