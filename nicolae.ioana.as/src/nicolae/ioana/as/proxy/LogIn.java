package nicolae.ioana.as.proxy;

import java.util.HashMap;
import java.util.Map;

public class LogIn implements InterfataLogIn {
	
	@Override
	public void logIn(String user, String pass) {
		creareConexiuneDb();
		Map<String, String> utilizatori = getUtilizatori();
		
		if (utilizatori.containsKey(user) && utilizatori.get(user).equals(pass)) {
			System.out.println("Bun venit " + user + "!");
			accesareMeniuPrincipal();
		} else {
			System.out.println("Utilizator sau parola gresite!");
		}
	}
	
	private void creareConexiuneDb() {
		System.out.println("Conexiune creata!");
	}
	
	@SuppressWarnings("serial")
	private Map<String, String> getUtilizatori() {
		return new HashMap<String, String>() {{
		    put("admin", "admin");
		    put("user1", "user1");
		}};
	}
	
	private void accesareMeniuPrincipal() {
		System.out.println("Bun venit in meniul principal!");
	}
}
