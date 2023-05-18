package es.mde.acing.utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class UsuarioL {
	//private static final long serrialVersionUID = 1L;
	public static enum Rol {
		Administrator,
	    noAdministrator	
	}
	private Long id;
	
	private String nombre;
	
	private String username;
	
	//private Rol rol;
	private String password;
	private boolean accountNonExpired = true;
	private boolean accountNonLocked = true;
	private boolean credentialsNonExpired = true;
	private boolean enabled = true;
	
	
	List<PreguntaL> preguntas;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("PWD DESDE METODO SETTER: " + password);
		this.password = password;
	}
	
	public Rol getRol() {
		//los roles se obtendrán de las subclases
		return null;
	}

//	public void setRol(Rol rol) {
//		this.rol = rol;
//	}
	
	
	public List<PreguntaL> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(List<PreguntaL> preguntas) {
		this.preguntas = preguntas;
	}

	
	// metodos seguridad
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	

	
	@Override
	public String toString() {
		return "USUARIO (DESDE clase usuario) [Nombre=" + nombre + ", NombreUSER=" + username + "   ID " + id + "]" + password;
	}
	

		
}