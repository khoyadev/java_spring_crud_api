package com.simplon.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplon.crud.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);

}
