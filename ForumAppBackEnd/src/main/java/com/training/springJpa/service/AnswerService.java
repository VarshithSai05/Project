package com.training.springJpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springJpa.entities.Answer;
import com.training.springJpa.repository.AnswerRepository;

@Service
public class AnswerService {
	@Autowired
	AnswerRepository repo;
	
	public Iterable<Answer> findAllAnswers() {
		return repo.findAll();
	}
	
	public void addAnswerByQuestionId(Answer theAnswer) {
		repo.save(theAnswer);
		System.out.println("New answer has been added.");
	}

}
