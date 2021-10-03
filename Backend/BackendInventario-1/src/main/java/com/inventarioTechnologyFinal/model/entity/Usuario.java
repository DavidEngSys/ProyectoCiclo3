package com.inventarioTechnologyFinal.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@Column(name="id_usuario")
	private Long idusuario;
	
	@Column(name="nombre_completo")
	private String nombreCompleto;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="contrasena_usuario")
	private String contrasena;
	
	@Column(name="genero")
	private Boolean genero;
	
	@Column(name="perfil_Ususario")
	private Boolean perfilUsuario;

	public Long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Boolean getGenero() {
		return genero;
	}

	public void setGenero(Boolean genero) {
		this.genero = genero;
	}

	public Boolean getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(Boolean perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", nombreCompleto=" + nombreCompleto + ", usuario=" + usuario
				+ ", contrasena=" + contrasena + ", genero=" + genero + ", perfilUsuario=" + perfilUsuario + "]";
	}

	
	
}
