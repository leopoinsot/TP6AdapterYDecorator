package ar.unrn.ejercicio1;

public class AdaptadorMotorElectrico implements Motor {
	private MotorElectrico motorElectrico;

	public AdaptadorMotorElectrico(MotorElectrico motorElectrico) {
		super();
		this.motorElectrico = motorElectrico;
	}

	@Override
	public String arrancar() {
		return motorElectrico.conectar() + " y " + motorElectrico.activar();
	}

	@Override
	public String acelerar() {
		return motorElectrico.moverMasRapido();
	}

	@Override
	public String apagar() {
		return motorElectrico.detener() + " y " + motorElectrico.desconectar();
	}
}
