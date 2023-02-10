package com.example.vehiclesam.vehicle.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vehiclesam.vehicle.domain.VehicleDomain;


@Repository
public interface VehicleRepo extends JpaRepository<VehicleDomain, Integer> {

	//public Map<String, String> getName();

}