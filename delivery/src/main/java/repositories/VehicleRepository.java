package repositories;

import entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Query("SELECT status FROM Vehicle status WHERE status.status='IDLE'")
    List<Vehicle> getVehicleStatus();

    List<Vehicle> getVehiclesByCarryingWeightGreaterThan(float weight);
}
