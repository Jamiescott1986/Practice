package com.jamie.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jamie.app.demo.Vehicle;

@RestController
@RequestMapping(path = "/database")
public class Controller {
    @Autowired

    private Repo repo;

    @PostMapping(path = "/vehicle")
    public String saveVehicle(@RequestBody Vehicle vehicle) {
        repo.save(vehicle);
        return "Saved";
    }

    @GetMapping(path = "/vehicle")
    public @ResponseBody Iterable<Vehicle> getAllVehicles() {
        return repo.findAll();
    }

    @DeleteMapping(path = "/vehicle/{vehicleNumber}")
    public String deleteVehicle(@PathVariable int vehicleNumber){
        Vehicle deleteVehicle = repo.findById(vehicleNumber).get();
        repo.delete(deleteVehicle);
        return "Deleted Vehicle";
    }

    @PutMapping(path = "/vehicle/{vehicleNumber}")
    public String updateVehicle(@PathVariable int vehicleNumber, @RequestBody Vehicle vehicle) {
        Vehicle updateVehicle = repo.findById(vehicleNumber).get();
        updateVehicle.setVehicleNumber(vehicle.getVehicleNumber());
        updateVehicle.setSupplyGroupCode(vehicle.getSupplyGroupCode());
        updateVehicle.setNotionalDeliveryDate(vehicle.getNotionalDeliveryDate());
        repo.save(updateVehicle);
        return "Updated vehicle details";
    }
}

