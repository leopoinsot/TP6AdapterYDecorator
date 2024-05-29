package ar.unrn.ejercicio4;

public abstract class Combo {
	protected String descripcion;
	protected double precio;

	public Combo() {
	}

	public Combo(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public abstract double calcularCostoTotal();
}
