package com.jackson.drivinglicense.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.drivinglicense.models.License;
import com.jackson.drivinglicense.models.Person;
import com.jackson.drivinglicense.services.PersonLicenseService;

@RestController
public class APIControllers {
	
	@Autowired
	private PersonLicenseService plService;
	
	@GetMapping("/api/persons")
	public List<Person> findAllPersons(){
		return this.plService.findAllPersons();
	}
	
	@GetMapping("/api/licenses")
	public List<License> findAllLicenses(){
		return this.plService.findAllLicenses();
	}
	
	@PostMapping("/api/persons/new")
	public Person createNewPerson(Person person) {
		return this.plService.createPerson(person);
	}
	
	@PostMapping("/api/licenses/new")
	public License createNewLicense(License license) {
		return this.plService.createLicense(license);
	}
	
	@GetMapping("/api/persons/{id}")
	public Person findSpecificPerson(@PathVariable("id") Long id) {
		return this.plService.findSpecificPerson(id);
	}

}
