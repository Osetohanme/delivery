package Services;

import entities.Vehicle;

import java.util.List;

public interface VehicleService {

    Vehicle createVehicle(Vehicle vehicle);

    Vehicle updateVehicle(Long id, Vehicle vehicle);
    List<Vehicle> getAllVehicles();

    Vehicle getVehicleByPlateNumber(String number);
}
