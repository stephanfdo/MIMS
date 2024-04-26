package com.nsbm.mims.service;

import com.nsbm.mims.model.Location;

import java.util.List;

//location services
public interface LocationService {
    Location createLocation(Location location);
    Location getLocation(Long locationId);
    Location updateLocation(Long locationId, Location locationDetails);
    void deleteLocation(Long locationId);
    List<Location> getAllLocations();
}