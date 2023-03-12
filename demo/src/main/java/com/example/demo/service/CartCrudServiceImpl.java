package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CartCrudDto;
import com.example.demo.entity.CartCrudEntity;
import com.example.demo.exception.CommonException;
import com.example.demo.repository.CartCrudRepository;

@Service
public class CartCrudServiceImpl implements CartCrudServiceInterface{
	
	@Autowired
	CartCrudRepository cartCrudRepo;

	 @Override
	    public CartCrudDto addItem(CartCrudDto itemDto) {
	        CartCrudEntity itemEntity = new CartCrudEntity();
	        BeanUtils.copyProperties(itemDto, itemEntity);
	        itemEntity = cartCrudRepo.save(itemEntity);
	        BeanUtils.copyProperties(itemEntity, itemDto);
	        return itemDto;
	    }
	 
	 @Override
	    public CartCrudDto updateItem(int id, int quantity) {
		 CartCrudEntity item = cartCrudRepo.findById(id)
	                .orElseThrow(() -> new CommonException(202,"Cart item not found"));

	        item.setFood_quantity(quantity);
	        item = cartCrudRepo.save(item);

	        return null;
	    }

	 
	    @Override
	    public void deleteItem(int id) {
	        if (!cartCrudRepo.existsById(id)) {
	            throw new CommonException(202,"Cart item not found");
	        }
	        cartCrudRepo.deleteById(id);
	    }
}
