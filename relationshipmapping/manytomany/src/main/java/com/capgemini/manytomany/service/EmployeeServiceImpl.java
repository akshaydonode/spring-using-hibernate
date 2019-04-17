package com.capgemini.manytomany.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.manytomany.dao.EmployeeDao;
import com.capgemini.manytomany.dao.ProjectDao;
import com.capgemini.manytomany.entity.Employee;
import com.capgemini.manytomany.entity.Project;

@Service
public class EmployeeServiceImpl implements EmployeeService{


	@Autowired
	private EmployeeDao empDao;
	
	@Autowired
	private ProjectDao prjDao;

	@Override
	public void addEmployee(Set<Employee> employee) {
		empDao.saveAll(employee);
	}

	@Override
	public void addProject(Set<Project> project) {
		prjDao.saveAll(project);
	}

	@Override
	public Employee findDetails(int id) {
		Employee employee =empDao.findById(id).get();
		return employee;
	}
	
	
	

	

}
