package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UsersEntity;

@Repository
public interface LoginRepository extends JpaRepository<UsersEntity, Integer>{

	@Query(value = "select * from nisagra.users where email =:emailId",nativeQuery = true)
	UsersEntity findByEmail(String emailId);
	
}
