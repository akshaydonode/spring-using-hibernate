package com.capgemini.jpademo.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.jpademo.dao.PersonDao;
import com.capgemini.jpademo.entity.Person;
import com.capgemini.jpademo.service.PersonService;

@RestController
public class PersonController {
	
	/*
	 * @Autowired private PersonDao dao;
	 */
	@Autowired
	private PersonService service;
	
	
	@RequestMapping("/")
	public void setPerson() {
		Person person= new Person(101,"AMD");
		service.addNew(person);
	}
	@RequestMapping("/new")
	public Person getPerson() {

		Person person = service.findById(101);
		return person;
	}

}
