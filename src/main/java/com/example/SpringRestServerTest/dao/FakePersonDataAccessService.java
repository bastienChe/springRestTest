package com.example.SpringRestServerTest.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.SpringRestServerTest.model.Person;

@Repository("FakeDao")
public class FakePersonDataAccessService implements PersoneDAO{

	private static List<Person> DB = new ArrayList<>();
	
	@Override
	public int insertPerson(UUID id, Person person) {
		DB.add(new Person(id, person.getName()));
		return 1;
	}

}
