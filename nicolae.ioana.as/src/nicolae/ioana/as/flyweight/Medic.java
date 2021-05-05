package nicolae.ioana.as.flyweight;

public class Medic {
	
	private String nume;
	private Specializare specializare;
	
	public Medic(Specializare specializare) {
		this.specializare = specializare;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	@Override
	public String toString() {
		return "Dr. " + this.nume + " Specializarea: " + this.specializare;
	}
}
