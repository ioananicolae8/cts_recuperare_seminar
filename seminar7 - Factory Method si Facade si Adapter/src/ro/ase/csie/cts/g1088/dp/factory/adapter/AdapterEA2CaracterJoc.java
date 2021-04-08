package ro.ase.csie.cts.g1088.dp.factory.adapter;

import ro.ase.csie.cts.g1088.dp.factory.method.CaracterJoc;

public class AdapterEA2CaracterJoc extends CaracterJoc {

	InterfataCaracterEA caracterEA;

	public AdapterEA2CaracterJoc(InterfataCaracterEA caracterEa) {
		super();
		this.caracterEA = caracterEa;
	}

	@Override
	public void seDeplaseaza() {
		
		caracterEA.move();
		
	}
	
	
}
