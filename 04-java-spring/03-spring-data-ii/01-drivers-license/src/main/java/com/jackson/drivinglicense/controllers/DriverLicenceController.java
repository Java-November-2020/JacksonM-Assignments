package com.jackson.drivinglicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jackson.drivinglicense.models.License;
import com.jackson.drivinglicense.models.Person;
import com.jackson.drivinglicense.services.PersonLicenseService;

@Controller
public class DriverLicenceController {
	
	@Autowired
	private PersonLicenseService plService;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Person> persons = this.plService.findAllPersons();
		model.addAttribute("persons", persons);
		return "index.jsp";
	}
	
	@GetMapping("/persons/new")
	public String createNewPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		return "new.jsp";
	}
	
	@PostMapping(value="/persons/new")
	public String CreatePerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "new.jsp";
		}else {
			this.plService.createPerson(person);
			return "redirect:/";
		}
	}
	
	@GetMapping("/licenses/new")
	public String createNewLicense(@Valid @ModelAttribute("license")License license, BindingResult result, Model viewModel) {
		List<Person> persons = this.plService.findAllPersons();
		viewModel.addAttribute("persons", persons);
		return "license.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String CreateLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
			return "license.jsp";
		}else {
			this.plService.createLicense(license);
			return "redirect:/";
		}
	}
	
	@GetMapping("/licenses/{id}")
	public String getLicense(@PathVariable("id") Long id, Model viewModel) {
		License license = this.plService.findSpecificLicense(id);
		viewModel.addAttribute("license", license);
		return "viewLicense.jsp";
	}
	
	@GetMapping("/persons/{id}")
	public String getPerson(@PathVariable("id") Long id, Model viewModel) {
		Person person = this.plService.findSpecificPerson(id);
		viewModel.addAttribute("person", person);
		return "viewPerson.jsp";
	}

}
