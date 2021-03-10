import processing.core.PApplet;
import processing.core.PConstants;

public class ENEM {

	private int XPC, YPC, direm, Venem;

	public ENEM(int XPC) {
		this.XPC = XPC;
		this.YPC = -200;
		this.Venem = 100;
		this.direm = 0;
	}

	public void pintar(PApplet app) {
		app.rectMode(PConstants.CENTER);
		app.fill(0, 0, 0);
		app.rect(XPC, YPC, 60, 60);

	}

	public void mover() {
		switch (direm) {
		case 0:

			break;
		case 1:
			YPC += 1;
			
			break;
		case 2:
			XPC += 10;
			
			break;
		case 3:
			XPC -= 10;
			
			break;

		default:
			break;
		}

	}
	
	


public void setDirem(int direm) {
	this.direm = direm;
}
public void setVenem(int venem) {
	Venem = venem;
}

public int getVenem() {
	return Venem;
}

public int getDirem() {
	return direm;
}

	public int getXPC() {
		return XPC;
	}

	public int getYPC() {
		return YPC;
	}

}
