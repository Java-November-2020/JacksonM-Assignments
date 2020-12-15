package com.jackson.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.productsandcategories.models.Category;
import com.jackson.productsandcategories.models.Product;
import com.jackson.productsandcategories.repositories.CategoryRepository;
import com.jackson.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	@Autowired
	private CategoryRepository cRepo;
	
	//Create a new product
	public Product newProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	//Find a specific product
	public Product findSpecificProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	//See all products
	public List<Product> findAllProducts(){
		return this.pRepo.findAll();
	}
	
	//Add category into product
	public void addCategory(Category category, Product product) {
		//Get the list of categories from the Product Object
		List<Category> categories = product.getCategories();
		//Add the category
		categories.add(category);
		//Update the DB
		this.pRepo.save(product);
	}
	
	//Find Categories not in Products
	public List<Category> findCategoriesNotInProducts(Product product){
		return this.cRepo.findByProductsNotContains(product);
	}

}
