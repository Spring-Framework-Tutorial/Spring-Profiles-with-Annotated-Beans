package me.kodysimpson.springprofiles.services;

import me.kodysimpson.springprofiles.model.Vehicle;
import me.kodysimpson.springprofiles.model.VehicleType;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Profile({"bus", "default"}) //you can have it set for multiple profiles, "default" is used for when no profile is specified
public class BusProviderServiceImpl implements VehicleProviderService {

    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.BUS, UUID.randomUUID());
    }

}