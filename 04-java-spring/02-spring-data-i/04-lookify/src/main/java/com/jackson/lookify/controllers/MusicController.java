package com.jackson.lookify.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.jackson.lookify.models.Music;
import com.jackson.lookify.services.MusicServices;

@Controller
public class MusicController {
	
	@Autowired
	private MusicServices mService;
	
	@GetMapping("/")
	public String welcome() {
		return "welcome.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Music> allSongs = this.mService.findAllSong();
		model.addAttribute("songs", allSongs);
		return "index.jsp";
	}
	
	@GetMapping("/songs/{id}")
	public String findSong(@PathVariable("id")Long id, Model viewModel) {
		Music song = this.mService.findSpecificSong(id);
		viewModel.addAttribute("song", song);
		return "songs.jsp";
	}
	
	@GetMapping("/search/topTen")
	public String topTenSongs(Model model) {
		List<Music> topTenSongs = this.mService.findAllByRating();
		model.addAttribute("ratings", topTenSongs);
		return "topTen.jsp";
	}
	
	@GetMapping("/newsong")
	public String newSong(@ModelAttribute("songs") Music music) {
		return "add.jsp";
	}
	
	@PostMapping("/newsong")
	public String newSong(@Valid @ModelAttribute("songs") Music music, BindingResult result) {
		if(result.hasErrors()) {
			return "add.jsp";
		}
		this.mService.createSong(music);
		return "redirect:/dashboard";
	}
	
	@GetMapping("/search/{artist}")
	public String searchArtist(@PathVariable("artist") String artist, Model model) {
		List<Music> music = this.mService.findByArtist(artist);
		model.addAttribute("artist", artist);
		model.addAttribute("models", music);
		return "artist.jsp";
	}
	
	@GetMapping("/search")
	public String findArtist(@RequestParam(value= "artist", required= false) String artist, Model model) {
		List<Music> music = this.mService.findByArtist(artist);
		model.addAttribute("artist", artist);
		model.addAttribute("models", music);
		return "artist.jsp";
	}
	
}
