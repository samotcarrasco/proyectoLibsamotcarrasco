package es.mde.acing.utils;
import java.time.LocalDate;


public abstract class MaterialImpl implements Material{
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
	private Departamento dptoOferta;
	private Departamento dptoAdquisicion;
	private Categoria categoria;
	private String descripcion;
	private String dimensiones;
	private String peso;
	private EstadoMaterial estado;
	private LocalDate fechaAdquisicion;
	private LocalDate fechaOferta;
	private String imagen;
	private int milis;
	private int cantidad;
	
	
	@Override
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Departamento getDeptoOferta() {
		return dptoOferta;
	}
	public void setDeptoOferta(Departamento deptoOferta) {
		this.dptoOferta = deptoOferta;
	}

	@Override
	public Departamento getDptoAdquisicion() {
		return dptoAdquisicion;
	}
	public void setDptoAdquisicion(Departamento dptoAdquisicion) {
		this.dptoAdquisicion = dptoAdquisicion;
	}

	@Override
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	@Override
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}

	@Override
	public EstadoMaterial getEstado() {
		return estado;
	}
	public void setEstado(EstadoMaterial estado) {
		this.estado = estado;
	}
	
	@Override
	public TipoMaterial getTipoMaterial() {
		return null;
	}

	@Override
	public LocalDate getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	@Override
	public LocalDate getFechaOferta() {
		return fechaOferta;
	}
	public void setFechaOferta(LocalDate fechaOferta) {
		this.fechaOferta = fechaOferta;
	}

	@Override
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public int getMilis() {
		return milis;
	}
	public void setMilis(int milis) {
		this.milis = milis;
	}

	@Override
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "MATERAL [Nombre=" + getNombre() +"]";
	}
	
		
}