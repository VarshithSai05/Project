package com.training.springJpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.springJpa.entities.Answer;
@Repository
public interface AnswerRepository extends CrudRepository<Answer, Integer> {
	
	List<Answer> getAnswerbyQuestionId(Integer questionId);

}
