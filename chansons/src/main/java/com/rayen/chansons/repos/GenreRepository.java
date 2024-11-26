package com.rayen.chansons.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.rayen.chansons.enteties.Genre;


@RepositoryRestResource(path = "gen")
@CrossOrigin("http://localhost:4200/")
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
