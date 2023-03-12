package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CartCrudEntity;


@Repository
public interface CartCrudRepository extends JpaRepository<CartCrudEntity, Integer>{

//	@Query(value = "delete from nisagra.cart where user_id = :id" )
//	void deleteItem(int id);
}
