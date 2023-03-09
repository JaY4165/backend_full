package com.example.demo.service;

import com.example.demo.dto.LoginDto;
import com.example.demo.response.ResponseClass;

public interface LoginServiceInterface  {

	
	ResponseClass login(LoginDto loginDto);
}
