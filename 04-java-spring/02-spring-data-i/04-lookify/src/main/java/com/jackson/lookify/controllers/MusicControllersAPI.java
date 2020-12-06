package com.jackson.lookify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jackson.lookify.models.Music;
import com.jackson.lookify.services.MusicServices;

@RestController
public class MusicControllersAPI {
	
	@Autowired
	private MusicServices mServices;
	
	@GetMapping("/api/dashboard")
	public List<Music> findAllSongs(){
		return this.mServices.findAllSong();
	}
	
	@GetMapping("/api/search/topTen")
	public List<Music> findSongsInDesc(){
		return this.mServices.findAllByRating();
	}
	
	@PostMapping("/api/songs/new")
	public Music createSongs(Music music) {
		return this.mServices.createSong(music);
	}
	
	@DeleteMapping("/api/songs/delete/{id}")
	public void deleteSong(@PathVariable("id") Long id) {
		this.mServices.deleteSpecificSong(id);
	}
	
	@GetMapping("api/search/{artist}")
	public List<Music> searchByArtist(@PathVariable("artist")String artist){
		return this.mServices.findByArtist(artist);
	}
	
	@PutMapping("/api/songs/{id}")
	public Music updateSong(@PathVariable ("id") Long id, Music music) {
		return this.mServices.updateSong(music);
	}

}
