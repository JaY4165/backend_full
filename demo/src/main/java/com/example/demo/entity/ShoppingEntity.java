package com.example.demo.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "food")
public class ShoppingEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name  = "food_id")
	private int food_id;
	
	@Column(name = "food_name")
	private String food_name;
	
	@Column(name = "food_type")
	private String food_type;
	
	@Column(name = "food_image")
	private String food_image;
	
	@Column(name = "food_price")
	private int food_price;

	
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
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
	public ShoppingEntity() {
		
	}
	public ShoppingEntity(int food_id, String food_name, String food_type, String food_image, int food_price) {
		this.food_id = food_id;
		this.food_name = food_name;
		this.food_type = food_type;
		this.food_image = food_image;
		this.food_price = food_price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(food_id, food_image, food_name, food_price, food_type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoppingEntity other = (ShoppingEntity) obj;
		return food_id == other.food_id && Objects.equals(food_image, other.food_image)
				&& Objects.equals(food_name, other.food_name) && food_price == other.food_price
				&& Objects.equals(food_type, other.food_type);
	}
	
	
	
	
	
}
