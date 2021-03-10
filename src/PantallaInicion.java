import processing.core.PApplet;
import processing.core.PConstants;

public class PantallaInicion {

	

	public PantallaInicion() {
		

	}

	public void pintar(PApplet app) {
		app.rectMode(PConstants.CENTER);
		app.fill(0,200,100);
		app.rect(700,450,1400,900);
		app.textSize(80);
		app.fill(255);
		app.textAlign(PConstants.CENTER);
		app.text("AESTETIC DEAD", 700, 350);
		app.rectMode(PConstants.CENTER);
		app.rect(700, 750, 400, 100);
	}

	public void mover() {

	}

}
