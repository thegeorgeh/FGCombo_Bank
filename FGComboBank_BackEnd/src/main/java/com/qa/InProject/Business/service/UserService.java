package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;

import com.qa.InProject.persistence.Domain.*;

public interface UserService {
	//public User addUser(String userName);
	public Optional<User> getUser(Long userID);
	public List<User> getAllUsers();
	public String removeUser(Long userID);
	public String updateUser(Long userID);
	public User addUser(String userName, String userPassword);
	public User logInUser(String username, String userPassword);
	
}
