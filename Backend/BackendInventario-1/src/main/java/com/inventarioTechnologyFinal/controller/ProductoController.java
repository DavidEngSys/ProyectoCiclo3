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

import com.inventarioTechnologyFinal.model.entity.Producto;
import com.inventarioTechnologyFinal.model.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/{id}")
	public Optional<Producto> BuscarPorId(@PathVariable Integer id){
		return productoService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		
		return productoService.findAll();
	}
	
	@PostMapping 
	public Producto guardar(@RequestBody Producto producto) {
		
		return productoService.save(producto);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		productoService.deleteById(id);
		
	}
	
	@PostMapping("/actualizar")
	public Producto actualizar(@RequestBody Producto producto) {
		
	Producto pEnBD = productoService.findById(producto.getProducto()).get();
	
	
	pEnBD.setDescripcionProducto(producto.getDescripcionProducto());
	pEnBD.setCantidadProducto(producto.getCantidadProducto());
	pEnBD.setIdAlmacen(producto.getIdAlmacen());
	
	
	return productoService.save(pEnBD);
	}

	

}
