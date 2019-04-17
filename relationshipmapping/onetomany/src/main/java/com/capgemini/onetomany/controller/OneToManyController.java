package com.capgemini.onetomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetomany.dao.EmployeeDao;
import com.capgemini.onetomany.entity.Certificates;
import com.capgemini.onetomany.entity.Employee;
import com.capgemini.onetomany.service.EmployeeService;

@RestController
public class OneToManyController {

	@Autowired
	private EmployeeService service;

	

	@RequestMapping("/")
	public void addNew() {

		Set<Certificates> certificates = new HashSet();
		certificates.add(new Certificates(201, "JAVA"));
		certificates.add(new Certificates(202, "python"));

		Employee employee = new Employee(101, "AMD",certificates);

		/*
		 * Certificates certificates = new Certificates(301, "JAVA");
		 * certificates.setEmployee(employee); Certificates certificates1 = new
		 * Certificates(301, "Python"); certificates1.setEmployee(employee);
		 * 
		 * employee.getCertificates().add(certificates);
		 * employee.getCertificates().add(certificates1);
		 */
		service.addNew(employee);
	}

	@RequestMapping("new")
	public Employee findData() {
		Employee employee = service.findAll(101);
		return employee;
	}

}
