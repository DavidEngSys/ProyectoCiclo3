package com.inventarioTechnologyFinal.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="almacenes")
public class Almacen {
	
	@Id
	@Column(name="id_almacen")
	private Integer idAlmacen;
	
	@Column(name="nombre_almacen")
	private String nombreAlmacen;
	
	@Column(name="direccion_almacen")
	private String direccionAlmacen;
	
	@Column(name="telefono_almacen")
	private String telefonoAlmacen;

	public Integer getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(Integer idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public String getNombreAlmacen() {
		return nombreAlmacen;
	}

	public void setNombreAlmacen(String nombreAlmacen) {
		this.nombreAlmacen = nombreAlmacen;
	}

	public String getDireccionAlmacen() {
		return direccionAlmacen;
	}

	public void setDireccionAlmacen(String direccionAlmacen) {
		this.direccionAlmacen = direccionAlmacen;
	}

	public String getTelefonoAlmacen() {
		return telefonoAlmacen;
	}

	public void setTelefonoAlmacen(String telefonoAlmacen) {
		this.telefonoAlmacen = telefonoAlmacen;
	}

	@Override
	public String toString() {
		return "Almacen [idAlmacen=" + idAlmacen + ", nombreAlmacen=" + nombreAlmacen + ", direccionAlmacen="
				+ direccionAlmacen + ", telefonoAlmacen=" + telefonoAlmacen + "]";
	}
	
	

}
