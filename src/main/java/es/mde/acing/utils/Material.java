package es.mde.acing.utils;

import java.time.LocalDate;

import es.mde.acing.utils.MaterialImpl.EstadoMaterial;
import es.mde.acing.utils.MaterialImpl.TipoMaterial;

public interface Material {

	String getNombre();

	Departamento getDeptoOferta();

	Departamento getDptoAdquisicion();

	Categoria getCategoria();

	String getDescripcion();

	String getDimensiones();

	String getPeso();

	EstadoMaterial getEstado();

	TipoMaterial getTipoMaterial();

	LocalDate getFechaAdquisicion();

	LocalDate getFechaOferta();

	String getImagen();

	int getMilis();

	int getCantidad();

}