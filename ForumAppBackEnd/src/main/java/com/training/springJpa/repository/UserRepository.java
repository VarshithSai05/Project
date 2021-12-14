package com.training.springJpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.springJpa.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	User findByEmail(String email);
	
//	This method is used for logging an user in.
	User findByEmailAndPassword(String email,String password);
	

}
