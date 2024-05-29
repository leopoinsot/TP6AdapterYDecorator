package ar.unrn.ejercicio4;

public class ComboFamiliar extends Combo {
	public ComboFamiliar(String descripcion, double precio) {
		super(descripcion, precio);
	}

	@Override
	public double calcularCostoTotal() {
		return precio;
	}
}
