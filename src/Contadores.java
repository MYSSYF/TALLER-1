public class Contadores {

	private int DelayB, DelayB2, Nalis, Mal, genenem, bene,genenem2;

	public Contadores() {
		this.DelayB = 0;
		this.DelayB2 = 0;
		this.Nalis = 0;
		this.Mal = 0;
		this.genenem = 0;
		this.genenem2 = 0;
		this.bene = 0;

	}

	public void reseteadores() {
		if (DelayB2 >= 1) {
			DelayB++;
		}

		if (DelayB >= 31) {
			DelayB = 0;
			DelayB2 = 0;
		}
		if (Mal >= 1) {
			Nalis++;
			Mal = 0;
		}
		if (Nalis >= 4) {
			Nalis = 4;
		}

		genenem++;
		if (genenem == 100) {

			genenem = 0;
		}
		genenem2++;
		if (genenem2== 350) {

			genenem2 = 350;
		}
		bene++;
		if (bene == 100) {

			bene = 0;
		}

	}

	public int getDelayB() {
		return DelayB;
	}

	public void setDelayB2(int delayB2) {
		DelayB2 = delayB2;
	}

	public int getNalis() {
		return Nalis;
	}

	public void setNalis(int nalis) {
		Nalis = nalis;
	}

	public void setMal(int mal) {
		Mal = mal;
	}

	public int getMal() {
		return Mal;
	}

	public int getGenenem() {
		return genenem;
	}

	public int getBene() {
		return bene;
	}
	
	public int getGenenem2() {
		return genenem2;
	}

}
