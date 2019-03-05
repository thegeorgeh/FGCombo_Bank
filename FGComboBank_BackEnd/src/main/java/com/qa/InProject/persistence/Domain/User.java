package com.qa.InProject.persistence.Domain;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class User {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "userId")
	private Long userId;
	@Column(name = "userName", unique=true)
	private String userName;
	@Column( name = "userPassword", nullable=false)
	private String userPassword;
	
	
	@OneToMany
	@JoinColumn(name = "userName", nullable = false, insertable = false, updatable = false)
	private Set<Game> games;
	

//	@OnDelete(action = OnDeleteAction.CASCADE)
	
//	private Set<Combo> combos;
//	
	public User()
	{
		
	}
	


	public User(String userName, String userPassword, Set<Game> games)
	{
		this.userName = userName;
		this.userPassword = userPassword;
		this.games = games;
		
	}

	

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long id) {
		this.userId = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public Set<Game> getGames() {
		return games;
	}

	public void setGames(Set<Game> games) {
		this.games = games;
	}
//
//	public Set<Combo> getCombos() {
//		return combos;
//	}
//
//	public void setCombos(Set<Combo> combos) {
//		this.combos = combos;
//	}

	
	

	
	





	
}

