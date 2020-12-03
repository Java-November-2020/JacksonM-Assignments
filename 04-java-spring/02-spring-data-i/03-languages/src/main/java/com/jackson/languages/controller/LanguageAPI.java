package com.jackson.languages.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.languages.models.Language;
import com.jackson.languages.services.LanguageService;

@RestController
public class LanguageAPI {
	
	@Autowired
	private LanguageService lService;
	
	@GetMapping("/api/languages")
	public List<Language> allLanguages(){
		return this.lService.getAllLanguages();
	}
	
	@PostMapping("/api/languages")
	public Language createLanguage(Language lang) {
		return this.lService.createLanguage(lang);
	}
	
	@GetMapping("/api/languages/{id}")
	public Language getSpecificLanguage(@PathVariable("id") Long id) {
		return this.lService.findSpecificLanguage(id);
	}
	
	@PutMapping("/api/languages/{id}")
	public Language updateSpecificLanguage(@PathVariable("id") Long id, Language lang) {
		return this.lService.updateLanguage(lang);
	}
	
	@DeleteMapping("/api/languages/{id}")
	public void deleteLanguage(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
	}
		
}
