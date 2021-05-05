package nicolae.ioana;

import java.util.ArrayList;
import java.util.Date;

import nicolae.ioana.as.adapter.MesageriaFolosita;
import nicolae.ioana.as.adapter.TipMesaj;
import nicolae.ioana.as.builder.JurnalulDiabeticului;
import nicolae.ioana.as.builder.StareGenerala;
import nicolae.ioana.as.decorator.AprobareUtilizatorDecorator;
import nicolae.ioana.as.factory.Pacient;
import nicolae.ioana.as.factory.TipUtilizator;
import nicolae.ioana.as.factory.Utilizator;
import nicolae.ioana.as.factory.UtilizatorFactory;
import nicolae.ioana.as.flyweight.Medic;
import nicolae.ioana.as.flyweight.MedicFactory;
import nicolae.ioana.as.flyweight.Specializare;
import nicolae.ioana.as.prototype.Reteta;
import nicolae.ioana.as.proxy.InterfataLogIn;
import nicolae.ioana.as.proxy.ProxyLogIn;
import nicolae.ioana.as.singleton.ConexiuneDb;

public class TestAssignment {

	public static void main(String[] args) throws CloneNotSupportedException {

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
		nicolae.ioana.as.decorator.Utilizator utilizatorDecorat = new AprobareUtilizatorDecorator(
				new nicolae.ioana.as.decorator.Pacient("Dna. Varicela"));
		System.out.println(utilizatorDecorat.getNume());
		utilizatorDecorat.afiseazaTip();
		System.out.println();

		// Proxy
		System.out.println("Proxy");
		InterfataLogIn interfataLogIn = new ProxyLogIn();
		interfataLogIn.logIn("user1", "user1");
		interfataLogIn.logIn("user2", "user2");
		System.out.println();

		// Prototype
		System.out.println("Prototype");
		Reteta reteta = new Reteta("Bolnavescu", "Doctorescu", new ArrayList<String>() {
			{
				add("paracetamol");
				add("nurofen");
			}
		}, new Date(), false);
		
		Reteta clona = (Reteta) reteta.clone();
		clona.aprobaReteta();
		
		System.out.println("Reteta originala:\n" + reteta);
		System.out.println("Reteta clona:\n" + clona);
		System.out.println();
		
		// Flyweight
		System.out.println("Flyweight");
		
		Medic medic1 = MedicFactory.getMedicDupaSpecializare(Specializare.DIABETOLOGIE);
		Medic medic2 = MedicFactory.getMedicDupaSpecializare(Specializare.DIABETOLOGIE);
		
		medic2.setNume("Doctoreasca");
		System.out.println(medic2);
		
		medic1.setNume("Doctorescu");
		System.out.println(medic1);
		
		System.out.println();
		
		// Adapter
		System.out.println("Adapter");
		
		MesageriaFolosita mesagerie = new MesageriaFolosita();
		mesagerie.trimiteMesaj(TipMesaj.TEXT, "Mesaj text");
		mesagerie.trimiteMesaj(TipMesaj.VOCAL, "Mesaj vocal");
		mesagerie.trimiteMesaj(TipMesaj.VIDEO, "Mesaj video");
		
		System.out.println();
		
		// Builder
		System.out.println("Builder");
		
		JurnalulDiabeticului jurnal1 = new JurnalulDiabeticului.JurnalulDiabeticuluiBuilder(new Pacient("Dl. Pojar"))
				.setGlicemie(100.8)
				.setNrPasi(1000)
				.setStareGenerala(StareGenerala.OBOSEALA)
				.setNotite("Ma simt din ce in ce mai rau.")
				.build();
		
		JurnalulDiabeticului jurnal2 = new JurnalulDiabeticului.JurnalulDiabeticuluiBuilder(new Pacient("Dna. Gastrita"))
				.setGlicemie(150.12)
				.setNrPasi(150)
				.setStareGenerala(StareGenerala.MOTIVARE)
				.tratamentLuat()
				.build();
		
		System.out.println(jurnal1 + "\n");
		System.out.println(jurnal2);
	}
}
