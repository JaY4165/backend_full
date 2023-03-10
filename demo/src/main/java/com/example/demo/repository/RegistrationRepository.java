package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UsersEntity;


@Repository
public interface RegistrationRepository extends JpaRepository<UsersEntity, Integer> {

}
