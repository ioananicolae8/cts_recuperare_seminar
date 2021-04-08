package ro.ase.csie.cts.g1088.dp.factory.facade;

public class FacadeAPIJoc {

	//interfata simplificata pentru a obtine proilul unui jucator
	public static String getProfil(String username, String pass) {
		
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
	
		return dateProfil;
	}
}
