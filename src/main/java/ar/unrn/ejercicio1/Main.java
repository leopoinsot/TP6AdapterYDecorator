package ar.unrn.ejercicio1;

public class Main {
	public static void main(String[] args) {
		var motorElectrico = new MotorElectrico();
		var adaptadorMotorElectrico = new AdaptadorMotorElectrico(motorElectrico);
		System.out.println(adaptadorMotorElectrico.arrancar());

	}
}
