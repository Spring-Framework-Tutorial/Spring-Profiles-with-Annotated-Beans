package me.kodysimpson.springprofiles;

import me.kodysimpson.springprofiles.model.Vehicle;
import me.kodysimpson.springprofiles.services.PublicTransportationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProfilesApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringProfilesApplication.class, args);

		PublicTransportationService publicTransporationService = context.getBean(PublicTransportationService.class);
		Vehicle vehicle = publicTransporationService.startTrip();
		publicTransporationService.endTrip(vehicle);
	}

}