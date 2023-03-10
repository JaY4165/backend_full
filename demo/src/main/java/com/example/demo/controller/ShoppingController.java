package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.ShoppingDto;
import com.example.demo.response.ResponseClass;
import com.example.demo.response.ShoppingResponse;
import com.example.demo.service.ShoppingServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/")
public class ShoppingController {
	
	@Autowired
	ShoppingServiceInterface shoppingService;
	
	
	@GetMapping("/getshoppingitems")
	public ResponseEntity<ShoppingResponse> getAllFoods() {
        List<ShoppingDto> foodDtos = shoppingService.getAllFoods();
        ShoppingResponse shoppingResponse = new ShoppingResponse();
        shoppingResponse.setItems(foodDtos);
        shoppingResponse.setStatus(200);
        shoppingResponse.setMessage("Food items fetched successfully");
        return ResponseEntity.ok(shoppingResponse);
    }

}
