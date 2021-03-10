import processing.core.PApplet;
import processing.core.PConstants;

public class PC {

	private int XPC, YPC, direcion, VIDA;

	public PC(int XPC, int YPC) {
		this.XPC = XPC;
		this.YPC = YPC;
		this.VIDA = 100;
	}

	public void pintar(PApplet app) {
		app.rectMode(PConstants.CENTER);
		app.fill(0, 255, 0);
		app.rect(XPC, YPC, 50, 50);

	}

	public void mover() {
		switch (direcion) {
		case 0:

			break;
		case 1:
			YPC = YPC - 20;
			
			break;
		case 2:
			XPC = XPC + 20;
			
			break;
		case 3:
			YPC = YPC + 20;
		
			break;
		case 4:
			XPC = XPC - 20;
			break;

		default:
			break;
		}
		if(direcion!=0) {
			direcion=0;
		}

	}
	
	


	public void setDirecion(int direcion) {
		this.direcion = direcion;
	}
	public void setVIDA(int vIDA) {
		VIDA = vIDA;
	}

	public int getDirecion() {
		return direcion;
	}

	public int getXPC() {
		return XPC;
	}

	public int getYPC() {
		return YPC;
	}
	public int getVIDA() {
		return VIDA;
	}

}
