package com.localib.location;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocationService {
    List<Location> findAll();

    Location findById(String id);

    Location save(Location location);

    void deleteById(String id);

}
