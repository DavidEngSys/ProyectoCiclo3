package com.inventarioTechnologyFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventarioTechnologyFinal.model.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
