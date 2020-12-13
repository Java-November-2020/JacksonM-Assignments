package com.jackson.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.dojosandninjas.models.Dojo;
import com.jackson.dojosandninjas.models.Ninja;
import com.jackson.dojosandninjas.repositories.DojoRepositories;
import com.jackson.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepository nRepo;
	@Autowired
	private DojoRepositories dRepo;
	
	//Create a New Ninja
	public Ninja createNewNinja(Ninja ninja) {
		return this.nRepo.save(ninja);
	}
	
	//Show all Ninjas
	public List<Ninja> findAllNinjas(){
		return this.nRepo.findAll();
	}
	
	//Find all Dojos
	public List<Dojo> findAllDojos(){
		return this.dRepo.findAll();
	}
	
	//Find a specific Ninja
	public Ninja findSpecificNinja(Long id) {
		return this.nRepo.findById(id).orElse(null);
	}
}
