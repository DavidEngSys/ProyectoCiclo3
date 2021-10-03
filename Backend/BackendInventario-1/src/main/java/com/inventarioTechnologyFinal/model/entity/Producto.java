package com.inventarioTechnologyFinal.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	
	@Id
	@Column(name="id_producto")
	private Integer producto;
	
	@Column(name="descripcion_producto")
	private String descripcionProducto;
	
	@Column(name="cantidad_producto")
	private Integer cantidadProducto;
	
	@Column(name="id_almacen")
	private Integer idAlmacen;

	public Integer getProducto() {
		return producto;
	}

	public void setProducto(Integer producto) {
		this.producto = producto;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public Integer getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(Integer cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public Integer getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(Integer idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	@Override
	public String toString() {
		return "Producto [producto=" + producto + ", descripcionProducto=" + descripcionProducto + ", cantidadProducto="
				+ cantidadProducto + ", idProducto=" + idAlmacen + "]";
	}
	
	
	
	
}
