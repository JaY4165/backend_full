package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CartDto;
import com.example.demo.entity.CartEntity;
import com.example.demo.repository.CartRepository;

@Service
public class CartServiceImpl implements CartServiceInterface{

	@Autowired
	CartRepository cartRepo;


	@Override
	 public List<CartDto> getCartsByUserId(int user_id) {
        List<CartEntity> carts = cartRepo.getCartsByUserId(user_id);
        List<CartDto> cartDTOs = new ArrayList<>();
        for (CartEntity cart : carts) {
        	CartDto cartDTO = new CartDto();
            cartDTO.setId(cart.getId());
            cartDTO.setFood_name(cart.getFood_name());
            cartDTO.setFood_type(cart.getFood_type());
            cartDTO.setFood_image(cart.getFood_image());
            cartDTO.setFood_price(cart.getFood_price());
            cartDTO.setFood_quantity(cart.getFood_quantity());
            cartDTO.setCheckedout(cart.isCheckedout());
            cartDTOs.add(cartDTO);
        }
        return cartDTOs;
    }
	
}
