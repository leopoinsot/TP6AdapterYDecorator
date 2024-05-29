package ar.unrn.ejercicio5;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainConcursoParticipante {
	public static void main(String[] args) {
		var participante = new Participante("Leonel", 52);
		var concurso = new Concurso(LocalDateTime.now().minusDays(5),
				LocalDateTime.now().plusDays(5),
				43);
		var decorador = new DecoratorConcurso(concurso);
		decorador.persistirLocalmente();
	}
}