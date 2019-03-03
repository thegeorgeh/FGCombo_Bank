package com.qa.InProject.persistence.Domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "userId")
	private Long userId;
	@Column(name = "userName")
	private String userName;
	@Column(name = "userPassword")
	private String userPassword;
	
	public User()
	{
		
	}
	
	public User(String userName, String userPassword )
	{
		this.userName = userName;
		this.userPassword = userPassword;
	}


	public Long getId() {
		return userId;
	}

	public void setId(Long id) {
		this.userId = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getImageUrl() {
		return userPassword;
	}

	public void setImageUrl(String userPassword) {
		this.userPassword = userPassword;
	}


	
}

