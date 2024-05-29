package ar.unrn.ejercicio1;

public class MotorEconomico implements Motor {
	public MotorEconomico() {
	}

	@Override
	public String arrancar() {
		return "El motor se apago";
	}

	@Override
	public String acelerar() {
		return "El motor acelero";
	}

	@Override
	public String apagar() {
		return "El motor se apago";
	}
}
