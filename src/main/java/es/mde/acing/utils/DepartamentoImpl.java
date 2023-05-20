package es.mde.acing.utils;


import java.util.List;



public class DepartamentoImpl implements Departamento {
	
	public static enum TipoAcuartelamiento {
		ACING
	}
	public enum TipoEmpleo { 
		Soldado, 
		Cabo, 
		Suboficial, 
		Oficial
	}
	
	public List<Material> materialesOfertados;	
	
	public List<Material> materialesAdquiridos;
	
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
    
	
   public DepartamentoImpl() {}


	@Override
	public List<Material> getMaterialesOfertados() {
		return materialesOfertados;
	}

	public void setMaterialesOfertados(List<Material> materialesOfertados) {
		this.materialesOfertados = materialesOfertados;
	}

	@Override
	public List<Material> getMaterialesAdquiridos() {
		return materialesAdquiridos;
	}

	public void setMaterialesAdquiridos(List<Material> materialesAdquiridos) {
		this.materialesAdquiridos = materialesAdquiridos;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	@Override
	public TipoAcuartelamiento getAcuartelamiento() {
		return acuartelamiento;
	}

	public void setAcuartelamiento(TipoAcuartelamiento acuartelamiento) {
		this.acuartelamiento = acuartelamiento;
	}

	@Override
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	@Override
	public TipoEmpleo getResponsableEmpleo() {
		return responsableEmpleo;
	}

	public void setResponsableEmpleo(TipoEmpleo responsableEmpleo) {
		this.responsableEmpleo = responsableEmpleo;
	}

	@Override
	public String getResponsableNombre() {
		return responsableNombre;
	}

	public void setResponsableNombre(String responsableNombre) {
		this.responsableNombre = responsableNombre;
	}

	@Override
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	@Override
	public String getDireccion() {
		return direccion;
	}

	@Override
	public String getLatitud() {
		return latitud;
	}

	@Override
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