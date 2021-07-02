package me.kodysimpson.springprofiles.services;

import me.kodysimpson.springprofiles.model.Vehicle;
import me.kodysimpson.springprofiles.model.VehicleType;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Profile("taxi") //this bean will only be created by Spring when the taxi profile is active
public class TaxiProviderServiceImpl implements VehicleProviderService{

    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.TAXI, UUID.randomUUID());
    }

}
