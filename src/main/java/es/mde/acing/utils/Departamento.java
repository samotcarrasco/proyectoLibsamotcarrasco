package es.mde.acing.utils;

import java.util.List;

import es.mde.acing.utils.DepartamentoImpl.TipoAcuartelamiento;
import es.mde.acing.utils.DepartamentoImpl.TipoEmpleo;

public interface Departamento {

	List<Material> getMaterialesOfertados();

	List<Material> getMaterialesAdquiridos();

	String getNombre();

	String getAbreviatura();

	TipoAcuartelamiento getAcuartelamiento();

	String getEmail();

	int getCredito();

	TipoEmpleo getResponsableEmpleo();

	String getResponsableNombre();

	String getTelefono();

	String getDireccion();

	String getLatitud();

	String getLongitud();

}