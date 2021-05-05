package nicolae.ioana.as.prototype;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Reteta implements Cloneable {
	
	private static final String LINIE_NOUA = "\n";
	
	private String numePacient;
	private String numeDoctor;
	private List<String> medicamente;
	private Date data;
	private boolean esteAprobata;
	
	private Reteta() {}

	public Reteta(String numePacient, String numeDoctor, List<String> medicamente, Date data, boolean esteAprobata) {
		super();
		this.numePacient = numePacient;
		this.numeDoctor = numeDoctor;
		this.medicamente = medicamente;
		this.data = data;
		this.esteAprobata = esteAprobata;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Reteta copie = new Reteta();
		
		copie.numePacient = this.numePacient;
		copie.numeDoctor = this.numeDoctor;
		copie.medicamente = new ArrayList<>(this.medicamente);
		copie.data = (Date) this.data.clone();
		copie.esteAprobata = this.esteAprobata;
		
		return copie;
	}
	
	public void aprobaReteta() {
		this.esteAprobata = true;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Pacient: " + this.numePacient + LINIE_NOUA);
		sb.append("Doctor: " + this.numeDoctor + LINIE_NOUA);
		sb.append("Medicamente: " + this.medicamente + LINIE_NOUA);
		sb.append("Data: " + data + LINIE_NOUA);
		sb.append(this.esteAprobata ? "Aprobata" : "Neaprobata" + LINIE_NOUA);
		
		return sb.toString();
	}
}
