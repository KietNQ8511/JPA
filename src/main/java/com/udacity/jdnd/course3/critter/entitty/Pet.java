package com.udacity.jdnd.course3.critter.entitty;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.udacity.jdnd.course3.critter.pet.PetType;

@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private PetType type;
	private String name;
	private LocalDate birthDate;
	private String notes;

	@ManyToOne
	private Customer customer;

	public Pet(PetType type, String name, LocalDate birthDate, String notes, Customer customer) {
		super();
		this.type = type;
		this.name = name;
		this.birthDate = birthDate;
		this.notes = notes;
		this.customer = customer;
	}
	
	public Pet() {

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PetType getType() {
		return type;
	}

	public void setType(PetType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
