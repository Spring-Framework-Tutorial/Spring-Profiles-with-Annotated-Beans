package me.kodysimpson.springprofiles.services;

import me.kodysimpson.springprofiles.model.Vehicle;
import me.kodysimpson.springprofiles.model.VehicleType;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Profile("train") //this bean will only be created by Spring when the train profile is active
public class TrainProviderServiceImpl implements VehicleProviderService{

    @Override
    public Vehicle getVehicle() {
        return new Vehicle(VehicleType.TRAIN, UUID.randomUUID());
    }

}
