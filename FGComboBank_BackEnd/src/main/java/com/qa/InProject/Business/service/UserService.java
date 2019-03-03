package com.qa.InProject.Business.service;

import java.util.List;
import java.util.Optional;

import com.qa.InProject.persistence.Domain.*;

public interface UserService {
	public User addUser(String userName);
	public Optional<User> getUser(Long userId);
	public List<User> getAllUsers();
	public String removeUser(Long userId);
	public String updateUser(Long userId);
}
