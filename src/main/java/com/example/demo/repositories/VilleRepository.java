package com.example.demo.repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entites.Pharmacie;
import com.example.demo.entites.Ville;
import com.example.demo.entites.Zone;



public interface VilleRepository extends JpaRepository<Ville,Integer>{

	Ville findById(int id);
	
	

}