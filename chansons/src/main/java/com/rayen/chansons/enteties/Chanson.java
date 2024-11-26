package com.rayen.chansons.enteties;


import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Chanson {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idChanson;
	private String nomChanson;
	private String nomArtiste;
	private Double duree;	
	private String vues;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate  dateSortie;
	private String email;

	@ManyToOne
	private Genre genre;
		
	
	public Chanson() {
		super();
	}
	
	
	
	public Chanson(String nomChanson, String nomArtiste, String email, Double duree, String vues, LocalDate  dateSortie) {
		super();
		this.nomChanson = nomChanson;
		this.nomArtiste = nomArtiste;
		this.duree = duree;
		this.vues = vues;
		this.dateSortie = dateSortie;
		this.email = email;
	}



	public Long getIdChanson() {
		return idChanson;
	}
	public void setIdChanson(Long idChanson) {
		this.idChanson = idChanson;
	}
	public String getNomChanson() {
		return nomChanson;
	}
	public void setNomChanson(String nomChanson) {
		this.nomChanson = nomChanson;
	}
	public String getNomArtiste() {
		return nomArtiste;
	}
	public void setNomArtiste(String nomArtiste) {
		this.nomArtiste = nomArtiste;
	}
	public Double getDuree() {
		return duree;
	}
	public void setDuree(Double duree) {
		this.duree = duree;
	}
	public String getVues() {
		return vues;
	}
	public void setVues(String vues) {
		this.vues = vues;
	}
	public LocalDate  getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(LocalDate  dateSortie) {
		this.dateSortie = dateSortie;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Chanson [idChanson=" + idChanson + ", nomChanson=" + nomChanson + ", nomArtiste=" + nomArtiste
				+ ", duree=" + duree + ", vues=" + vues + ", dateSortie=" + dateSortie + ", email=" + email + "]";
	}



	public Genre getGenre() {
		return genre;
	}



	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
	

}
