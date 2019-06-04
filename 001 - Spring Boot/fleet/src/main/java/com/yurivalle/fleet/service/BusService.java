package com.yurivalle.fleet.service;

import java.util.List;
import java.util.Optional;

import com.yurivalle.fleet.entity.Bus;

public interface BusService {
	List<Bus> getAll();

	Optional<Bus> get(Integer id);

	Bus add(Bus bus);

	Bus edit(Bus bus);

	void delete(Integer id);
}
