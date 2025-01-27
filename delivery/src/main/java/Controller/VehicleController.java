package Controller;

import Services.VehicleService;
import entities.Vehicle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/vehicle")

public class VehicleController {

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    private VehicleService vehicleService;
    @PostMapping("/create-vehicle")
    ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle){
        vehicleService.createVehicle(vehicle);
        System.out.println(vehicle);

        return ResponseEntity.ok(vehicle);

    }
}
