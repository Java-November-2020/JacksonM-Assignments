package com.jackson.dojosandninjas.controllers;

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

import com.jackson.dojosandninjas.models.Dojo;
import com.jackson.dojosandninjas.services.DojoService;

@Controller
public class DojoController {

	@Autowired
	private DojoService dService;
	
	@GetMapping("/dojos")
	public String showAllDojos(Model model) {
		List<Dojo> allDojos = this.dService.findAllDojos();
		model.addAttribute("allDojos", allDojos);
		return "/dojo/dojos.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String createDojo(@ModelAttribute ("dojo") Dojo dojo, Model viewModel) {
		return "/dojo/newDojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createNewDojo(@Valid @ModelAttribute ("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result);
			return "dojo/newDojo.jsp";
		}else {
			this.dService.createNewDojo(dojo);
			return "redirect:/dojos";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String ninjaMembers(@PathVariable("id") Long id, Model viewModel) {
		Dojo dojo = this.dService.findSpecificDojo(id);
		
		viewModel.addAttribute("dojo", dojo);
		return "dojo/dojoPage.jsp";
	}
}
