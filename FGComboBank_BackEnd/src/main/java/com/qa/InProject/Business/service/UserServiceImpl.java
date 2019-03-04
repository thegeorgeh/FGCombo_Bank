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
	public Optional<User> getUser(Long userId) {
		return repo.findById(userId);
	}

	@Override
	public String updateUser(Long userId) {
		repo.findById(userId);
		return null;
	}

	@Override
	public String removeUser(Long userId) {
		repo.findById(userId);
		return null;
	}
	
	public void setRepo(UserRepository repo)
	{
		this.repo = repo;
	}

}

