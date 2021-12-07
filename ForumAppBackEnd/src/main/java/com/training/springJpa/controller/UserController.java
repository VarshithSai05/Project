package com.training.springJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springJpa.entities.User;
import com.training.springJpa.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("/signUp")
	User addUser(@RequestBody User user) {
		return service.addUser(user);
	}

	@GetMapping("/user")
	Iterable<User> showAllUsers() {
		return service.showUsers();
	}
	
	@PutMapping("update/{userId}")
	User updateByUserId(@PathVariable Integer userId,@RequestBody User user) {
		return service.updateUserById(user, userId);
	}
	
	@DeleteMapping("delete/{userId}")
	void deleteUserById(@PathVariable Integer userId) {
		service.deleteUserByUserId(userId);
	}

//	@RequestMapping("/")
//	public String showIndex() {
//		return "index";
//	}

}
