package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entites.Pharmacie;
import com.example.demo.repositories.PharmacieRepository;



@Service
public class PharmacyService implements IDao<Pharmacie> {
	private PharmacieRepository pharmacieRepository;

	@Override
	public Pharmacie save(Pharmacie o) {
		// TODO Auto-generated method stub
		return pharmacieRepository.save(o);
	}

	@Override
	public Pharmacie findById(int id) {
		// TODO Auto-generated method stub
		return pharmacieRepository.findById(id);
	}

	@Override
	public void delete(Pharmacie o) {
		pharmacieRepository.delete(o);
	}

	@Override
	public void update(Pharmacie o) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Pharmacie> findAll() {
		// TODO Auto-generated method stub
		return pharmacieRepository.findAll();
	}

}
