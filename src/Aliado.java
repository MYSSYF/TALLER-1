import processing.core.PApplet;
import processing.core.PConstants;

public class Aliado {

	private int XAL, YAL, direcion;

	public Aliado(int XAL, int YAL) {
		this.XAL = XAL;
		this.YAL = YAL;
		
	}

	public void pintar(PApplet app) {
		app.rectMode(PConstants.CENTER);
		app.fill(0, 0, 255);
		app.rect(XAL, YAL, 50, 50);

	}


	public void setDirecion(int direcion) {
		this.direcion = direcion;
	}

	public int getDirecion() {
		return direcion;
	}

	public int getXAL() {
		return XAL;
	}

	public int getYAL() {
		return YAL;
	}

	public void setXAL(int xAL) {
		XAL = xAL;
	}
	public void setYAL(int yAL) {
		YAL = yAL;
	}
}
