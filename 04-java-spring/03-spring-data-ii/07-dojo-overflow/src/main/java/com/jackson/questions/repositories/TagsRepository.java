package com.jackson.questions.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jackson.questions.models.Tags;

@Repository
public interface TagsRepository extends CrudRepository<Tags, Long> {
	List<Tags> findAll();

}
