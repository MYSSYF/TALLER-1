import processing.core.PApplet;
import processing.core.PConstants;

public class PantallaJuego {


	

	public PantallaJuego() {


	}

	public void pintar(PApplet app, String espacio) {
		app.rectMode(PConstants.CENTER);
		app.fill(119, 40, 244);
		app.rect(700, 450, 1400,900);
		app.fill(36, 195, 187);
		app.rect(100,450,200,900);
		app.fill(255, 193, 255);
		app.rect(700,824,1400,150);
		app.fill(255,255,255);
		app.rect(100,824,200,150);
		app.fill(81, 47, 174);
		app.textSize(40);
		app.text(espacio, 10, 100);
		
		
		
		
	
	
	}

		
	




}
