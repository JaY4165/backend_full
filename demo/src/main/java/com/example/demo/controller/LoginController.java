package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginDto;
import com.example.demo.response.ResponseClass;
import com.example.demo.service.LoginServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginServiceInterface loginService;
	
	
	@PostMapping("/signin")
	public ResponseClass register(@RequestBody  LoginDto loginDto) {
		 return loginService.login(loginDto);
}
}