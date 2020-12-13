package com.jackson.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jackson.dojosandninjas.models.Dojo;

@Repository
public interface DojoRepositories extends CrudRepository<Dojo, Long> {
	List<Dojo> findAll();
}
