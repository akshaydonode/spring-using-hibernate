package com.capgemini.manytomany.service;

import java.util.Set;

import com.capgemini.manytomany.entity.Employee;
import com.capgemini.manytomany.entity.Project;


public interface EmployeeService {

	public void addEmployee(Set<Employee> employee);
	
	public void addProject(Set<Project> project);
	
	public Employee findDetails(int id);
}
