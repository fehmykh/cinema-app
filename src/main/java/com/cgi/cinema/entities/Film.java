package com.cgi.cinema.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "film")
public class Film implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String description;
	private String realisateur;
	private Date dateSortie;
	private double duree;
	private String affiche;
	@OneToMany(mappedBy = "film")
	private Collection<Projection> projections;
	@ManyToOne
	private Categorie categorie;

	public Film() {
	}

	public Film(Long id, String titre, String description, String realisateur, Date dateSortie, double duree, String affiche, Collection<Projection> projections, Categorie categorie) {
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.realisateur = realisateur;
		this.dateSortie = dateSortie;
		this.duree = duree;
		this.affiche = affiche;
		this.projections = projections;
		this.categorie = categorie;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}

	public String getAffiche() {
		return affiche;
	}

	public void setAffiche(String affiche) {
		this.affiche = affiche;
	}

	public Collection<Projection> getProjections() {
		return projections;
	}

	public void setProjections(Collection<Projection> projections) {
		this.projections = projections;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
}
