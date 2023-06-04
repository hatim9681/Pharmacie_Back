package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Zone;



public interface ZoneRepository extends JpaRepository<Zone, Integer> {
	Zone findById(int id);
}