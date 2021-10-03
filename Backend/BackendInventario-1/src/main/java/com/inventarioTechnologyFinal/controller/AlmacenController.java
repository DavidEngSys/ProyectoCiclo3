package com.inventarioTechnologyFinal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventarioTechnologyFinal.model.entity.Almacen;
import com.inventarioTechnologyFinal.model.service.AlmacenService;

@RestController
@RequestMapping("/api/almacenes")
public class AlmacenController {
	
	@Autowired
	AlmacenService almacenService;
	
	@GetMapping("/{id}")
	public Optional<Almacen> BuscarPorId(@PathVariable Integer id) {
		
		return almacenService.finById(id);
	}
	
	@GetMapping("/listar")
	public List<Almacen> listar(){
		
		return almacenService.findAll();
	}
	
	@PostMapping 
	public Almacen guardar(@RequestBody Almacen almacen) {
		
		return almacenService.save(almacen);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		almacenService.deleteById(id);
	}
	
	@PostMapping("/actualizar")
	public Almacen actualizar(@RequestBody Almacen almacen) {
		
	Almacen aEnBD = almacenService.finById(almacen.getIdAlmacen()).get();
	
	
	aEnBD.setNombreAlmacen(almacen.getNombreAlmacen());
	aEnBD.setDireccionAlmacen(almacen.getDireccionAlmacen());
	aEnBD.setTelefonoAlmacen(almacen.getTelefonoAlmacen());
	
	
	return almacenService.save(aEnBD);
	}



}
