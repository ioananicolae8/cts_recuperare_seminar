package nicolae.ioana.as.decorator;

public class Doctor implements Utilizator {
	
	private String nume;
	
	public Doctor(String nume) {
		this.setNume(nume);
	}

	@Override
	public void afiseazaTip() {
		System.out.println("Tip utilizator: " + TipUtilizator.DOCTOR);
	}

	@Override
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
}
