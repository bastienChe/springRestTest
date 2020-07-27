package com.example.SpringRestServerTest.api;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.SpringRestServerTest.model.Person;
import com.example.SpringRestServerTest.service.PersonService;

public class PersonController {

	private final PersonService personService;

	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	public void addPerson(Person person) {
		personService.addPerson(person);
	}
	
}
