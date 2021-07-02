package me.kodysimpson.springprofiles.services;

import me.kodysimpson.springprofiles.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublicTransportationService {

    private final VehicleProviderService vehicleProviderService;

    @Autowired
    //The train implementation should be provided since that is the active profile
    //and that will be the only Bean of the interface's type that will exist
    public PublicTransportationService(VehicleProviderService vehicleProviderService){
        this.vehicleProviderService = vehicleProviderService;
    }

    public Vehicle startTrip(){

        Vehicle vehicle = vehicleProviderService.getVehicle();

        System.out.println(vehicle.getType().toString() + " with registration (#" + vehicle.getRegistrationNumber().toString() + ") has left the station.");

        return vehicle;
    }

    public void endTrip(Vehicle vehicle){

        System.out.println(vehicle.getType().toString() + " with registration (#" + vehicle.getRegistrationNumber().toString() + ") has arrived at the destination.");

    }

}
