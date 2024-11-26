package com.rayen.chansons.restcontrollers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rayen.chansons.enteties.Chanson;
import com.rayen.chansons.service.ChansonService;



@RestController
@RequestMapping("/api")
@CrossOrigin
public class ChansonRESTController {
	
	@Autowired
	ChansonService  chansonService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Chanson> getAllChansons() 
	{
		return chansonService.getAllChansons();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET) 
	public Chanson getProduitById(@PathVariable("id") Long id) {  
	return chansonService.getChanson(id); 
	}
	
	
	@RequestMapping(method = RequestMethod.POST) 
	public Chanson createProduit(@RequestBody Chanson chanson) { 
	return chansonService.saveChanson(chanson); 
	} 
	
	@RequestMapping(method = RequestMethod.PUT) 
	public Chanson updateProduit(@RequestBody Chanson chanson) { 
	return chansonService.updateChanson(chanson); 
	} 
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE) 
	public void deleteChanson(@PathVariable("id") Long id) 
	{ 
		chansonService.deleteChansonById(id); 
	}
	
	@RequestMapping(value="/chansgen/{idGen}",method = RequestMethod.GET) 
	public List<Chanson> getProduitsByCatId(@PathVariable("idGen") Long idGen) { 
	return chansonService.findByGenreIdGen(idGen); 
	} 
	
	@RequestMapping(value="/chansByName/{nom}",method = RequestMethod.GET) 
	public List<Chanson> findByNomChansonContains(@PathVariable("nom") String nom) { 
	return chansonService.findByNomChansonContains(nom); 
	} 
}
