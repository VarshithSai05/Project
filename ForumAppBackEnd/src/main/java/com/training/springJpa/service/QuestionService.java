package com.training.springJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springJpa.entities.Question;
import com.training.springJpa.repository.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	QuestionRepository repo;

	public List<Question> findQuestionsByUserId(Integer userId) {
		return repo.findQuestionByUserId(userId);
	}

	public Question addQuestion(Question question) {
		return repo.save(question);
	}

	public Question updateQuestionById(Question question) {
		return repo.save(question);
	}

	public void deleteQuestionById(Integer questionId) {
		repo.deleteById(questionId);
		System.out.println("Question has been deleted");

	}

	public Iterable<Question> getAllQuestions() {
		return repo.findAll();
	}
}
