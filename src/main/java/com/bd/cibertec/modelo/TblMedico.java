package com.bd.cibertec.modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class TblMedico {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idmedico;
	private String nombre;
	private String apellido;
	private String email;
	private String dni;
	private String estadocivil;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	private Date fechanacim;
	
	// Constructores
	public TblMedico(int idmedico, String nombre, String apellido, String email, String dni, String estadocivil,
			Date fechanacim) {
		//super();
		this.idmedico = idmedico;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.dni = dni;
		this.estadocivil = estadocivil;
		this.fechanacim = fechanacim;
	}
	
	public TblMedico() {
		//super();
	}

	// Getters & Setters 
	public int getIdmedico() {
		return idmedico;
	}

	public void setIdmedico(int idmedico) {
		this.idmedico = idmedico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public Date getFechanacim() {
		return fechanacim;
	}

	public void setFechanacim(Date fechanacim) {
		this.fechanacim = fechanacim;
	}
	
	
	

} // Fin de la clase
