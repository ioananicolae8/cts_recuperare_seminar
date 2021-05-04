package nicolae.ioana.g1080.factory;

public class UtilizatorFactory {

	public Utilizator creazaUtilizator(TipUtilizator tip, String nume) {
		switch (tip) {
		case DOCTOR:
			return new Doctor(nume);
		case PACIENT:
			return new Pacient(nume);
		default:
			return null;
		}
	}
}
