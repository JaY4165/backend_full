package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")


public class UsersEntity {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name  = "id")
private int id;

@Column(name="firstname")
private String firstname;


@Column(name="lastname")
private String lastname;

@Column(name = "email")
private String email;

@Column(name = "password")
private String password;

@Column(name="address")
private String address;



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}



public UsersEntity() {

}

public UsersEntity(int id, String firstname, String lastname, String email, String password, String address) {
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.password = password;
	this.address = address;
}






}
