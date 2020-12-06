package com.jackson.lookify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.lookify.models.Music;
import com.jackson.lookify.repositories.MusicRepository;

@Service
public class MusicServices {
	
	@Autowired
	private MusicRepository mRepo;
	
	public List<Music> findAllSong(){
		return this.mRepo.findAll();
	}
	
	public Music createSong(Music music) {
		return this.mRepo.save(music);
	}
	
	public Music findSpecificSong(Long id) {
		return this.mRepo.findById(id).orElse(null);
	}
	
	public Music updateSong(Music updateSong) {
		return this.mRepo.save(updateSong);
	}
	
	public void deleteSpecificSong(Long id) {
		this.mRepo.deleteById(id);
	}
	
	public List<Music> findAllByRating(){
		return this.mRepo.findByOrderByRatingDesc();
	}
	
	public List<Music> findByArtist(String artist){
		return this.mRepo.findByArtistContaining(artist);
	}

}
