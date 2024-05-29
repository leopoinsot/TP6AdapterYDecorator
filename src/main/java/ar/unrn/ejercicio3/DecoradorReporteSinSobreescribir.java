package ar.unrn.ejercicio3;

import java.io.File;

public class DecoradorReporteSinSobreescribir implements Registrar{
	private Report reporte;
	private File file;

	public DecoradorReporteSinSobreescribir(Report reporte, File file){
		this.reporte = reporte;
		this.file = file;
	}

	@Override
	public void export() {
		if (file.exists()) {
			throw new IllegalArgumentException(
					"El archivo ya existe..."
			);
		}
		reporte.export();
	}
}
