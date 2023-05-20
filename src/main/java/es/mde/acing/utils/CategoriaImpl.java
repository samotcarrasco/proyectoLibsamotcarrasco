package es.mde.acing.utils;


import java.util.List;



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

	public CategoriaImpl() {}
	
	////@Override
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	//@Override
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	//@Override
	public TipoGrupo getGrupo() {
		return grupo;
	}

	public void setGrupo(TipoGrupo grupo) {
		this.grupo = grupo;
	}

	//@Override
	public int getMinMilis() {
		return minMilis;
	}

	public void setMinMilis(int minMilis) {
		this.minMilis = minMilis;
	}

	//@Override
	public int getMaxMilis() {
		return maxMilis;
	}

	public void setMaxMilis(int maxMilis) {
		this.maxMilis = maxMilis;
	}
	
    @Override
	public List<Material> getMateriales() {
		return materiales;
	}


	public void setMateriales(List<Material> materiales) {
		this.materiales = materiales;
	}

	



	public String toString() {
		return "Categoria nombre" + getCategoria() + "]";
	}



}