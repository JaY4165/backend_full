package com.example.demo.response;

import java.util.List;
import java.util.Objects;

import com.example.demo.dto.ShoppingDto;

public class ShoppingResponse {
	
	private int status;
	
private String message;
	
	
	private List<ShoppingDto> items;
	
	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public List<ShoppingDto> getItems() {
		return items;
	}


	public void setItems(List<ShoppingDto> items) {
		this.items = items;
	}


	public ShoppingResponse(int status, String message, List<ShoppingDto> items) {
		super();
		this.status = status;
		this.message = message;
		this.items = items;
	}


	public ShoppingResponse() {
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(items, message, status);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoppingResponse other = (ShoppingResponse) obj;
		return Objects.equals(items, other.items) && Objects.equals(message, other.message) && status == other.status;
	}

	

	

}
