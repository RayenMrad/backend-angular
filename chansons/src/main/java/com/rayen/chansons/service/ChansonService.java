package com.rayen.chansons.service;

import java.util.List;

import com.rayen.chansons.enteties.Chanson;
import com.rayen.chansons.enteties.Genre;

public interface ChansonService {
	Chanson saveChanson(Chanson c);
	Chanson updateChanson(Chanson c);
	void deleteChanson(Chanson c);
	 void deleteChansonById(Long id);
	 Chanson getChanson(Long id);
	List<Chanson> getAllChansons();
	List<Chanson> findByNomChanson(String nom);
	List<Chanson> findByNomChansonContains(String nom);
	List<Chanson> findByNomDuree (String nom, Double duree);
	List<Chanson> findByGenre (Genre genre);
	List<Chanson> findByGenreIdGen(Long id);
	List<Chanson> findByOrderByNomChansonAsc();
	List<Chanson> trierChansonsNomsDuree();
}
