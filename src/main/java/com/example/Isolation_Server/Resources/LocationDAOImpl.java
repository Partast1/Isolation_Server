package com.example.Isolation_Server.Resources;

import com.example.Isolation_Server.DAO.LocationDAO;
import com.example.Isolation_Server.Handlers.DBHandler;
import com.example.Isolation_Server.Models.Location;

import java.util.ArrayList;
import java.util.List;

public class LocationDAOImpl implements LocationDAO {
    DBHandler dbHandler = new DBHandler();
    @Override
    public List<Location> getAllLocations() {
        List<Location> locations = new ArrayList<>();
        try {
            locations = dbHandler.ReadPositions();

        }
        catch(Exception e){ System.out.println(e);}
        finally{
            return locations;
        }



    }

    @Override
    public Location getLocation(int rollNo) {
        return null;
    }

    @Override
    public void updateLocation(Location location) {

    }

    @Override
    public void deleteLocation(Location location) {

    }
}
