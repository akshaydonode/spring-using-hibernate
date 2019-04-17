package com.capgemini.jpademo.service;

import com.capgemini.jpademo.entity.Person;

public interface PersonService {

	public void addNew(Person person);
	public Person findById(long id);
	
}
