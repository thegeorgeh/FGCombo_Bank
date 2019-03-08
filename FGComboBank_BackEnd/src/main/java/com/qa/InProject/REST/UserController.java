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
	
	@RequestMapping("/updateUser/{userID}")
	public String updateUser(@PathVariable Long userID) {
		return svc.updateUser(userID);
	}

	@RequestMapping("/getUser/{userID}")
	public Optional<User> getUser(@PathVariable Long userID) {
		return svc.getUser(userID);
	}

	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers() {
		List<User> allClasses = svc.getAllUsers();

		return allClasses;
	}

	@RequestMapping("/removeUser/{userID}")
	public String removeUser(@PathVariable Long userID) {
		return svc.removeUser(userID);
	}
	
	@RequestMapping("logInUser/{userName}/{userPassword}")
	public User logInUser(@PathVariable String userName, @PathVariable String userPassword) {
		return svc.logInUser(userName, userPassword);

	}

}