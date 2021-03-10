import processing.core.PApplet;
import processing.core.PConstants;

public class PantallaFinal {

	

	public PantallaFinal() {
		

	}

	public void pintar(PApplet app) {
		app.rectMode(PConstants.CENTER);
		app.fill(100, 0, 100);
		app.rect(700, 450, 1400,900);
		app.textSize(90);
		app.fill(255);
		app.textAlign(PConstants.CENTER);
		app.text("PERDISTE", 700, 450);
	}

	public void mover() {

	}

}
