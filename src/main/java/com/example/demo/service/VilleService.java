package com.example.demo.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;
import com.example.demo.entites.Ville;
import com.example.demo.entites.Zone;
import com.example.demo.repositories.VilleRepository;



@Service
public class VilleService  implements IDao<Ville> {

	@Autowired
	private VilleRepository villerepository;

	@Override
	public Ville save(Ville o) {
		return villerepository.save(o);
	}

	@Override
	public Ville findById(int id) {
		// TODO Auto-generated method stub
		return villerepository.findById(id);
	}

	@Override
	public void delete(Ville o) {
		villerepository.delete(o);

	}

	@Override
	public void update(Ville o) {
		villerepository.save(o);

	}
	

	@Override
	public List<Ville> findAll() {
		
		return villerepository.findAll();
	}


	public long count() {
		// TODO Auto-generated method stub
		return villerepository.count();
	}
	
	
	


}
