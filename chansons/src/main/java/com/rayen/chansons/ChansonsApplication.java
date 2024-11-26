package com.rayen.chansons;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.rayen.chansons.enteties.Chanson;
import com.rayen.chansons.enteties.Genre;

@SpringBootApplication
public class ChansonsApplication   implements CommandLineRunner{

	@Autowired 
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(ChansonsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Chanson.class,Genre.class ); 


		
	}

}
