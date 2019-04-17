package com.capgemini.inheritance.entity;

import javax.persistence.Entity;

@Entity
public class Person extends Employee{
	
	private int personSalry;
	private int personBonus;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int employeeId, String employeeName, int personSalry, int personBonus) {
		super(employeeId, employeeName);
		this.personSalry = personSalry;
		this.personBonus = personBonus;
	}
	public int getPersonSalry() {
		return personSalry;
	}
	public void setPersonSalry(int personSalry) {
		this.personSalry = personSalry;
	}
	public int getPersonBonus() {
		return personBonus;
	}
	public void setPersonBonus(int personBonus) {
		this.personBonus = personBonus;
	}
	@Override
	public String toString() {
		return "Person [personSalry=" + personSalry + ", personBonus=" + personBonus + "]";
	}
	
	
	

}
