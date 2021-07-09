package com.example.Isolation_Server.DAO;

import com.example.Isolation_Server.Models.Location;
import java.util.List;

public interface LocationDAO {
    List<Location> getAllLocations();
     Location getLocation(int rollNo);
     void updateLocation(Location location);
     void deleteLocation(Location location);
}
