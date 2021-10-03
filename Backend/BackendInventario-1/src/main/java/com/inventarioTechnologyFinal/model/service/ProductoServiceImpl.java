package com.inventarioTechnologyFinal.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventarioTechnologyFinal.model.entity.Producto;
import com.inventarioTechnologyFinal.repository.ProductoRepository;

@Service
public class ProductoServiceImpl  implements ProductoService{

	@Autowired
	ProductoRepository productoRepository;
	
	@Override
	public Optional<Producto> findById(Integer id) {
		
		return productoRepository.findById(id);
	}

	@Override
	public List<Producto> findAll() {
		
		return productoRepository.findAll();
	}

	@Override
	public Producto save(Producto producto) {
		
		return productoRepository.save(producto);
	}

	@Override
	public void deleteById(Integer id) {
		
		productoRepository.deleteById(id);
		
		
	}
	
	

}
