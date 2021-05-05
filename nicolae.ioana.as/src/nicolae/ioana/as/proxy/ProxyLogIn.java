package nicolae.ioana.as.proxy;

public class ProxyLogIn implements InterfataLogIn {
	
	private LogIn logIn;
	
	public ProxyLogIn() {
		this.logIn = new LogIn();
	}

	@Override
	public void logIn(String user, String pass) {
		logIn.logIn(user, pass);
	}

}
