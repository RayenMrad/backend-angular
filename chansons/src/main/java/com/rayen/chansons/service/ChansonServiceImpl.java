package com.rayen.chansons.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rayen.chansons.enteties.Chanson;
import com.rayen.chansons.enteties.Genre;
import com.rayen.chansons.repos.ChansonRepository;

@Service
public class ChansonServiceImpl implements ChansonService {

	@Autowired
	ChansonRepository chansonRepository;

	
	
	@Override
	public Chanson saveChanson(Chanson c) {
		return chansonRepository.save(c);
	}

	@Override
	public Chanson updateChanson(Chanson c) {
		return chansonRepository.save(c);
	}

	@Override
	public void deleteChanson(Chanson c) {
		chansonRepository.delete(c);
	}

	@Override
	public void deleteChansonById(Long id) {
		chansonRepository.deleteById(id);
	}

	@Override
	public Chanson getChanson(Long id) {
		return chansonRepository.findById(id).get();
	}

	@Override
	public List<Chanson> getAllChansons() {
		return chansonRepository.findAll();
	}

	@Override
	public List<Chanson> findByNomChanson(String nom) {
		return chansonRepository.findByNomChanson(nom);
	}

	@Override
	public List<Chanson> findByNomChansonContains(String nom) {
		return chansonRepository.findByNomChansonContains(nom);
	}

	@Override
	public List<Chanson> findByNomDuree(String nom, Double duree) {
		return chansonRepository.findByNomDuree(nom, duree);
	}

	@Override
	public List<Chanson> findByGenre(Genre genre) {
		return chansonRepository.findByGenre(genre);
	}

	@Override
	public List<Chanson> findByGenreIdGen(Long id) {
		return chansonRepository.findByGenreIdGen(id);
	}

	@Override
	public List<Chanson> findByOrderByNomChansonAsc() {
		return chansonRepository.findByOrderByNomChansonAsc();
	}

	@Override
	public List<Chanson> trierChansonsNomsDuree() {
		return chansonRepository.trierChansonsNomsDuree();
	}

}
