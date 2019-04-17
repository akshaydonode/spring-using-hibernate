package com.capgemini.onetoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.onetoone.dao.OneToOneDao;
import com.capgemini.onetoone.entity.Person;
import com.capgemini.onetoone.entity.Profile;

@RestController
public class OneToOneController {

	@Autowired
	private OneToOneDao dao;
	
	
	@RequestMapping("/")
	public void addNew() {
		Person person= new Person(101,"AMD",new Profile(11,"COMP"));
		
		//Profile profile = new Profile(11,"COMP");
		
		dao.save(person);
		//dao.save(profile);
	}
	
	@RequestMapping("/new")
	public Person findAll() {
		Person person = dao.findById(101).get();
		return person;
		
	}
}
