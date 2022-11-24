package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Enseignant;

@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {

	@Query("select e from Enseignant e where e.nom like :x")
	public List<Enseignant> chercher(@Param("x") String mc);

	List<Enseignant> findByGrade(String grade);

	List<Enseignant> findByEtablissement(String etablissement);
}