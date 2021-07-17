package com.example.Isolation_Server.Services;

import com.example.Isolation_Server.Handlers.Serializer;
import com.example.Isolation_Server.Models.Location;
import com.example.Isolation_Server.Resources.LocationDAOImpl;

import java.util.ArrayList;
import java.util.List;

public class LocationService {

    public String GetSerializedLocations(){
        LocationDAOImpl locationDAOImpl = new LocationDAOImpl();
        Serializer serializer = new Serializer();

        List<Location> locations = new ArrayList<Location>();
        List<String> serializedLocations = new ArrayList<String>();
        String serializedLocationsString = null;
        try {
            locations = locationDAOImpl.getAllLocations();

            serializedLocationsString = serializer.SerializeLocation(locations); 
        }catch (Exception e)
        {}
        finally
        {
            return serializedLocationsString;
        }

    

    }
}
