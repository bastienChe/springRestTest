package com.example.SpringRestServerTest.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.SpringRestServerTest.model.Person;

@Repository("postgres")
public class PersonDataAccessService implements PersoneDAO{

	@Override
	public int insertPerson(UUID id, Person person) {
		return 0;
	}

	@Override
	public Optional<Person> selectPersonById(UUID id) {
		return Optional.empty();
	}

	@Override
	public List<Person> selectAllPeople() {
		List<Person> myList = new ArrayList<>();
		myList.add(new Person(UUID.randomUUID(), "From Postgres DB"));
		return myList;
	}

	@Override
	public int deletePersonById(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePersonById(UUID id, Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

}
