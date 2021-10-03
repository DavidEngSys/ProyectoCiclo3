package com.inventarioTechnologyFinal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventarioTechnologyFinal.model.entity.Usuario;
import com.inventarioTechnologyFinal.model.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/{id}")
	public Optional<Usuario> buscarPorId(@PathVariable Long id) {
		
		return usuarioService.findById(id);
		
	}
	
	@GetMapping("/listar")
	public List<Usuario> listar(){
		
		return usuarioService.findAll();
	}
	
	@PostMapping
	public Usuario guardar(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@PutMapping("/actualizar/{id}")
	public Usuario actualizar(@RequestBody Usuario usuario, @PathVariable Long id ) {
		
		Usuario uEnBD = buscarPorId(id).get();
		uEnBD.setNombreCompleto(usuario.getNombreCompleto());
		uEnBD.setUsuario(usuario.getUsuario());
		uEnBD.setContrasena(usuario.getContrasena());
		uEnBD.setGenero(usuario.getGenero());
		uEnBD.setPerfilUsuario(usuario.getPerfilUsuario());
		
		return guardar(uEnBD);
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Long id) {
		
		usuarioService.deleteById(id);
				
	}
	
	
	
	
	
}

