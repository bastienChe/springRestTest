package com.example.SpringRestServerTest.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.SpringRestServerTest.model.Person;

public interface PersoneDAO {

	int insertPerson(UUID id, Person person) ;
	
	default int addPerson(Person person) {
		UUID id = UUID.randomUUID();
		return insertPerson(id, person);
		
	}

	Optional<Person> selectPersonById(UUID id);
	
	List<Person> selectAllPeople();
	
	int deletePersonById(UUID id);
	
	int updatePersonById(UUID id, Person person);
}
