package com.training.springJpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.springJpa.entities.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Integer> {
	
	List<Question> findQuestionByUserUserId(Integer userId);
	
//	Integer getUserIdByUserNameAndUserPassword(String userName, String password);

}
