package ar.unrn.ejercicio5;

import java.time.LocalDateTime;

public class DecoratorConcurso {
	private Concurso concurso;
	private Concurso decorador;

	public DecoratorConcurso(Concurso concurso) {
		this.concurso = concurso;
		this.decorador = concurso;
	}

	public void enviarMail(Participante participante, LocalDateTime fechaInscripcion) {
		concurso.InscribirParticipante(participante, fechaInscripcion);
		System.out.println("Email Enviado");
	}

	public String persistirLocalmente() {
		return "Se guardo en disco";
	}

	public String presistirEnBaseDeDatos() {
		return "Se guardo en la base de datos";
	}
}
