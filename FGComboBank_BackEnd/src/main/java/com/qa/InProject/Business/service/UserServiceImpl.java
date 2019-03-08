package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Service;

import com.qa.InProject.persistence.Domain.User;
import com.qa.InProject.persistence.Repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;	
	
	@Override
	public User addUser(String userName, String userPassword) {
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		
		return repo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	@Override
	public Optional<User> getUser(Long userID) {
		return repo.findById(userID);
	}

	@Override
	public String updateUser(Long userID) {
		repo.findById(userID);
		return null;
	}

	@Override
	public String removeUser(Long userID) {
		repo.findById(userID);
		return null;
	}
	
	@Override
	public User logInUser(String username, String userPassword) {
		List<User> users = getAllUsers();
//		for (int i = 0; i < users.size(); i++) {
//			User user = users.get(i);
//
//			if (user.getUserName().equals(username)) {
//				return user;
//
//			}
//
//		}
//		return null; 
		for (User user : users) {
			if (user.getUserName().equals(username)) {
				return user;
			}
		}
		return null;
	}
	
	public void setRepo(UserRepository repo)
	{
		this.repo = repo;
	}


}

