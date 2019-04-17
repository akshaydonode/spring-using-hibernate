package com.capgemini.inheritance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inheritance.dao.EmployeeDao;

import com.capgemini.inheritance.entity.*;

@RestController
public class PersonController {
	
	@Autowired
	private EmployeeDao dao;
	
	@RequestMapping("/")
	public void add() {	
		Employee employee= new Person(101, "AMMD", 20000, 1000);
		dao.save(employee);
	}

	@RequestMapping("/new")
	public Employee getDetails() {	
		return dao.findById(101).get();
	}
}
