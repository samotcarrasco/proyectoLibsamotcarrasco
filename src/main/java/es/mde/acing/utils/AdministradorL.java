package es.mde.acing.utils;



public class AdministradorL extends UsuarioL {
	
	private String telefono;
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String tlf) {
		this.telefono = tlf;
	}
	public Rol getRol() {
		return Rol.Administrator;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Administrador [TLF" + telefono + "]";
	}


}
	