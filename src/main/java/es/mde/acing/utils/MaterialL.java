package es.mde.acing.utils;

public class MaterialL {
	private int id;
	private String nombre;
	
	public MaterialL (int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Material [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
