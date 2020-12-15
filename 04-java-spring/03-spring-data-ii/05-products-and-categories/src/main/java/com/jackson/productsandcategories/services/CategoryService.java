package com.jackson.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.productsandcategories.models.Category;
import com.jackson.productsandcategories.models.Product;
import com.jackson.productsandcategories.repositories.CategoryRepository;
import com.jackson.productsandcategories.repositories.ProductRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cRepo;
	@Autowired
	private ProductRepository pRepo;

	//Create a new category
	public Category newCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	//Find a specific category
	public Category findSpecificCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	//See all categories
	public List<Category> findAllCategory(){
		return this.cRepo.findAll();
	}
	
	
	//Add product into category
	public void addProduct(Product product, Category category) {
		//Get the list of Products from category
		List<Product> products = category.getProducts();
		//Add the product
		products.add(product);
		//update the DB
		this.cRepo.save(category);
	}
	
	//Find Products not in Categories
	public List<Product> findProductsNotInCategory(Category category){
		return this.pRepo.findByCategoriesNotContains(category);
	}
}
