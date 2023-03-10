package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ShoppingDto;
import com.example.demo.entity.ShoppingEntity;
import com.example.demo.repository.ShoppingRepository;


@Service
public class ShoppingServiceImpl implements ShoppingServiceInterface{
	
	@Autowired
	ShoppingRepository shoppingRepository;
	
	@Override
    public List<ShoppingDto> getAllFoods() {
        List<ShoppingEntity> shoppingEntities = shoppingRepository.findAll();
        return shoppingEntities.stream().map(this::mapToDto).collect(Collectors.toList());
    }
	
	private ShoppingDto mapToDto(ShoppingEntity shoppingEntity) {
		ShoppingDto shoppingDto = new ShoppingDto();
		shoppingDto.setFood_id(shoppingEntity.getFood_id());
		shoppingDto.setFood_name(shoppingEntity.getFood_name());
		shoppingDto.setFood_type(shoppingEntity.getFood_type());
		shoppingDto.setFood_image(shoppingEntity.getFood_image());
		shoppingDto.setFood_price(shoppingEntity.getFood_price());
        return shoppingDto;
    }

}
