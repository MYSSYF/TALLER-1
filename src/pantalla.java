import java.util.ArrayList;

import processing.core.PApplet;

public class pantalla extends PApplet {

	public static void main(String[] args) {
		PApplet.main("pantalla");
	}

	@Override
	public void settings() {
		size(1400, 900);

	}

	int pant;

	Contadores cont;
	PantallaJuego XD;
	PantallaInicion XF;
	PantallaInstruciones XG;
	PantallaFinal XJ;
	PC pc;
	ArrayList<Aliado> alI;
	ArrayList<Aliado> alD;
	ArrayList<Bala> bal;
	ArrayList<BalaAL> val;
	ArrayList<ENEM> ene;
	ArrayList<Benem> ben;

	@Override
	public void setup() {
		pant = 0;

		XD = new PantallaJuego();
		XF = new PantallaInicion();
		XG = new PantallaInstruciones();
		XJ = new PantallaFinal();
		pc = new PC(700, 450);
		alI = new ArrayList<Aliado>();
		alD = new ArrayList<Aliado>();
		bal = new ArrayList<Bala>();
		val = new ArrayList<BalaAL>();
		ene = new ArrayList<ENEM>();
		ben = new ArrayList<Benem>();
		cont = new Contadores();
	}

	@Override
	public void draw() {

		ManejaPantalla();
		if (pant == 2) {
			cartucho();
			cartuchin();
			alis();
			enemugos();
			generadorenemigos();
			cartuchems();
			consecuencias();
			verifibalene();
			verifivalene();
			die();
		}
		cont.reseteadores();

	}

	public void cartucho() {
		for (int i = 0; i < bal.size(); i++) {
			bal.get(i).pintar(this);
			bal.get(i).mover();

			if (bal.get(i).getYB() <= -200) {
				bal.remove(i);
			}

		}
	}

	public void cartuchin() {
		for (int i = 0; i < val.size(); i++) {
			val.get(i).pintar(this);
			val.get(i).mover();

			if (val.get(i).getYBA() <= -200) {
				val.remove(i);

			}
		}
	}

	public void alis() {

		for (int i = 0; i < cont.getNalis(); i++) {
			alD.add(new Aliado(pc.getXPC() + (10 * i), pc.getYPC() + (10 * i)));
			alD.get(i).pintar(this);
			alD.get(i).setXAL(pc.getXPC() + (i * 55));
			alD.get(i).setYAL(pc.getYPC() + 10 + (i * 20));
		}

		for (int i = 0; i < cont.getNalis(); i++) {
			alI.add(new Aliado(pc.getXPC() - (55 * i), pc.getYPC() - (10 * i)));
			alI.get(i).pintar(this);
			alI.get(i).setXAL(pc.getXPC() - (i * 55));
			alI.get(i).setYAL(pc.getYPC() + 10 + (i * 20));

		}
	}

	public void generadorenemigos() {
		for (int i = 0; i < ene.size(); i++) {
			ene.get(i).pintar(this);
			ene.get(i).mover();

			ene.get(i).setDirem(1);

			if (cont.getBene() == 70) {
				ben.add(new Benem(ene.get(i).getXPC(), ene.get(i).getYPC()));
			}

			if (ene.get(i).getYPC() >= 900) {
				ene.remove(i);
			}

		}
	}

	public void verifibalene() {
		for (int i = 0; i < bal.size(); i++) {
			for (int j = 0; j < ene.size(); j++) {

				if (bal.get(i).getXB() >= ene.get(i).getXPC() - 40 && bal.get(i).getXB() <= ene.get(i).getXPC() + 40
						&& bal.get(i).getYB() <= ene.get(i).getYPC() + 20
						&& bal.get(i).getYB() >= ene.get(i).getYPC() - 20) {

					ene.get(i).setVenem(ene.get(i).getVenem() - bal.get(i).getDAÑO());
				}
			}
		}
	}

	public void verifivalene() {
		for (int i = 0; i < val.size(); i++) {
			for (int j = 0; j < ene.size(); j++) {

				if (val.get(i).getXBA() <= ene.get(i).getXPC() + 20 && val.get(i).getXBA() >= ene.get(i).getXPC() - 20
						&& val.get(i).getXBA() <= ene.get(i).getXPC() + 20
						&& val.get(i).getXBA() >= ene.get(i).getXPC() - 20) {

					ene.get(i).setVenem(ene.get(i).getVenem() - val.get(i).getDAÑOal());
					System.out.println("o");
				}
			}
		}
	}

	public void enemugos() {
		if (cont.getGenenem() == 20 && ene.size() <= 30) {
			int x = (int) random(100, 1300);
			ene.add(new ENEM(x));

		}
	}

	public void cartuchems() {
		for (int i = 0; i < ben.size(); i++) {
			ben.get(i).pintar(this);
			ben.get(i).mover();

			if (ben.get(i).getXB() <= pc.getXPC() + 15 && ben.get(i).getXB() >= pc.getXPC() - 15
					&& ben.get(i).getYB() <= pc.getYPC() + 15 && ben.get(i).getYB() >= pc.getYPC() - 15) {

				pc.setVIDA(pc.getVIDA() - ben.get(i).getDAÑO());
				ben.remove(i);

			}

			if (ben.get(i).getYB() >= 700) {
				ben.remove(i);

			}
		}
	}

	public void consecuencias() {
		if (pc.getVIDA() <= 0) {
			pant++;
		}
	}

	public void die() {
		for (int j = 0; j < ene.size(); j++) {
			if (ene.get(j).getVenem() <= 0) {
				ene.remove(j);
			}
		}

	}

	public void ManejaPantalla() {
		if (pant < 0) {
			pant = 0;
		}
		if (pant > 3) {
			pant = 3;
		}
		switch (pant) {
		case 0:
			XF.pintar(this);
			break;
		case 1:
			XG.pintar(this);
			break;
		case 2:
			XD.pintar(this, "vida :" + pc.getVIDA());
			break;
		case 3:
			XJ.pintar(this);
			break;

		default:
			break;
		}
		if (pant == 2) {
			pc.pintar(this);
			pc.mover();
		}
	}

	@Override
	public void keyPressed() {

		if (key == 'w' && pant == 2) {
			pc.setDirecion(1);
		}
		if (key == 'd' && pant == 2) {
			pc.setDirecion(2);
		}
		if (key == 's' && pant == 2) {
			pc.setDirecion(3);
		}
		if (key == 'a' && pant == 2) {
			pc.setDirecion(4);
		}

		if (key == ' ' && pant == 2 && cont.getGenenem2() >= 60) {
			cont.setDelayB2(1);
			if (pant == 2 && (cont.getDelayB() <= 1)) {
				bal.add(new Bala(pc.getXPC(), pc.getYPC()));

			}

			if (pant == 2 && (cont.getDelayB() <= 1)) {
				for (int i = 0; i < cont.getNalis(); i++) {
					val.add(new BalaAL(alD.get(i).getXAL(), alD.get(i).getYAL()));

				}
				for (int i = 0; i < cont.getNalis(); i++) {
					val.add(new BalaAL(alI.get(i).getXAL(), alI.get(i).getYAL()));

				}

			}
		}

		switch (key) {
		case '1':
			pant++;
			break;
		case '2':
			pant--;
			break;
		case 'q':
			cont.setMal(1);
			break;

		default:
			break;
		}

	}

	@Override
	public void mouseClicked() {
		if(pant==0||pant==1) {
	if(mouseX>=500&&mouseX<=900&&mouseY>=700&&mouseY<=800) {
		pant++;
	}
		}
	}

}
