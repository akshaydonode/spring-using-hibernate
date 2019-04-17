package com.capgemini.jpademo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jpademo.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Long>{

	
}
