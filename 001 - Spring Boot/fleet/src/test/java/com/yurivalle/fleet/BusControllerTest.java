package com.yurivalle.fleet;

import java.time.LocalDate;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.yurivalle.fleet.entity.Bus;

public class BusControllerTest {

	@Test
	public void createBus() throws JsonProcessingException {
		Bus bus = new Bus();
		bus.setActive(true);
		bus.setId(1);
		bus.setLicensePlate("ZX-26-JA");
		bus.setManufacturedOn(LocalDate.now());
		bus.setSeats(28);
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		System.out.println(mapper.writeValueAsString(bus));
	}
}
