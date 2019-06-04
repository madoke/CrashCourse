package com.yurivalle.fleet.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

@Entity
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "licensePlate" }, name = "license_plate_exists"))
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String licensePlate;
	@Min(0)
	private Integer seats;
	@Past
	private LocalDate manufacturedOn;
	private Boolean active;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public LocalDate getManufacturedOn() {
		return manufacturedOn;
	}

	public void setManufacturedOn(LocalDate manufacturedOn) {
		this.manufacturedOn = manufacturedOn;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
