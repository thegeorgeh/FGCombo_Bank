package com.qa.InProject.REST;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.InProject.Business.service.UserServiceImpl;
import com.qa.InProject.persistence.Domain.User;

@RestController
public class UserController {

	@Autowired
	public UserServiceImpl svc;

	@RequestMapping("/addUser/{userName}/{userPassword}")
	public User addUser(@PathVariable String userName, @PathVariable String userPassword) {
		User result = svc.addUser(userName, userPassword);

		return result;
	}
	
	@RequestMapping("/updateUser/{userId}")
	public String updateUser(@PathVariable Long userId) {
		return svc.updateUser(userId);
	}

	@RequestMapping("/getUser/{userId}")
	public Optional<User> getUser(@PathVariable Long userId) {
		return svc.getUser(userId);
	}

	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers() {
		List<User> allClasses = svc.getAllUsers();

		return allClasses;
	}

	@RequestMapping("/removeUser/{userId}")
	public String removeUser(@PathVariable Long userId) {
		return svc.removeUser(userId);
	}

}