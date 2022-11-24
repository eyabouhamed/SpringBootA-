package com.example.demo.entities;

import java.util.Collection;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("ens")

public class Enseignant extends Member {
	
	
	private String grade;
	private String etablissement;

	// pour recuperer la liste des etudiants
	@OneToMany(mappedBy = "encadrant")
	private Collection<Etudiant> etudiants;

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(String cin, String nom, String prenom, java.util.Date date, byte[] photo, String cv, String email,String password, String grade, String etablissement) {
		super(cin, nom, prenom, date, photo, cv, email, password);
		this.grade = grade;
		this.etablissement = etablissement;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

}
