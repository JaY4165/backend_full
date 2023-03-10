package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CartEntity;

@Repository
public interface CartRepository extends JpaRepository<CartEntity, Integer> {

	@Query(value = "select * from nisagra.cart where user_id =:user_id and checkedout=false",nativeQuery = true)
	List<CartEntity> getCartsByUserId(int user_id);
}
