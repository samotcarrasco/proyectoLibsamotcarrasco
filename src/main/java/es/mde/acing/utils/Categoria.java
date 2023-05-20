package es.mde.acing.utils;

import java.util.Collection;
import java.util.List;

import es.mde.acing.utils.CategoriaImpl.TipoGrupo;

public interface Categoria {

	String getCategoria();

	String getDescripcion();

	TipoGrupo getGrupo();

	Collection<Material> getMateriales();
	
	int getMinMilis();
	
	int getMaxMilis();



}