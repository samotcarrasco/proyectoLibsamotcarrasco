package es.mde.acing.utils;

public class Pregunta {
	
	private Long id;
	private String enunciado;
	private Usuario usuario;	

	private FamiliaImpl familia;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public FamiliaImpl getFamilia() {
		return familia;
	}

	public void setFamilia(FamiliaImpl familia) {
		this.familia = familia;
	}
	
	
	@Override
	public String toString() {
		return "Pregunta [id=" + id + ", enunciado=" + enunciado + ", usuario=" + usuario+ "]";
	}
	
	
	
}