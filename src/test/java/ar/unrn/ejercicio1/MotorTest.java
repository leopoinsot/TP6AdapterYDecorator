package ar.unrn.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {

	@Test
	 void arrancarMotorElectrico() {
		var motorElectrico = new MotorElectrico();
		var adaptadorMotorElectrico = new AdaptadorMotorElectrico(motorElectrico);
		var arranco = adaptadorMotorElectrico.arrancar();
		assertTrue(arranco.equals("Se conecto el motor y Se activo el motor"));
	}

	@Test
	void acelerarMotorElectrico() {
		var motorElectrico = new MotorElectrico();
		var adaptadorMotorElectrico = new AdaptadorMotorElectrico(motorElectrico);
		var acelerar = adaptadorMotorElectrico.acelerar();
		assertTrue(acelerar.equals("El motor se esta moviendo mas rapido"));
	}

	@Test
	void apagarMotorElectrico() {
		var motorElectrico = new MotorElectrico();
		var adaptadorMotorElectrico = new AdaptadorMotorElectrico(motorElectrico);
		var apagar = adaptadorMotorElectrico.apagar();
		assertTrue(apagar.equals("El motor se detuvo y El motor se desconecto"));
	}
}