package com.rayen.chansons;


import java.time.LocalDate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rayen.chansons.enteties.Chanson;
import com.rayen.chansons.enteties.Genre;
import com.rayen.chansons.repos.ChansonRepository;


@SpringBootTest
class ChansonsApplicationTests {
	
	@Test
	void contextLoads() {
	}

	@Autowired
	private ChansonRepository chansonRepository;
	
	@Test
	public void testCreateChanson() {
	    Chanson chans = new Chanson(
	    		"UZI",
	    		"A.L.A", 
	    		"ALA@gmail.com",
	    		4.36, 
	    		"6.7 M",
	    		LocalDate.of(2017, 8, 20)
	    		);
	    Chanson chans2 = new Chanson(
	            "S.A.F.E",                  
	            "A.L.A",                   
	            "ALA@gmail.com",            
	            5.22,                       
	            "22 M",                     
	            LocalDate.of(2017, 7, 27)   
	        );
	    		
	    chansonRepository.save(chans);
	    chansonRepository.save(chans2);

	}

	@Test
	public void testFindChanson()
	{
	Chanson c= chansonRepository.findById(1L).get();
	System.out.println(c);
	}
	
	@Test
	public void testUpdateChanson()
	{
	Chanson c =chansonRepository.findById(1L).get();
	c.setDuree(5.00);
	chansonRepository.save(c);
	System.out.println(c);

	}
	
	@Test
	public void testDeleteChanson()
	{
	chansonRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousChansons()
	{
	List<Chanson> chans = chansonRepository.findAll();
	for (Chanson c : chans)
	{
	System.out.println(c);
	}
	}
	
	
	@Test
	public void testFindChansonByNom()
	{
	List<Chanson> chans= chansonRepository.findByNomChanson("UZI");
	for (Chanson c : chans)
	{
	System.out.println(c);
	}
	}
	
	
	@Test
	public void testFindChansonByNomContains()
	{
	List<Chanson> chans= chansonRepository.findByNomChansonContains("U");
	for (Chanson c : chans)
	{
	System.out.println(c);
	}
	}
	
	
	@Test
	public void testfindByNomDuree()
	{
	List<Chanson> chans = chansonRepository.findByNomDuree("UZI",4.36);
	for (Chanson c : chans)
	{
	System.out.println(c);
	}
	}

	
	@Test
	public void testfindByGenre()
	{
		Genre gen = new Genre();
		gen.setIdGen(1L);
		List<Chanson> chans = chansonRepository.findByGenre(gen);
		for (Chanson c : chans)
		{
			System.out.println(c);
		}
	}
	
	@Test
	public void findByGenreIdGen()
	{
	List<Chanson> chans = chansonRepository.findByGenreIdGen(1L);
	for (Chanson c : chans)
	{
	System.out.println(c);
	}
	 }
	
	@Test
	public void findByOrderByNomChansonAsc()
	{
	List<Chanson> chans =
	chansonRepository.findByOrderByNomChansonAsc();
	for (Chanson c : chans)
	{
	System.out.println(c);
	}
	}
	
	@Test
	public void trierChansonsNomsDuree()
	{
	List<Chanson> chans = chansonRepository.trierChansonsNomsDuree();
	for (Chanson c : chans)
	{
	System.out.println(c);
	}
	}



}
