package com.example.demo.response;

public class CartCrudResponse {

	private int status;
	
	private String message;

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

	public CartCrudResponse(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public CartCrudResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
