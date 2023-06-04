package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entites.User;
import com.example.demo.repositories.UserRepository;


@Service
public class UserService implements IDao<User> {
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public User save(User o) {
		return userRepository.save(o);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public void delete(User o) {
		userRepository.delete(o);

	}

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void updateUserRole(int userId, String role) {
		User user = userRepository.findById(userId);

		user.setRole(role);
		userRepository.save(user);
	}

	public boolean existsByEmail(String email) {
		return userRepository.existsByEmail(email);
	}

	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void update(User o) {
		userRepository.save(o);

	}

	@Override
	public List<User> findAll() {

		return userRepository.findAll();
	}

	public long count() {
		// TODO Auto-generated method stub
		return userRepository.count();
	}
	/*
	 * public void updateUserPharmacyId(int id, int pharmacyId) { User user =
	 * userRepository.findById(id); Pharmacie pharmacie =
	 * pharmacieRepository.findById(pharmacyId);
	 * 
	 * if (user != null && pharmacie != null) {
	 * 
	 * userRepository.save(user); } }
	 */

}