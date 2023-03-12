package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CartCrudEntity;

public interface CartCrudRepository extends JpaRepository<CartCrudEntity, Integer>{

}
