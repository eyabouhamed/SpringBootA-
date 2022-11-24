package com.example.demo.entities;

import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;

import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("etd")

public class Etudiant extends Member {
	
	private java.util.Date dateInscription;
	private String diplome;

	@ManyToOne
	private Enseignant encadrant;

	public Etudiant() {
		super();
	}

	public Etudiant(String cin, String nom, String prenom, java.util.Date date, byte[] photo, String cv, String email,String password, java.util.Date dateInscription, String diplome) {
		super(cin, nom, prenom, date, photo, cv, email, password);
		this.dateInscription = dateInscription;
		this.diplome = diplome;
	}

	public java.util.Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(java.util.Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

}
