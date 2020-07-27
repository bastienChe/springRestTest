package com.example.SpringRestServerTest.dao;

import java.util.UUID;

import com.example.SpringRestServerTest.model.Person;

public interface PersoneDAO {

	int insertPerson(UUID id, Person person) ;
	
	default int addPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
	}
	
}
