package es.mde.acing.utils;



public class Inventariable extends MaterialImpl implements esInventariable {
	
	private String noc;
    private String numeroSerie;
	
	
    @Override
	public String getNoc() {
		return noc;
	}

	public void setNoc(String noc) {
		this.noc = noc;
	}

	@Override
	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public TipoMaterial getTipoMaterial() {
		return TipoMaterial.Inventariable;
	}

	@Override
	public String toString() {
		return super.toString() + "MATERIAL INVENTARIABLE [TLF" + super.getNombre() +" " +  getNoc() + "]";
	}

}
	