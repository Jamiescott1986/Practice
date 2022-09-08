package com.jamie.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jamie.app.demo.Vehicle;

@RestController
@RequestMapping(path = "/database")
public class Controller {
    @Autowired
    private Service service;

    @PostMapping(path = "/vehicle")
    public String saveVehicle(@RequestBody Vehicle vehicle) {

        return service.saveVehicle(vehicle);
    }

    @GetMapping(path = "/vehicle")
    public @ResponseBody Iterable<Vehicle> getAllVehicles() {

        return service.getAllVehicles();
    }

    @DeleteMapping(path = "/vehicle/{vehicleNumber}")
    public String deleteVehicle(@PathVariable int vehicleNumber){

        return service.deleteVehicle(vehicleNumber);
    }

    @PutMapping(path = "/vehicle/{vehicleNumber}")
    public String updateVehicle(@PathVariable int vehicleNumber, @RequestBody Vehicle vehicle) {

        return service.updateVehicle(vehicleNumber, vehicle);
    }
}

