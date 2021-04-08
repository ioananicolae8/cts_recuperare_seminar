package ro.ase.csie.cts.g1088.dp.factory.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		//1. Creare conexiune
		ConexiuneServerJoc conexiune=new ConexiuneServerJoc();
		conexiune.conectare();
		
		//2. Login player
		Player player = new Player();
		player.login(conexiune);
		
		//3. Obtinem profilul
		ProfilPlayer profil=player.getProfil();
		
		//4. Obtinem datele
		String dateProfil = profil.getProfil();
		
		
		//prin Facade
		String dateProfil2= FacadeAPIJoc.getProfil("player1", "123");

	}

}
