package ro.ase.csie.cts.tema.test;

import ro.ase.csie.cts.tema.clase.ContBancar;
import ro.ase.csie.cts.tema.enumerari.TipContBancar;
import ro.ase.csie.cts.tema.exceptii.ExceptieValoareImprumutInvalida;

public class TestContBancar {

	public static void main(String[] args) throws ExceptieValoareImprumutInvalida {
		ContBancar contBancar1= new ContBancar(10000, 0.2, 400, TipContBancar.PREMIUM);
		System.out.println(contBancar1);
		System.out.println(contBancar1.calculeazaRataLunara());
		System.out.println(contBancar1.calculeazaComision());
	}

}
