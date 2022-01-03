package com.jsog.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "cliente")
public class Persona {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "nombres")
    private String nombres;
	@Column(name = "apellidoxs")
	private String apellidos;
	@Column(name = "tipo_documento")
	private String tipo_documento;
	@Column(name = "nro_documento")
	private int nro_documento;
	@Column(name = "email")
	private String email;
	@Column(name = "fecha_nacimiento")
	private String fecha_nacimiento;
	@Column(name = "fecha_creacion")
	private String fecha_creacion;
	
/*	public Persona() {
		super();
		
	}*/

/*	public Persona(int id, String nombres, String apellidos, String tipo_documento, int nro_documento, String email,
			String fecha_nacimiento, String fecha_creacion) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipo_documento = tipo_documento;
		this.nro_documento = nro_documento;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_creacion = fecha_creacion;
	}*/

	public int getID() {
		return id;
	}

	public void setID(int iD) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo_Documento() {
		return tipo_documento;
	}

	public void setTipo_Documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public int getNro_Documento() {
		return nro_documento;
	}

	public void setNro_Documento(int nro_documento) {
		this.nro_documento = nro_documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFecha_Nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		fecha_nacimiento = fecha_Nacimiento;
	}

	public String getFecha_Creacion() {
		return fecha_creacion;
	}

	public void setFecha_Creacion(String fecha_Creacion) {
		fecha_creacion = fecha_Creacion;
	}

}