import processing.core.PApplet;
import processing.core.PConstants;

public class BalaAL {

	private int XBA, YBA, direcion, DAÑOal;

	public BalaAL(int XBA, int YBA) {
		this.XBA = XBA;
		this.YBA = YBA;
		this.DAÑOal = 100;
	}

	public void pintar(PApplet app) {
		app.rectMode(PConstants.CENTER);
		app.fill(255);
		app.ellipse(XBA, YBA, 10, 30);

	}

	public void mover() {
		YBA-=20;

	}

	public void setDirecion(int direcion) {
		this.direcion = direcion;
	}

	public int getDirecion() {
		return direcion;
	}

	public int getXBA() {
		return XBA;
	}

	public int getYBA() {
		return YBA;
	}
	public int getDAÑOal() {
		return DAÑOal;
	}

}
