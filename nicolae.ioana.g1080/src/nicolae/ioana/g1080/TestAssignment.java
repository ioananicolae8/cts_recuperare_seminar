package nicolae.ioana.g1080;

import nicolae.ioana.g1080.decorator.AprobareUtilizatorDecorator;
import nicolae.ioana.g1080.factory.Pacient;
import nicolae.ioana.g1080.factory.TipUtilizator;
import nicolae.ioana.g1080.factory.Utilizator;
import nicolae.ioana.g1080.factory.UtilizatorFactory;
import nicolae.ioana.g1080.singleton.ConexiuneDb;

public class TestAssignment {

	public static void main(String[] args) {
		
		// Singleton
		System.out.println("Singleton");
		ConexiuneDb conexiune1 = ConexiuneDb.getConexiuneDb();
		ConexiuneDb conexiune2 = ConexiuneDb.getConexiuneDb();

		System.out.println(conexiune1 == conexiune2 ? "Conexiunile sunt identice." : "Conexiunile nu sunt identice.");
		System.out.println();
		
		// Factory
		System.out.println("Factory");
		UtilizatorFactory factory = new UtilizatorFactory();
		Utilizator utilizator1 = factory.creazaUtilizator(TipUtilizator.DOCTOR, "Dr. Popescu");
		Utilizator utilizator2 = factory.creazaUtilizator(TipUtilizator.PACIENT, "Dl. Bolnavescu");
		
		System.out.println(utilizator1.getNume());
		utilizator1.afiseazaTip();
		
		System.out.println(utilizator2.getNume());
		utilizator2.afiseazaTip();
		System.out.println();
		
		// Decorator
		System.out.println("Decorator");
		nicolae.ioana.g1080.decorator.Utilizator utilizatorDecorat = new AprobareUtilizatorDecorator(new nicolae.ioana.g1080.decorator.Pacient("Dna. Varicela"));
		System.out.println(utilizatorDecorat.getNume());
		utilizatorDecorat.afiseazaTip();
		System.out.println();
		
		
	}
}
