package com.training.springJpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springJpa.entities.User;
import com.training.springJpa.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
//	public Integer getUserIdByUserUserName(String userName) {
//		return repo.getUserIdByUserUserName(userName);
//	}
	
	public User addUser(User user) {
		return repo.save(user);
	}
	
	public Iterable<User> showUsers() {
		return repo.findAll();
	}
	
	public User updateUserById(User user,Integer userId) {
		return repo.save(user);
	}
	
	public void deleteUserByUserId(Integer userId) {
		repo.deleteById(userId);
	}
	
}
