package com.example.vehiclesam.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan
@EnableAutoConfiguration
@Configuration
@EnableJpaRepositories("com.example.vehiclesam.vehicle.repo.VehicleRepo")
public class VehicleApplication {

/*	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/greeting/{name}")
	public Map<String, String> greeting(@PathVariable String name) {
		
		Map<String, String> hm = new HashMap<String, String>();
		
		hm.put("Welcome to Vehicle application", name);
		
		return hm;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(VehicleApplication.class, args);
	}

}
