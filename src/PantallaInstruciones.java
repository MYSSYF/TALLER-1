import processing.core.PApplet;
import processing.core.PConstants;

public class PantallaInstruciones {

	public PantallaInstruciones() {

	}

	public void pintar(PApplet app) {
		app.rectMode(PConstants.CENTER);
		app.fill(191, 60, 104);
		app.rect(700, 450, 1400, 900);
		app.fill(0, 200, 100);
		app.textSize(40);
		app.textAlign(PConstants.CENTER);
		app.text(
				"usa las teclas WASD para moverte alrededor\n presiona 1 sola vez ESPACIO para disparar,\n ser cuidadoso "
				+ "pues crashea, usar como los cambios de un vehiculo\n y Q para mejorar",
				700, 200);
		app.rectMode(PConstants.CENTER);
		app.rect(700, 750, 400, 100);
	}

	public void mover() {

	}

}
