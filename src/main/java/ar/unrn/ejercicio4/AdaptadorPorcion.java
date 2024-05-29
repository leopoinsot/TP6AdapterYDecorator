package ar.unrn.ejercicio4;

public abstract class AdaptadorPorcion extends Combo {
	private double costoAdicional;
	private Combo combo;

	public AdaptadorPorcion(double costoAdicional, Combo combo) {
		super();
		this.costoAdicional = costoAdicional;
		this.combo = combo;
	}

	@Override
	public double calcularCostoTotal() {
		return combo.calcularCostoTotal() + costoAdicional;
	}
}
