package com.capgemini.onetomany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {

	@Id
	private int employeeId;
	private String employeeName;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Certificates> certificates;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, Set<Certificates> certificates2) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.certificates = certificates2;
	}

	public int getPersonId() {
		return employeeId;
	}

	public void setPersonId(int personId) {
		this.employeeId = personId;
	}

	public String getPersonName() {
		return employeeName;
	}

	public void setPersonName(String personName) {
		this.employeeName = personName;
	}

	public Set<Certificates> getCertificates() {
		return certificates;
	}

	public void setCertificates(Set<Certificates> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", certificates="
				+ certificates + "]";
	}

	

}
