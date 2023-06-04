package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findById(int id);
	User findByEmail(String email);
	boolean existsByEmail(String email);
	 User findByEmailAndRole(String email, String role);
	 Optional<User> findById(Long id);
	
}