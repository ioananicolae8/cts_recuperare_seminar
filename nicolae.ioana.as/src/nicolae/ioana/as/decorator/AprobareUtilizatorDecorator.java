package nicolae.ioana.as.decorator;

public class AprobareUtilizatorDecorator extends UtilizatorDecorator {

	public AprobareUtilizatorDecorator(Utilizator utilizatorDecorat) {
		super(utilizatorDecorat);
	}

	@Override
	public void afiseazaTip() {
		utilizatorDecorat.afiseazaTip();
		setAprobareUtilizator();
	}

	private void setAprobareUtilizator() {
		System.out.println("Utilizatorul este aprobat!");
	}
}
