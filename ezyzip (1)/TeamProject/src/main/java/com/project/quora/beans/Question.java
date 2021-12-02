package com.project.quora.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer questionId;
	private String question;
	
	public Question() {
		
	}
	
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + "]";
	}
	public Question(Integer questionId, String question) {
		super();
		this.questionId = questionId;
		this.question = question;
	}
	
	

}
