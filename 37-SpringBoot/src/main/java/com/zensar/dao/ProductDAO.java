package com.zensar.dao;



import org.springframework.data.jpa.repository.JpaRepository;



import com.zensar.bean.Product;



public interface ProductDAO extends JpaRepository<Product, Integer>{



}