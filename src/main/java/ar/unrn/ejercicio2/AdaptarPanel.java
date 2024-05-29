package ar.unrn.ejercicio2;

import java.awt.*;

public class AdaptarPanel implements Panel{
	private Graphics2D g2d;
	public AdaptarPanel(Graphics2D g2d){
		this.g2d = g2d;
	}
	@Override
	public void dibujarCirculo(Coordenada cordenada, int radio) {
		g2d.drawOval(cordenada.x() - radio,
				cordenada.y() - radio,
				radio * 2,
				radio * 2);
	}
	@Override
	public void dibujarLinea(Coordenada cordenada, int longitud) {
		g2d.drawLine(cordenada.x(), cordenada.y(),cordenada.x() + longitud, cordenada.y());
	}
	@Override
	public void dibujarTexto(Coordenada coordenada, String texto) {
		g2d.drawString(texto, coordenada.x(), coordenada.y());
	}
}
