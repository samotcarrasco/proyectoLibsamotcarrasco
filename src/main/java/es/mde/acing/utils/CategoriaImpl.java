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



public class CategoriaImpl implements Categoria{
	
	public static enum TipoGrupo {
		Informatica,
	    Comunicaciones,
	    Mobiliario_Oficina,
	    Material_Oficina,
	    Otros
	}
	
	public List<Material> materiales;	
	
	private String categoria;
	private String descripcion;
	private TipoGrupo grupo;
	private int minMilis;
	private int maxMilis;

	
	@Override
	public String getCategoria() {
		return categoria;
	}

	@Override
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
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

	public void setMateriales(List<Material> materiales) {
		this.materiales = materiales;
	}


	public List<Material> getMateriales() {
		return materiales;
	}

	


	public String toString() {
		return "Categoria nombre" + getCategoria() + "]";
	}



}