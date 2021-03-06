package ro.ase.csie.cts.gr1088.modele;

import ro.ase.csie.cts.gr1088.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.gr1088.exceptii.ExceptieTransferIlegal;

public abstract class Cont {
	
	public abstract double getBalanta();
	public abstract void alimenteaza(Double valoare);

	public abstract void extrage(Double valoare) throws ExceptieFonduriInsuficiente;
	public abstract void transfer(Cont destinatie,Double valoare) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
	
}
