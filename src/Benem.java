import processing.core.PApplet;
import processing.core.PConstants;

public class Benem {

	private int XB, YB, direcion, DAÑO;

	public Benem(int XB, int YB) {
		this.XB = XB;
		this.YB = YB;
		this.DAÑO = 10;
	}

	public void pintar(PApplet app) {
		app.rectMode(PConstants.CENTER);
		app.fill(100, 10, 0);
		app.ellipse(XB, YB, 10, 40);

	}

	public void mover() {
		YB+=6;

	}

	public void setDirecion(int direcion) {
		this.direcion = direcion;
	}

	public int getDirecion() {
		return direcion;
	}

	public int getXB() {
		return XB;
	}

	public int getYB() {
		return YB;
	}
	public int getDAÑO() {
		return DAÑO;
	}

}
