import processing.core.PApplet;
import processing.core.PConstants;

public class Bala {

	private int XB, YB, direcion, DAÑO;

	public Bala(int XB, int YB) {
		this.XB = XB;
		this.YB = YB;
		this.DAÑO = 100;
	}

	public void pintar(PApplet app) {
		app.rectMode(PConstants.CENTER);
		app.fill(100, 1000, 0);
		app.ellipse(XB, YB, 50, 10);

	}

	public void mover() {
		YB-=10;

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
