package com.yurivalle.fleet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yurivalle.fleet.entity.Bus;
import com.yurivalle.fleet.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {

	@Autowired
	private BusService service;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Bus> getAllBuses() {
		return service.getAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Optional<Bus> getBus(@RequestParam Integer id) {
		return service.get(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Bus addBus(@RequestBody Bus bus) {
		return service.add(bus);
	}

	@RequestMapping(value = "/", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Bus editBus(@RequestBody Bus bus) {
		return service.edit(bus);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void editBus(@RequestParam Integer id) {
		service.delete(id);
	}
}