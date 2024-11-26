package com.rayen.chansons.repos;

import java.util.List;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rayen.chansons.enteties.Chanson;
import com.rayen.chansons.enteties.Genre;

@RepositoryRestResource(path = "rest") 

public interface ChansonRepository extends JpaRepository<Chanson, Long> {

	List<Chanson> findByNomChanson(String nom);
	List<Chanson> findByNomChansonContains(String nom);
 
	
	
	@Query("select c from Chanson c where c.nomChanson like %:nom and c.duree > :duree")
	List<Chanson> findByNomDuree(@Param("nom") String nom, @Param("duree") Double duree);

	
	 
	 @Query("select c from Chanson c where c.genre = ?1")
	 List<Chanson> findByGenre (Genre genre);
	
	
	 List<Chanson> findByGenreIdGen(Long id);
	 
	 List<Chanson> findByOrderByNomChansonAsc();
	 
	 
	 @Query("select c from Chanson c order by c.nomChanson ASC, c.duree DESC")
	 List<Chanson> trierChansonsNomsDuree ();

}
