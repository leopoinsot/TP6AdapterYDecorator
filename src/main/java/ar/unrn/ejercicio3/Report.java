package ar.unrn.ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report implements Registrar{
	private String reporte;
	private File file;
	private FileWriter filewrite;
	public Report(String reporte, FileWriter filewrite, File file) {
		this.reporte = reporte;
		this.file = file;
		this.filewrite = filewrite;
	}

	public void export() {
		try{
		filewrite.write(reporte);
		filewrite.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
