package com.jackson.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jackson.languages.models.Language;
import com.jackson.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	private LanguageRepository lRepo;
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	
	//Get all languages
	public List<Language> getAllLanguages(){
		return this.lRepo.findAll();
	}
	
	//Create a language
	public Language createLanguage(Language lang) {
		return this.lRepo.save(lang);
	}
	
	//Find a specific Language
	public Language findSpecificLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	//Update a language
	public Language updateLanguage(Language updateLang) {
		return this.lRepo.save(updateLang);
	}
	
	//Delete a language
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
	
}
