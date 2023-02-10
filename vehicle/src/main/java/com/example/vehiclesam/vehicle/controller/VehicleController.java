package com.example.vehiclesam.vehicle.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehiclesam.vehicle.domain.VehicleDomain;
import com.example.vehiclesam.vehicle.service.VehicleService;


@RestController
@Component
@RequestMapping("api")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/greeting/{name}")
	public VehicleDomain greeting(@PathVariable String name) {
		Map<String, String> hm = new HashMap<String, String>();
		VehicleDomain vehicleDomain = new VehicleDomain();
		vehicleDomain.setName(name);
		hm.put("Welcome to Vehicle application", name);
		return vehicleService.getname(vehicleDomain);
	}

}
