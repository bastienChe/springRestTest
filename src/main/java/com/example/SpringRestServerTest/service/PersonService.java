package com.example.SpringRestServerTest.service;

import com.example.SpringRestServerTest.dao.PersoneDAO;
import com.example.SpringRestServerTest.model.Person;

public class PersonService {

	private final PersoneDAO personDao;
	
	public PersonService(PersoneDAO personDao) {
		this.personDao = personDao;
	}
	
	public int addPerson(Person person) {
		return personDao.addPerson(person);
	}
	
}
