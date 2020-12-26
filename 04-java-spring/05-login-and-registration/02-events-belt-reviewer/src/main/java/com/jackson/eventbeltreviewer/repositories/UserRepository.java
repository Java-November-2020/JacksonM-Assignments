package com.jackson.eventbeltreviewer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jackson.eventbeltreviewer.models.EventUser;

@Repository
public interface UserRepository extends CrudRepository<EventUser, Long> {
	EventUser findByEmail(String email);
}