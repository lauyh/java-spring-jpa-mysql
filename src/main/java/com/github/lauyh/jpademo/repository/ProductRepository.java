package com.github.lauyh.jpademo.repository;

import com.github.lauyh.jpademo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
