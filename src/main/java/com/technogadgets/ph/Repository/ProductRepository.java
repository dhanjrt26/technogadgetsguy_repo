package com.technogadgets.ph.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technogadgets.ph.model.ProductModel;


public interface ProductRepository extends JpaRepository<ProductModel, Long> {

}
