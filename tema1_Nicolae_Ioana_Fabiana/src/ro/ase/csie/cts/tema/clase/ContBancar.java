package ro.ase.csie.cts.tema.clase;

import ro.ase.csie.cts.tema.enumerari.TipContBancar;
import ro.ase.csie.cts.tema.exceptii.ExceptieValoareImprumutInvalida;

public class ContBancar {
	private static final double COMISION_INITIAL = 0.0;
	private static final double COMISION_BROKER = 0.125;
	private static final int TOTAL_ZILE_LUNA = 30;

	private double valoareImprumut, procentajDobanda;
	private int zileActiveCont;
	private TipContBancar tipContBancar;

	public ContBancar(double valoareImprumut, double procentajDobanda, int zileActiveCont, TipContBancar tipContBancar)
			throws ExceptieValoareImprumutInvalida {
		this.setValoareImprumut(valoareImprumut);
		this.procentajDobanda = procentajDobanda;
		this.zileActiveCont = zileActiveCont;
		this.tipContBancar = tipContBancar;
	}

	public double getProcentajDobanda() {
		return this.procentajDobanda;
	}

	public double calculeazaRataLunara() {
		return this.valoareImprumut * this.procentajDobanda;
	}

	private void setValoareImprumut(double valoareImprumut) throws ExceptieValoareImprumutInvalida {
		if (valoareImprumut <= 0) {
			throw new ExceptieValoareImprumutInvalida(
					"Valoarea imprumutului trebuie sa fie o valoare mai mare decat 0");
		} else {
			this.valoareImprumut = valoareImprumut;
		}
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Valoarea imprumutului: ").append(this.valoareImprumut).append(" Procentajul dobanzii: ")
				.append(this.procentajDobanda).append(" Numarul zilelor in care contul a fost activ: ")
				.append(this.zileActiveCont).append(" Tipul contului bancar: ").append(this.tipContBancar);

		return buffer.toString();
	}

	private int calculeazaLuniActive() {
		int luniActive = this.zileActiveCont / TOTAL_ZILE_LUNA;
		luniActive += this.zileActiveCont % TOTAL_ZILE_LUNA > 0 ? 1 : 0;
		return luniActive;
	}

	private double calculeazaDobandaAnualaEfectiva() {
		return Math.pow(1 + (this.procentajDobanda / this.calculeazaLuniActive()), this.calculeazaLuniActive()) - 1;
	}

	public double calculeazaComision() {
		return this.tipContBancar == TipContBancar.PREMIUM || this.tipContBancar == TipContBancar.SUPER_PREMIUM
				? COMISION_BROKER * this.calculeazaDobandaAnualaEfectiva()
				: COMISION_INITIAL;
	}

}
