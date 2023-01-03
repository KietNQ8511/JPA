package com.udacity.jdnd.course3.critter.entitty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Customer extends User {
	private String notes;
	private String phone;

	@OneToMany(mappedBy = "customer")
	private List<Pet> pets;

	public Customer(String name, String phone, String notes) {
		super(name);
		this.phone = phone;
		this.notes = notes;
	}

	public Customer() {

	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void addPet(Pet pet) {
		if (pets == null)
			pets = new ArrayList<Pet>();
		pets.add(pet);
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
}
