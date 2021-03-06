package com.inventarioTechnologyFinal.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventarioTechnologyFinal.model.entity.Usuario;
import com.inventarioTechnologyFinal.repository.UsuarioRepository;

@Service
public class UsuarioServicesImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Optional<Usuario> findById(Long id) {
		
		return usuarioRepository.findById(id);
	}

	@Override
	public List<Usuario> findAll() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}

	@Override
	public void deleteById(Long id) {
		
		usuarioRepository.deleteById(id);;
		
	}

}
