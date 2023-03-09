package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RegistrationDto;
import com.example.demo.response.ResponseClass;
import com.example.demo.service.RegistrationServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/register")
public class RegistrationController {
	
	@Autowired
	RegistrationServiceInterface registerService;
	
	
	@PostMapping("/signup")
	public ResponseClass register(@RequestBody  RegistrationDto registerDto) {
		 return registerService.register(registerDto);
	}
}
