package com.jackson.questions.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.questions.models.Question;
import com.jackson.questions.repositories.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository qRepo;

	// Find all the questions
	public List<Question> findAllQuestions() {
		return this.qRepo.findAll();
	}

	// Create the Question
	public Question createQuestion(Question question) {
		return this.qRepo.save(question);
	}

	// Find a specific question
	public Question findSpecificQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}

}
