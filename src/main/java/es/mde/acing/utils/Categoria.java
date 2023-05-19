package es.mde.acing.utils;

import java.util.List;

import es.mde.acing.utils.CategoriaImpl.TipoGrupo;

public interface Categoria {

	String getCategoria();

	void setCategoria(String categoria);

	String getDescripcion();

	void setDescripcion(String descripcion);

	TipoGrupo getGrupo();

	List<Material> getMateriales();



}