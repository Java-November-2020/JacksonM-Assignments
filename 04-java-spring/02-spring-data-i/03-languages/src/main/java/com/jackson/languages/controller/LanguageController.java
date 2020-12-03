package com.jackson.languages.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.jackson.languages.models.Language;
import com.jackson.languages.services.LanguageService;

@Controller
public class LanguageController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("/languages")
	public String allLanguages(Model viewModel) {
		List<Language> AllLang = this.lService.getAllLanguages();
		viewModel.addAttribute("language",new Language());
		viewModel.addAttribute("allLang", AllLang);
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Language> AllLang = this.lService.getAllLanguages();
			model.addAttribute("allLang", AllLang);
			return "index.jsp";
		}
		this.lService.createLanguage(language);
		return "redirect:/languages";
	}
	
	@GetMapping("/languages/{id}")
	public String findLanguage(@PathVariable("id") Long id, Model viewModel) {
		Language findLang = this.lService.findSpecificLanguage(id);
		viewModel.addAttribute("lang", findLang);
		return "name.jsp";
	}
	
	@GetMapping("/languages/edit/{id}")
	public String editLanguage(@PathVariable("id")Long id, Model viewModel) {
		Language editLang = this.lService.findSpecificLanguage(id);
		viewModel.addAttribute("language",editLang);
		viewModel.addAttribute("lang", editLang);
		return "edit.jsp";
	}
	
	@PostMapping("/languages/edit/{id}")
	public String updateLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result1, Model model,@PathVariable("id")Long id, @RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("currentVersion")String currentVersion) {
		if(result1.hasErrors()) {
			return "edit.jsp";
		}
		Language updateLanguage = this.lService.findSpecificLanguage(id);
		updateLanguage.setCreator(creator);
		updateLanguage.setName(name);
		updateLanguage.setCurrentVersion(currentVersion);
		this.lService.updateLanguage(updateLanguage);
		model.addAttribute("language", updateLanguage);
		return "redirect:/languages";
	}
	
	@GetMapping("/languages/delete/{id}")
	public String deleteLang(@PathVariable("id")Long id) {
		this.lService.deleteLanguage(id);
		return "redirect:/languages";
	}
}