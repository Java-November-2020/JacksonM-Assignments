package com.jackson.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jackson.dojosandninjas.models.Dojo;
import com.jackson.dojosandninjas.models.Ninja;
import com.jackson.dojosandninjas.services.NinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	private NinjaService nService;
	
	@GetMapping("/ninjas")
	public String showAllNinjas(Model model) {
		List<Ninja> allNinjas = this.nService.findAllNinjas();
		model.addAttribute("allNinjas", allNinjas);
		return "/ninja/ninjas.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String createNinja(@ModelAttribute("ninja")Ninja ninja, Model viewModel){
		List<Dojo> dojos = this.nService.findAllDojos();
		viewModel.addAttribute("dojos", dojos);
		return "ninja/newNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String createNewNinja(@Valid @ModelAttribute("ninja")Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "ninja/newNinja.jsp";
		}else {
			this.nService.createNewNinja(ninja);
			return "redirect:/ninjas";
		}
	}
}
