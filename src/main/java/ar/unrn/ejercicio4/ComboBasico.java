package ar.unrn.ejercicio4;

public class ComboBasico extends Combo {
	public ComboBasico(String descripcion, double precio) {
		super(descripcion, precio);
	}

	@Override
	public double calcularCostoTotal() {
		return precio;
	}
}
