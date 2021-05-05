package nicolae.ioana.as.adapter.mesagerii;

import nicolae.ioana.as.adapter.MesagerieAvansata;

public class ChatAplicatie implements MesagerieAvansata {

	@Override
	public void trimiteMesajText(String mesajText) {
		System.out.println("Mesaj text: '" + mesajText + "' trimis din ChatAplicatie");
	}

	@Override
	public void trimiteMesajVocal(String mesajVocal) {
		System.out.println("Mesaj vocal: '" + mesajVocal + "' trimis din ChatAplicatie");
	}

	@Override
	public void trimiteMesajVideo(String mesajVideo) {
		System.out.println("Acest tip de mesaj nu este suportat!");
	}
}
