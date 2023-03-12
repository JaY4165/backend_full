package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "cart")
public class CartCrudEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name  = "id")
	private int id;

	@Column(name = "food_name")
	private String food_name;
	
	@Column(name = "food_type")
	private String food_type;
	
	@Column(name = "food_image")
	private String food_image;
	
	@Column(name = "food_price")
	private int food_price;
	
	@Column(name = "food_quantity")
	private int food_quantity;
	
	@Column(name = "user_id")
    private int user_id;
	
	@Column(name = "checkedout")
	private boolean checkedout;
	
	
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public boolean isCheckedout() {
		return checkedout;
	}

	public void setCheckedout(boolean checkedout) {
		this.checkedout = checkedout;
	}

	public CartCrudEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartCrudEntity(int id, String food_name, String food_type, String food_image, int food_price,
			int food_quantity, int user_id, boolean checkedout) {
		super();
		this.id = id;
		this.food_name = food_name;
		this.food_type = food_type;
		this.food_image = food_image;
		this.food_price = food_price;
		this.food_quantity = food_quantity;
		this.user_id = user_id;
		this.checkedout = checkedout;
	}

	
	
}
