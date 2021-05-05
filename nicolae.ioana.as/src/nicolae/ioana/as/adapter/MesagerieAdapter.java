package nicolae.ioana.as.adapter;

import nicolae.ioana.as.adapter.mesagerii.ChatAplicatie;
import nicolae.ioana.as.adapter.mesagerii.MesageriePredefinita;
import nicolae.ioana.as.adapter.mesagerii.WhatsApp;

public class MesagerieAdapter implements Mesagerie {

	private MesagerieAvansata mesagerieAvansata;

	public MesagerieAdapter(TipMesaj tipMesaj) {
		switch (tipMesaj) {
		case TEXT:
			this.mesagerieAvansata = new MesageriePredefinita();
			break;

		case VOCAL:
			this.mesagerieAvansata = new ChatAplicatie();
			break;

		case VIDEO:
			this.mesagerieAvansata = new WhatsApp();
			break;
		}
	}

	@Override
	public void trimiteMesaj(TipMesaj tipMesaj, String continut) {
		switch (tipMesaj) {
		case TEXT:
			this.mesagerieAvansata.trimiteMesajText(continut);
			break;

		case VOCAL:
			this.mesagerieAvansata.trimiteMesajVocal(continut);
			break;

		case VIDEO:
			this.mesagerieAvansata.trimiteMesajVideo(continut);
			break;
		}
	}

}
