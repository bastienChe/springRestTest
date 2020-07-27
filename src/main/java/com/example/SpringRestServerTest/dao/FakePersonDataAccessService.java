package com.example.SpringRestServerTest.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.SpringRestServerTest.model.Person;

public class FakePersonDataAccessService implements PersoneDAO{

	private static List<Person> DB = new ArrayList<>();
	
	@Override
	public int insertPerson(UUID id, Person person) {
		DB.add(new Person(id, person.getName()));
		return 1;
	}

}
