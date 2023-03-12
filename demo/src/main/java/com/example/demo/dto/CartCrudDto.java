package com.example.demo.dto;

public class CartCrudDto {
	
	private int id;
	private String food_name;
	private String food_type;
	private String food_image;
	private int food_price;
	private int food_quantity;
	private boolean checkedout;
	private int user_id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFood_name() {
		return food_name;
	}
	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}
	public String getFood_type() {
		return food_type;
	}
	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}
	public String getFood_image() {
		return food_image;
	}
	public void setFood_image(String food_image) {
		this.food_image = food_image;
	}
	public int getFood_price() {
		return food_price;
	}
	public void setFood_price(int food_price) {
		this.food_price = food_price;
	}
	public int getFood_quantity() {
		return food_quantity;
	}
	public void setFood_quantity(int food_quantity) {
		this.food_quantity = food_quantity;
	}
	public boolean isCheckedout() {
		return checkedout;
	}
	public void setCheckedout(boolean checkedout) {
		this.checkedout = checkedout;
	}
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public CartCrudDto(int id, String food_name, String food_type, String food_image, int food_price, int food_quantity,
			boolean checkedout, int user_id) {
		super();
		this.id = id;
		this.food_name = food_name;
		this.food_type = food_type;
		this.food_image = food_image;
		this.food_price = food_price;
		this.food_quantity = food_quantity;
		this.checkedout = checkedout;
		this.user_id = user_id;
	}
	public CartCrudDto() {
		super();
	}
	
	
}
