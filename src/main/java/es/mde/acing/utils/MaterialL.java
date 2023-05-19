package es.mde.acing.utils;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class MaterialL{
	private static final long serrialVersionUID = 1L;
	public static enum TipoMaterial {
		Inventariable,
	    noInventariable	
	}
	public static enum EstadoMaterial {
		disponible,
	    adquirido,
	    entregado
	}
	
	private String nombre;
	
	public DepartamentoL dptoOferta;
	
	public DepartamentoL dptoAdquisicion;
	
	public ICategoria categoria;
	
	private String descripcion;
	private String dimensiones;
	private String peso;
	private EstadoMaterial estado;
	private LocalDate fechaAdquisicion;
	private LocalDate fechaOferta;
	private String imagen;
	private int milis;
	private int cantidad;
	
     	 
    	 

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DepartamentoL getDeptoOferta() {
		return dptoOferta;
	}
	public void setDeptoOferta(DepartamentoL deptoOferta) {
		this.dptoOferta = deptoOferta;
	}

	public DepartamentoL getDptoAdquisicion() {
		return dptoAdquisicion;
	}
	public void setDptoAdquisicion(DepartamentoL dptoAdquisicion) {
		this.dptoAdquisicion = dptoAdquisicion;
	}

	public ICategoria getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaL categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}

	public EstadoMaterial getEstado() {
		return estado;
	}
	public void setEstado(EstadoMaterial estado) {
		this.estado = estado;
	}
	
	public TipoMaterial getTipoMaterial() {
		return null;
	}

	public LocalDate getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	public LocalDate getFechaOferta() {
		return fechaOferta;
	}
	public void setFechaOferta(LocalDate fechaOferta) {
		this.fechaOferta = fechaOferta;
	}

	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getMilis() {
		return milis;
	}
	public void setMilis(int milis) {
		this.milis = milis;
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "MATERIAL [Nombre=" + getNombre() +"]";
	}
	
		
}