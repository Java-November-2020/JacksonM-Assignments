package com.jackson.productsandcategories.controllers;

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

import com.jackson.productsandcategories.models.Category;
import com.jackson.productsandcategories.models.Product;
import com.jackson.productsandcategories.services.CategoryService;
import com.jackson.productsandcategories.services.ProductService;

@Controller
public class PCController {
	
	@Autowired
	private ProductService pService;
	@Autowired
	private CategoryService cService;
	
	//Show all products
	@GetMapping("/products")
	public String showAllProducts(Model viewModel) {
		List<Product> products = this.pService.findAllProducts();
		viewModel.addAttribute("products", products);
		return "/products/all.jsp";
	}
	
	//Show all categories
	@GetMapping("/categories")
	public String showAllCategories(Model viewModel) {
		List<Category> categories = this.cService.findAllCategory();
		viewModel.addAttribute("categories", categories);
		return "/categories/all.jsp";
	}
	
	
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "/products/new.jsp";
	}
	
	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "/categories/new.jsp";
	}
	
	@PostMapping("/products/new")
	public String createNewProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "/products/new.jsp";
		}else {
			this.pService.newProduct(product);
			return "redirect:/products";
		}
	}
	
	@PostMapping("/categories/new")
	public String createNewCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "/categories/new.jsp";
		}else {
			this.cService.newCategory(category);
			return "redirect:/categories";
		}
	}
	
	@GetMapping("/categories/{id}")
	public String getProductInfo(@PathVariable("id")Long id, Model viewModel) {
		Category category = this.cService.findSpecificCategory(id);
		List<Product> noProducts = this.cService.findProductsNotInCategory(category);
		viewModel.addAttribute("category", category);
		viewModel.addAttribute("noProducts", noProducts);
		return "/categories/info.jsp";
	}
	
	@GetMapping("/products/{id}")
	public String getCategoryInfo(@PathVariable("id")Long id, Model viewModel) {
		Product product = this.pService.findSpecificProduct(id);
		List<Category> noCategories = this.pService.findCategoriesNotInProducts(product);
		viewModel.addAttribute("product", product);
		viewModel.addAttribute("noCategories", noCategories);
		return "/products/info.jsp";
	}
	
	@PostMapping("/products/add/{id}")
	public String addCategory(@PathVariable("id") Long id,@RequestParam("category") Long catId) {
		Product product = this.pService.findSpecificProduct(id);
		Category category = this.cService.findSpecificCategory(catId);
		this.pService.addCategory(category, product);
		return "redirect:/products/{id}";
	}
	@PostMapping("/category/add/{id}")
	public String addProduct(@PathVariable("id") Long id,@RequestParam("product") Long prodId) {
		Product product = this.pService.findSpecificProduct(prodId);
		Category category = this.cService.findSpecificCategory(id);
		this.cService.addProduct(product, category);
		return "redirect:/categories/{id}";
	}
}
