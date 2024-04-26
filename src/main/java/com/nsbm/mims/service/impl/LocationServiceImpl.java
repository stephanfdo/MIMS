package com.nsbm.mims.service.impl;

import com.nsbm.mims.model.Location;
import com.nsbm.mims.repository.LocationRepository;
import com.nsbm.mims.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    //create location
    @Override
    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }

    //view selected location
    @Override
    public Location getLocation(Long locationId) {
        return locationRepository.findById(locationId).orElse(null);
    }

    //update location details
    @Override
    public Location updateLocation(Long locationId, Location locationDetails) {
        Location location = getLocation(locationId);
        if (location == null)
            return null;

        // Update location details
        location.setName(locationDetails.getName());
        location.setDescription(locationDetails.getDescription());
        // Update other fields as needed

        return locationRepository.save(location);
    }

    //delete location
    @Override
    public void deleteLocation(Long locationId) {
        locationRepository.deleteById(locationId);
    }

    //view all details of location service
    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll(); // Assuming findAll() fetches all locations from the repository
    }
}
