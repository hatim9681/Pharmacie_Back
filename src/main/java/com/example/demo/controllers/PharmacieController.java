package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Pharmacie;

import com.example.demo.service.*;


@RestController
@CrossOrigin
@RequestMapping("/api/pharmacies")
public class PharmacieController {
	@Autowired
	private com.example.demo.service.PharmacyService pharmacyService;
	


	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Pharmacie s = pharmacyService.findById(Integer.parseInt(id));
		pharmacyService.delete(s);
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Pharmacie pharma) {
		pharmacyService.save(pharma);
	}

	@GetMapping("")
	public List<Pharmacie> findAll() {
		return pharmacyService.findAll();
	}

}