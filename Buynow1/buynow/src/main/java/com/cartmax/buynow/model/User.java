package com.cartmax.buynow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;
@Entity
@Table(name = "user2")

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;

	@Column(nullable = false, length = 30)
	private String name;

	@Column(nullable = false, length = 20)
	private String password;

	@Column(nullable = false, length = 30, unique=true)
	private String email;
	

	public User(int uid, String name, String password, String email) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
