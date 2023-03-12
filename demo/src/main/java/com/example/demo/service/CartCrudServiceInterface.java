package com.example.demo.service;

import com.example.demo.dto.CartCrudDto;

public interface CartCrudServiceInterface {
	
	CartCrudDto addItem(CartCrudDto itemDto);

    CartCrudDto updateItem(int id , int quantity);
	 
	void deleteItem(int id);
}
