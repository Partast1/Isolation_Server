package com.example.Isolation_Server.Handlers;

import com.example.Isolation_Server.Models.Location;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Serializer {

    public String SerializeLocation(List<Location> locations){
        List<String> serializedLocations = new ArrayList<String>();
       String serializedLocationsString;


        serializedLocationsString = new Gson().toJson(locations);
//            for (Location location: locations) {
//
//                serializedLocations.add(gson.toJson(location));
//            }
            return serializedLocationsString;
    }
}
