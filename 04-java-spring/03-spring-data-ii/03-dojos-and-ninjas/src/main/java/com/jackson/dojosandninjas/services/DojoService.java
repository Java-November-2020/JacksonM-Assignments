package com.jackson.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.dojosandninjas.models.Dojo;
import com.jackson.dojosandninjas.repositories.DojoRepositories;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepositories dRepo;
	
	//Create a New Dojo
	public Dojo createNewDojo (Dojo dojo) {
		return this.dRepo.save(dojo);
	}
	
	//Show all Dojos
	public List<Dojo> findAllDojos(){
		return this.dRepo.findAll();
	}
	
	//Find a specific Dojo
	public Dojo findSpecificDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}

}
