package ar.unrn.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private String dni;
	private List<Combo> combos = new ArrayList<>();

	public Pedido(String dni, Combo... combos) {
		this.dni = dni;
		this.combos = List.of(combos);
	}

	public double calcularCostoTotal() {
		double total = 0;
		for (Combo combo : combos) {
			total = total + combo.calcularCostoTotal();
		}
		return total;
	}
}
