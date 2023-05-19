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



public class CategoriaL implements ICategoria{
	
	public static enum TipoGrupo {
		Informatica,
	    Comunicaciones,
	    Mobiliario_Oficina,
	    Material_Oficina,
	    Otros
	}
	
	public List<MaterialL> materiales;	
	
	private String categoria;
	private String descripcion;
	private TipoGrupo grupo;
	private int minMilis;
	private int maxMilis;

	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoGrupo getGrupo() {
		return grupo;
	}

	public void setGrupo(TipoGrupo grupo) {
		this.grupo = grupo;
	}

	public int getMinMilis() {
		return minMilis;
	}

	public void setMinMilis(int minMilis) {
		this.minMilis = minMilis;
	}

	public int getMaxMilis() {
		return maxMilis;
	}

	public void setMaxMilis(int maxMilis) {
		this.maxMilis = maxMilis;
	}

	public void setMateriales(List<MaterialL> materiales) {
		this.materiales = materiales;
	}


	public List<MaterialL> getMateriales() {
		return materiales;
	}

	public void setPreguntas(List<MaterialL> materiales) {
		this.materiales = materiales;
	}
	

	@Override
	public String toString() {
		return "Categoria nombre" + getCategoria() + "]";
	}
	
}