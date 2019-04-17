package com.capgemini.onetomany.service;

import com.capgemini.onetomany.entity.Employee;

public interface EmployeeService {

	public void addNew(Employee employee);
	public Employee findAll(int id);
	
}
