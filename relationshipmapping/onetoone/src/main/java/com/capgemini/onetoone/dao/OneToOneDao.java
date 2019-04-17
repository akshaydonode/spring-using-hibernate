package com.capgemini.onetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onetoone.entity.Person;

@Repository
public interface OneToOneDao extends JpaRepository<Person, Integer> {

}
