package com.rayen.chansons.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rayen.chansons.enteties.Genre;
import com.rayen.chansons.repos.GenreRepository;

@RestController
@RequestMapping("/api/gen")
@CrossOrigin("*")
public class GenreRESTController {
	
	@Autowired
	GenreRepository genreRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Genre> getAllGenres(){
		return genreRepository.findAll();
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET) 
	 public Genre getGenreById(@PathVariable("id") Long id) { 
	  return genreRepository.findById(id).get(); 
	  } 
	    
	    @RequestMapping(method = RequestMethod.POST)
	    public Genre createGenre(@RequestBody Genre genre) {
	        return genreRepository.save(genre);
	    }

	    
	    @RequestMapping(method = RequestMethod.PUT)
	    public Genre updateGenre(@RequestBody Genre genre) {
	        return genreRepository.save(genre);
	    }

	   
	    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	    public void deleteGenref(@PathVariable("id") Long id) {
	    	genreRepository.deleteById(id);
	    }

}
