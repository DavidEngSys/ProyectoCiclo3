package com.inventarioTechnologyFinal.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventarioTechnologyFinal.model.entity.Almacen;
import com.inventarioTechnologyFinal.repository.AlmacenRepository;

@Service
public class AlmacenServiceImpl implements AlmacenService{
	
	@Autowired
	AlmacenRepository almacenRepository;

	@Override
	public Optional<Almacen> finById(Integer id) {
		
		return almacenRepository.findById(id);
	}

	@Override
	public List<Almacen> findAll() {
		
		return almacenRepository.findAll();
	}

	@Override
	public Almacen save(Almacen almacen) {
		
		return almacenRepository.save(almacen);
	}

	@Override
	public void deleteById(Integer id) {
		
		almacenRepository.deleteById(id);
		
		
	}
	
	

}
