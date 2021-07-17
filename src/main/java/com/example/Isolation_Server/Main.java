package com.example.Isolation_Server;

import com.example.Isolation_Server.Handlers.DBHandler;
import com.example.Isolation_Server.Handlers.DeSerializer;
import com.example.Isolation_Server.Handlers.Serializer;
import com.example.Isolation_Server.Models.Location;
import com.example.Isolation_Server.Resources.LocationDAOImpl;
import com.example.Isolation_Server.Services.LocationService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
//        DBHandler handler = new DBHandler();
//        LocationService lService = new LocationService();
        LocationDAOImpl locationDAOImpl = new LocationDAOImpl();
        LocationService locationService = new LocationService();

        String serializedLocationsString;
//        Location location = handler.ReadPosition();

//        Location location = new Location(55.31246, 11.24156);


//                Location location2 = handler.ReadPosition();
//        for (int i = 0; i < locations.size(); i++) {
//            System.out.println("Latitude: " +locations.indexOf(1).getLatitude() + " Longitude: " + locs.getLongitude());
//        }

        serializedLocationsString = locationService.GetSerializedLocations();

        System.out.println(serializedLocationsString);
//        for (String sLocation: serializedLocations) {
//            System.out.println("Serialized locations: " + sLocation);
//        }



    }
}
