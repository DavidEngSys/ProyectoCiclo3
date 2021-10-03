package com.inventarioTechnologyFinal.model.service;

import java.util.List;
import java.util.Optional;

import com.inventarioTechnologyFinal.model.entity.Almacen;

public interface AlmacenService {
	
	public Optional<Almacen> finById(Integer id);
	public List<Almacen> findAll();
	public Almacen save(Almacen almacen);
	public void deleteById(Integer id);

}