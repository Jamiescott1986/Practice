package com.jamie.app.demo;

@org.springframework.stereotype.Service
public class Service {

    private Repo repo;

    public Service(Repo repo) {
        this.repo = repo;
    }

    public String saveVehicle(Vehicle vehicle) {
        repo.save(vehicle);
        return "Saved";
    }

    public Iterable<Vehicle> getAllVehicles() {
        return repo.findAll();
    }

    public String deleteVehicle(int vehicleNumber) {
        Vehicle deleteVehicle = repo.findById(vehicleNumber).get();
        repo.delete(deleteVehicle);
        return "Deleted Vehicle";
    }

    public String updateVehicle(int vehicleNumber, Vehicle vehicle) {
        Vehicle updateVehicle = repo.findById(vehicleNumber).get();
        updateVehicle.setVehicleNumber(vehicle.getVehicleNumber());
        updateVehicle.setSupplyGroupCode(vehicle.getSupplyGroupCode());
        updateVehicle.setNotionalDeliveryDate(vehicle.getNotionalDeliveryDate());
        repo.save(updateVehicle);
        return "Updated vehicle details";
    }
}
