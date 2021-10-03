package com.inventarioTechnologyFinal.model.service;

import java.util.List;
import java.util.Optional;



import com.inventarioTechnologyFinal.model.entity.Usuario;


public interface UsuarioService {
	
	public Optional<Usuario> findById(Long id);
	
	public List<Usuario>  findAll();
	
	public Usuario save(Usuario usuario);
	
	public void deleteById(Long id);

}
