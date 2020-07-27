package com.example.SpringRestServerTest.api;

import com.example.SpringRestServerTest.model.Person;
import com.example.SpringRestServerTest.service.PersonService;

public class PersonController {

	private final PersonService personService;

	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	public void addPerson(Person person) {
		personService.addPerson(person);
	}
	
}
