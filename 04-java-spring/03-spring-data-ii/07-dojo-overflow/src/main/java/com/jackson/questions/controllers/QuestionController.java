package com.jackson.questions.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jackson.questions.models.Answer;
import com.jackson.questions.models.Question;
import com.jackson.questions.services.AnswerService;
import com.jackson.questions.services.QuestionService;
import com.jackson.questions.services.TagsService;

@Controller
public class QuestionController {

	@Autowired
	private AnswerService aService;
	@Autowired
	private QuestionService qService;
	@Autowired
	private TagsService tService;

	@GetMapping("/questions")
	public String findAllQuestion(Model viewModel) {
		List<Question> questions = this.qService.findAllQuestions();
		viewModel.addAttribute("questions", questions);
		return "question.jsp";
	}

	@GetMapping("/questions/new")
	public String newQuestion(@ModelAttribute("newQuestion") Question question) {
		return "newQuestion.jsp";
	}

	@PostMapping("/questions/new")
	public String createQuestion(@Valid @ModelAttribute("newQuestion") Question question, BindingResult result) {
		if (result.hasErrors()) {
			return "newQuestion.jsp";
		} else {
			this.qService.createQuestion(question);
			return "redirect:/questions";
		}
	}

	@GetMapping("/questions/{id}")
	public String findQuestion(@PathVariable("id") Long id, Model model, @ModelAttribute("answ") Answer ans) {
		Question question = this.qService.findSpecificQuestion(id);
		model.addAttribute("question", question);
		return "show.jsp";
	}

	@PostMapping("/answers")
	public String CreateAnswer(@Valid @ModelAttribute("answ") Answer answer, BindingResult result) {
		if (result.hasErrors()) {
			return "show.jsp";
		} else {
			Answer newAnswer = this.aService.createAnswer(answer);
			return "redirect:/questions/1";
		}

	}

}
