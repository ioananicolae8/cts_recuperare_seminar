package nicolae.ioana.as.adapter.mesagerii;

import nicolae.ioana.as.adapter.MesagerieAvansata;

public class WhatsApp implements MesagerieAvansata {

	@Override
	public void trimiteMesajText(String mesajText) {
		System.out.println("Mesaj text: '" + mesajText + "' trimis din WhatsApp");
	}

	@Override
	public void trimiteMesajVocal(String mesajVocal) {
		System.out.println("Mesaj vocal: '" + mesajVocal + "' trimis din WhatsApp");
	}

	@Override
	public void trimiteMesajVideo(String mesajVideo) {
		System.out.println("Mesaj video: '" + mesajVideo + "' trimis din WhatsApp");
	}

}
