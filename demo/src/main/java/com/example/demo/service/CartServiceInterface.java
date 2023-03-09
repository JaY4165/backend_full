package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CartDto;

public interface CartServiceInterface {

	List<CartDto> getCartsByUserId(int user_id);
	
}
