package com.training.springJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springJpa.entities.Answer;
import com.training.springJpa.repository.AnswerRepository;

@Service
public class AnswerService {
	
	@Autowired
	AnswerRepository repo;
	
	public List<Answer> getAnswerByQuestionId(Integer questionId) {
		return repo.getAnswerbyQuestionId(questionId);
	}

	public Answer addAnswerByQuestionId(Answer theAnswer) {
		return repo.save(theAnswer);
	}
	
	public Answer updateAnswerByAnswerId(Answer theAnswer) {
		return repo.save(theAnswer);
	}
	
	public void deleteAnswerByAnswerId(Integer answerId) {
		repo.deleteById(answerId);
	}
}
