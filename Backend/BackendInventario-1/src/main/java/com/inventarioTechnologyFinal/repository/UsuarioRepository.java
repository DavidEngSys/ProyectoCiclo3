package com.inventarioTechnologyFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.inventarioTechnologyFinal.model.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	

}

