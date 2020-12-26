package com.jackson.questions.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.questions.models.Answer;
import com.jackson.questions.repositories.AnswerRepository;

@Service
public class AnswerService {
	@Autowired
	private AnswerRepository aRepo;

	// Find all Answers
	public List<Answer> findAllAnswers() {
		return this.aRepo.findAll();
	}

	// Create an answer
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}

	// Find an answer
	public Answer findAnswer(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}

}
