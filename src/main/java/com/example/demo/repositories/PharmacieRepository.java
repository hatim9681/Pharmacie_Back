package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Pharmacie;
import com.example.demo.entites.Zone;



public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer> {
	 Pharmacie findById(int id);

	
}

