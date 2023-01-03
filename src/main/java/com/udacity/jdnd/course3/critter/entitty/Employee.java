package com.udacity.jdnd.course3.critter.entitty;

import javax.persistence.Entity;

@Entity
public class Employee extends User {
	private String employeeSkills;
	private String daysAvailable;

	public Employee(String name, String employeeSkills, String daysAvailable) {
		super(name);
		this.employeeSkills = employeeSkills;
		this.daysAvailable = daysAvailable;
	}

	public Employee() {

	}

	public String getEmployeeSkills() {
		return employeeSkills;
	}

	public void setEmployeeSkills(String employeeSkills) {
		this.employeeSkills = employeeSkills;
	}

	public String getdaysAvailable() {
		return daysAvailable;
	}

	public void setdaysAvailable(String daysAvailable) {
		this.daysAvailable = daysAvailable;
	}

}
