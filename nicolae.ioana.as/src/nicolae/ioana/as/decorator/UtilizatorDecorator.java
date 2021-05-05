package nicolae.ioana.as.decorator;

public abstract class UtilizatorDecorator implements Utilizator {
	
	protected Utilizator utilizatorDecorat;
	
	public UtilizatorDecorator(Utilizator utilizatorDecorat) {
		this.utilizatorDecorat = utilizatorDecorat;
	}
	
	public void afiseazaTip() {
		utilizatorDecorat.afiseazaTip();
	}
	
	public String getNume() {
		return utilizatorDecorat.getNume();
	}
}
