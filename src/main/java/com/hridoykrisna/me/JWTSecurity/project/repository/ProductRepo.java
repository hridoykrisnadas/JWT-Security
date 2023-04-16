package com.hridoykrisna.me.JWTSecurity.project.repository;

import com.hridoykrisna.me.JWTSecurity.project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {

    Product findByIdAndIsActiveTrue(Long id);
    List<Product> findAllByIsActiveTrue();

}
