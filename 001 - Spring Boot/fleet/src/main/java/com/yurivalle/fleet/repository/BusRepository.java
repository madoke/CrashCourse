package com.yurivalle.fleet.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.yurivalle.fleet.entity.Bus;

public interface BusRepository extends CrudRepository<Bus, Integer> {

	Optional<Bus> findByLicensePlate(String licensePlate);
	
	List<Bus> findAll();

}