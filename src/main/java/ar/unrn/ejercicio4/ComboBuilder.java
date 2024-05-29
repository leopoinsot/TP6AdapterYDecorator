package ar.unrn.ejercicio4;

public class ComboBuilder {
	private Combo combo;
	private Combo decorador;

	public ComboBuilder(Combo combo) {
		this.combo = combo;
		this.decorador = combo;
	}

	public ComboBuilder conCarne(double costo) {
		this.decorador = new PorcionCarne(costo, this.decorador);
		return this;
	}

	public ComboBuilder conPapas(double costo) {
		this.decorador = new PorcionPapas(costo, this.decorador);
		return this;
	}

	public ComboBuilder conQueso(double costo) {
		this.decorador = new PorcionQueso(costo, this.decorador);
		return this;
	}

	public ComboBuilder conTomate(double costo) {
		this.decorador = new PorcionTomate(costo, this.decorador);
		return this;
	}

	public Combo build() {
		return this.decorador;
	}
}
