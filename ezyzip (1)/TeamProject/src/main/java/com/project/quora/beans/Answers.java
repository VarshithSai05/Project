package com.project.quora.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Answers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer answerId;
	private String answer;
	
	public Answers() {
		
	}
	
	public Integer getAnswerId() {
		return answerId;
	}
	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", answer=" + answer + "]";
	}
	public Answers(Integer answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	
	

}
