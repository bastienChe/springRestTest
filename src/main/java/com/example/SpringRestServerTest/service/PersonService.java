package com.example.SpringRestServerTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.SpringRestServerTest.dao.PersoneDAO;
import com.example.SpringRestServerTest.model.Person;

@Service
public class PersonService {

	private final PersoneDAO personDao;
	
	@Autowired
	public PersonService(@Qualifier("fakeDao") PersoneDAO personDao) {
		this.personDao = personDao;
	}
	
	public int addPerson(Person person) {
		return personDao.addPerson(person);
	}
	
}
