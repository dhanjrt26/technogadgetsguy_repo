package com.technogadgets.ph.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.technogadgets.ph.Repository.ProductRepository;
import com.technogadgets.ph.model.ProductModel;



@Service
public class ProductServicesImpl implements ProductServices{
	
	@Autowired
	private ProductRepository productRepository;
	

	@Override
	public void addProduct(ProductModel product) {
		// TODO Auto-generated method stub
		//this method is used to add products
		this.productRepository.save(product);
		
	}

	@Override
	public List<ProductModel> getAllProducts() {
		// TODO Auto-generated method stub
		//this method is used to get all the list of products in the database
		return productRepository.findAll();
	}

	@Override
	public ProductModel getProductsById(long id) {
		// TODO Auto-generated method stub
		//this method is used to get a product using the id
		Optional <ProductModel > optional = productRepository.findById(id);
		ProductModel employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
	}

	@Override
	public void deleteProductById(long id) {
		// TODO Auto-generated method stub
		//this method is used to delete a product in the database list
		this.productRepository.deleteById(id);
	}


}
