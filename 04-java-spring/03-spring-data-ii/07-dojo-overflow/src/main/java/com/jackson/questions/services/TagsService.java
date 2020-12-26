package com.jackson.questions.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.questions.models.Tags;
import com.jackson.questions.repositories.TagsRepository;

@Service
public class TagsService {
	@Autowired
	private TagsRepository tRepo;

	// Find all Tags
	public List<Tags> findAllTags() {
		return this.tRepo.findAll();
	}

	// Create the tag
	public Tags createTag(Tags tags) {
		return this.tRepo.save(tags);
	}

	// Find a specific tag
	public Tags findSpecificTags(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}

}
