package com.example.demo.response;




public class ResponseClass {
	
	private int status;
		
	private String message;
	
	private int userId;
	
	private Object data;
	

	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

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
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

	public ResponseClass() {
	}

	public ResponseClass(int status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public ResponseClass(int status, String message, int userId) {
		this.status = status;
		this.message = message;
		this.userId = userId;
	}
	
	public ResponseClass(int status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}
}
