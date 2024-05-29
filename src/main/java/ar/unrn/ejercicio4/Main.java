package ar.unrn.ejercicio4;

public class Main {
	public static void main(String[] args) {
		var pedido1 = new Pedido("45260986", new PorcionCarne(20, new ComboFamiliar("milangas", 4000)));
		System.out.print("El costo total del combo es: " + pedido1.calcularCostoTotal());

		var comboBuilder = new ComboBuilder(new ComboBasico("tostado", 300));
		var pedido2 = new Pedido("45260986", comboBuilder.conQueso(20).conCarne(30).build());
		System.out.print("El costo total del combo es: " + pedido2.calcularCostoTotal());
	}
}

