package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("/api/user")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserService userrepository;

	  @Autowired
	    private UserRepository userRepository;
	@PostMapping("/save")
	public void save(@RequestBody User user) {
		userrepository.save(user);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		User s = userrepository.findById(Integer.parseInt(id));
		userrepository.delete(s);
	}
	@GetMapping("/all")
	public List<User> findAll() {
		return userrepository.findAll();
	}

	@GetMapping(value = "/count")
	public long countFiliere() {
		return userrepository.count();
	}
	
	 
	 
	/* @PutMapping("/{userId}/pharmacy/{pharmacyId}")
	    public ResponseEntity<String> updateUserPharmacyId(
	            @PathVariable int userId,
	            @PathVariable int pharmacyId) {
	        userService.updateUserPharmacyId(userId, pharmacyId);
	        return ResponseEntity.ok("Pharmacy ID updated for user");
	    }
	 */






	 
}
