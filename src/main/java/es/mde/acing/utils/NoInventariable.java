package es.mde.acing.utils;


import jakarta.validation.constraints.NotBlank;


public class NoInventariable extends MaterialImpl implements esNoInvetnariable {
	
	private int bonificacion;
    


	@Override
	public int getBonificacion() {
		return bonificacion;
	}



	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}

	public TipoMaterial getTipoMaterial() {
		return TipoMaterial.noInventariable;
	}

	@Override
	public String toString() {
		return super.toString() + "MATERIAL INVENTARIABLE [TLF" + super.getNombre() +" " +  getBonificacion() + "]";
	}

}
	