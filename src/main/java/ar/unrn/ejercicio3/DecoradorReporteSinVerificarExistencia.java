package ar.unrn.ejercicio3;

import java.io.File;

public class DecoradorReporteSinVerificarExistencia implements Registrar{
	private Report reporte;
	private File file;

	public DecoradorReporteSinVerificarExistencia(Report reporte, File file){
		this.reporte = reporte;
		this.file = file;
	}

	@Override
	public void export() {
		if (file == null) {
			throw new IllegalArgumentException(
					"File es NULL; no puedo exportar..."
			);
		}
		reporte.export();
	}
}
