package com.jackson.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jackson.lookify.models.Music;

@Repository
public interface MusicRepository extends CrudRepository<Music, Long> {
	
	//Select * from Music
	List<Music> findAll();
	
	//Sort by descending values
	List<Music> findByOrderByRatingDesc();
	
	//Find by Artist
	List<Music> findByArtistContaining(String artist);

}
