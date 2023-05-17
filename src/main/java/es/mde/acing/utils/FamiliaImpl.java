package es.mde.acing.utils;

import java.util.List;


public class FamiliaImpl {
	
	private Long id;
	
	//el enunciado de la familia debe ser único
	//no se permite hacer @Override de atributos(solo de metodos)
	// lo controlamos en el ORM, comprobado el funcionamiento
	
	
	List<Pregunta> preguntas;	
	
String enunciado;


	public Long getId() {
		return id;
	}
	

	public void setId(Long id) {
		this.id = id;
	}

	public List<Pregunta> getPreguntas() {
		return preguntas;
	}

	
	
	
	public String getEnunciado() {
		return enunciado;
	}


	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}


	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	
}