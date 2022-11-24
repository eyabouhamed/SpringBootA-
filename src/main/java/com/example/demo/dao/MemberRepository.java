package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Member;

// the link between objects & db

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

	@Query("select m from Member m where m.nom like :x")
	public java.util.List<Member> chercher(@Param("x") String mc);

	Member findByCin(String cin);
	
	List<Member> findByNomStartingWith(String caractere);

	Member findByEmail(String email);
	
 }