package com.example.vehiclesam.vehicle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehiclesam.vehicle.domain.VehicleDomain;
import com.example.vehiclesam.vehicle.repository.VehicleRepo;


@Service
//@EnableJpaRepositories("com.example.vehiclesam.vehicle.repo")
public class VehicleService {
	
	@Autowired
	private VehicleRepo vehicleRepo;
	
	//@Transactional
	public VehicleDomain getname(VehicleDomain vehicleDomain) {
		
		return vehicleRepo.save(vehicleDomain);
	}

}
