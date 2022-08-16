package com.technogadgets.ph.Services;

import java.util.List;

import com.technogadgets.ph.model.ProductModel;


public interface ProductServices {
	
	//method in adding a products
	public void addProduct(ProductModel product);
	
	//get all list of products
	List<ProductModel> getAllProducts();
	
	//update a product
	ProductModel getProductsById(long id);
	
	//delete employee
	public void deleteProductById(long id);

}
