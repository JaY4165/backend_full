package com.example.demo.service;


import com.example.demo.dto.RegistrationDto;
import com.example.demo.response.ResponseClass;



public interface RegistrationServiceInterface {
	ResponseClass register(RegistrationDto registerDto); 
}
