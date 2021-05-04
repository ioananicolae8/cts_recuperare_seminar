package nicolae.ioana.g1080.decorator;

public class Pacient implements Utilizator {

	private String nume;

	public Pacient(String nume) {
		this.setNume(nume);
	}

	@Override
	public void afiseazaTip() {
		System.out.println("Tip utilizator: " + TipUtilizator.PACIENT);
	}

	@Override
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
}
