package com.jackson.drivinglicense.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.drivinglicense.models.License;
import com.jackson.drivinglicense.models.Person;
import com.jackson.drivinglicense.repositories.LicenseRepository;
import com.jackson.drivinglicense.repositories.PersonRepository;

@Service
public class PersonLicenseService {
	
	@Autowired
	private PersonRepository pRepo;
	@Autowired
	private LicenseRepository lRepo;
	
	//Create a person
	public Person createPerson (Person person) {
		return this.pRepo.save(person);
	}
	
	//Generate the number before creating a license
	public int generateNumber() {
		License license = this.lRepo.findTopByOrderByIdDesc();
		if (license == null) {
			return 1;
		}else {
			int largestNumber = license.getNumber();
			largestNumber++;
			return largestNumber;
		}
	}
	
	//Create a license
	public License createLicense (License license) {
		license.setNumber(this.generateNumber());
		return this.lRepo.save(license);
	}
	
	//Find all persons
	public List<Person> findAllPersons(){
		return this.pRepo.findAll();
	}
	
	//Find all Licenses
	public List<License> findAllLicenses(){
		return this.lRepo.findAll();
	}
	
	//Find a specific person
	public Person findSpecificPerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	//Find a specific license
	public License findSpecificLicense(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}

}
