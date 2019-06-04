package com.yurivalle.fleet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yurivalle.fleet.entity.Bus;
import com.yurivalle.fleet.repository.BusRepository;

@Service
public class BusServiceImp implements BusService {

	@Autowired
	private BusRepository repository;

	@Override
	public List<Bus> getAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Bus> get(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Bus add(Bus bus) {
		return repository.save(bus);
	}

	@Override
	public Bus edit(Bus bus) {
		return repository.save(bus);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
