package com.capgemini.jpademo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.jpademo.dao.PersonDao;
import com.capgemini.jpademo.entity.Person;
@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDao dao;
	
	@Override
	public void addNew(Person person) {
			dao.save(person);		
	}

	@Override
	public Person findById(long id) {
		Person person = dao.findById(id).get();
		return person;
	}

}
