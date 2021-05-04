package nicolae.ioana.g1080.singleton;

public class ConexiuneDb {
		
	private static ConexiuneDb instantaConexiune;
	
	private ConexiuneDb() {}
	
	public static synchronized ConexiuneDb getConexiuneDb() {
		if(instantaConexiune == null) {
			instantaConexiune = new ConexiuneDb();
		} 
		
		return instantaConexiune;
	}
}
