package es.mde.acing.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;



public class DepartamentoL implements IDepartamento {
	
	public static enum TipoAcuartelamiento {
		ACING
	}
	public enum TipoEmpleo { 
		Soldado, 
		Cabo, 
		Suboficial, 
		Oficial
	}
	
	public List<MaterialL> materialesOfertados;	
	
	public List<MaterialL> materialesAdquiridos;
	
	private String nombre;
	private String abreviatura;
	private TipoAcuartelamiento acuartelamiento;
	private String email;
	private int credito;
	private TipoEmpleo responsableEmpleo;
	private String responsableNombre;
	private String telefono;
	private String direccion;
	private String latitud;
	private String longitud;
    
	
		


	public List<MaterialL> getMaterialesOfertados() {
		return materialesOfertados;
	}

	public void setMaterialesOfertados(List<MaterialL> materialesOfertados) {
		this.materialesOfertados = materialesOfertados;
	}

	public List<MaterialL> getMaterialesAdquiridos() {
		return materialesAdquiridos;
	}

	public void setMaterialesAdquiridos(List<MaterialL> materialesAdquiridos) {
		this.materialesAdquiridos = materialesAdquiridos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public TipoAcuartelamiento getAcuartelamiento() {
		return acuartelamiento;
	}

	public void setAcuartelamiento(TipoAcuartelamiento acuartelamiento) {
		this.acuartelamiento = acuartelamiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public TipoEmpleo getResponsableEmpleo() {
		return responsableEmpleo;
	}

	public void setResponsableEmpleo(TipoEmpleo responsableEmpleo) {
		this.responsableEmpleo = responsableEmpleo;
	}

	public String getResponsableNombre() {
		return responsableNombre;
	}

	public void setResponsableNombre(String responsableNombre) {
		this.responsableNombre = responsableNombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public void aumentarCredito(int cantidad) {
	    credito += cantidad;
	}
	

	public String getDireccion() {
		return direccion;
	}

	public String getLatitud() {
		return latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Departamento, nombre" + getAbreviatura() + "]";
	}
	
}