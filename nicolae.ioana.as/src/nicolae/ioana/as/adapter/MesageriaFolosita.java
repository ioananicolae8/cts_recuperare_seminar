package nicolae.ioana.as.adapter;

public class MesageriaFolosita implements Mesagerie {
	
	private MesagerieAdapter adapter;

	@Override
	public void trimiteMesaj(TipMesaj tipMesaj, String continut) {
		this.adapter = new MesagerieAdapter(tipMesaj);
		this.adapter.trimiteMesaj(tipMesaj, continut);
	}
}
	