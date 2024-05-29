package ar.unrn.ejercicio4;

public class ComboEspecial extends Combo {
	public ComboEspecial(String descripcion, double precio) {
		super(descripcion, precio);
	}

	@Override
	public double calcularCostoTotal() {
		return precio;
	}
}
