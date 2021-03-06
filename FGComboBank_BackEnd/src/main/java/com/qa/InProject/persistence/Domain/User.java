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
	@Column(name = "userID")
	private Long userID;
	@Column(name = "userName", unique=true)
	private String userName;
	@Column( name = "userPassword", nullable=false)
	private String userPassword;
	
	
//	@OneToMany
//	@JoinColumn(name = "userID", nullable = false, insertable = false, updatable = false)
//	private List<Game> games;
	

//	@OnDelete(action = OnDeleteAction.CASCADE)
	
//	private List<Combo> combos;
//	
	public User()
	{
		
	}
	

	public User(Long userID, String userName, String userPassword)
	{
		this.userID = userID;
		this.userName = userName;
		this.userPassword = userPassword;
//		this.games = games;
		
	}

	

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
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
	
//	public Set<Game> getGames() {
//		return games;
//	}
//
//	public void setGames(Set<Game> games) {
//		this.games = games;
//	}
//
//	public Set<Combo> getCombos() {
//		return combos;
//	}
//
//	public void setCombos(Set<Combo> combos) {
//		this.combos = combos;
//	}

	
	

	
	





	
}

