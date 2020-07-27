package com.example.SpringRestServerTest.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.SpringRestServerTest.dao.PersoneDAO;
import com.example.SpringRestServerTest.model.Person;

@Service
public class PersonService {

	private final PersoneDAO personDao;
	
	@Autowired
	public PersonService(@Qualifier("postgres") PersoneDAO personDao) {
		this.personDao = personDao;
	}
	
	public int addPerson(Person person) {
		return personDao.addPerson(person);
	}
	
	public List<Person> getAllPeople(){
		return personDao.selectAllPeople();
	}
	
	public Optional<Person> getPersonById(UUID id) {
		return personDao.selectPersonById(id);
	}
	
	public int deletePerson(UUID id) {
		return personDao.deletePersonById(id);
	}
	
	public int updatePerson(UUID id, Person person) {
		return personDao.updatePersonById(id, person);
	}
	
}
