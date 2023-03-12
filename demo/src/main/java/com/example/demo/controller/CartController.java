package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.CartDto;
import com.example.demo.response.CartCrudResponse;
import com.example.demo.response.CartResponse;
import com.example.demo.service.CartCrudServiceInterface;
import com.example.demo.service.CartServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/cart")
public class CartController {

	
	@Autowired
	CartServiceInterface cartService;
	
	@Autowired
	CartCrudServiceInterface cartCrudService;
	
	
	@GetMapping("/{user_id}")
	 public ResponseEntity<CartResponse> getCartByUserId(@PathVariable int user_id) {
        List<CartDto> cartDTOs = cartService.getCartsByUserId(user_id);
        CartResponse response = new CartResponse();
        response.setData(cartDTOs);
        response.setStatus(200);
        response.setMessage("Cart items fetched successfully");
        return ResponseEntity.ok(response);
    }
	
	@PutMapping("/{id}/quantity")
	public CartCrudResponse updateItem(@PathVariable int id, @RequestParam int quantity) {
		cartCrudService.updateItem(id,quantity);
		CartCrudResponse response = new CartCrudResponse();
	    response.setStatus(200);
	    response.setMessage("Cart item updated");
	    return response;
	}

	@DeleteMapping("/{id}")
	public CartCrudResponse deleteItem(@PathVariable int id) {
		cartCrudService.deleteById(id);
		CartCrudResponse response = new CartCrudResponse();
		response.setStatus(200);
	    response.setMessage("Item deleted from cart");
	    return response;
	}
	
	
}
