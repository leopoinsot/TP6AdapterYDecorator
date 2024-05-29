package ar.unrn.ejercicio1;

public class MotorComun implements Motor {
	public MotorComun() {
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
