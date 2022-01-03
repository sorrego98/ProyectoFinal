package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Cliente")


public class persona {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int ID;
	private String Nombres;
	private String Apellidos;
	private String Tipo_Documento;
	private int Nro_Documento;
	private String email;
	private String Fecha_Nacimiento;
	private String Fecha_Creacion;
	
	public persona() {
		
	}

	public persona(int iD, String nombres, String apellidos, String tipo_Documento, int nro_Documento, String email,
			String fecha_Nacimiento, String fecha_Creacion) {
		super();
		ID = iD;
		Nombres = nombres;
		Apellidos = apellidos;
		Tipo_Documento = tipo_Documento;
		Nro_Documento = nro_Documento;
		this.email = email;
		Fecha_Nacimiento = fecha_Nacimiento;
		Fecha_Creacion = fecha_Creacion;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getTipo_Documento() {
		return Tipo_Documento;
	}

	public void setTipo_Documento(String tipo_Documento) {
		Tipo_Documento = tipo_Documento;
	}

	public int getNro_Documento() {
		return Nro_Documento;
	}

	public void setNro_Documento(int nro_Documento) {
		Nro_Documento = nro_Documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getFecha_Creacion() {
		return Fecha_Creacion;
	}

	public void setFecha_Creacion(String fecha_Creacion) {
		Fecha_Creacion = fecha_Creacion;
	}
	
	
}
