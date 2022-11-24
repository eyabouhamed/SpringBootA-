package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.MemberRepository;
import com.example.demo.entities.Enseignant;
import com.example.demo.entities.Etudiant;
import com.example.demo.entities.Member;

@SpringBootApplication
public class SpringBootAppApplication implements CommandLineRunner {
	
@Autowired
MemberRepository memberRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = dateFormatter.parse("2010-05-01");
		Date date2 = dateFormatter.parse("2010-05-01");
		
		List<Member> members ;
 		Etudiant etd1=new Etudiant("3245667","bouhamed","eya",date1,null,"","eya.bouhamed@enis.tn","11111",date1,"these");
		Etudiant etd2=new Etudiant("3245667000","bouhamed","eyaaa",date2,null,"","eya.bouhamed@enis.tn","11111",date2,"master");
		
		Enseignant ens1=new Enseignant("324566709876","bouhamed","eya",date1,null,"","eya.bouhamed@enis.tn","11111","maitre assistant","enis");
		Enseignant ens2=new Enseignant("324566700023","bouhamed","eyaaa",date2,null,"","eya.bouhamed@enis.tn","11111","professeur","enis");
		
		memberRepository.save(etd1);
		memberRepository.save(etd2);
		
		memberRepository.save(ens1);
		memberRepository.save(ens2);
		
		 
		
 		 

		
		
	}
}
