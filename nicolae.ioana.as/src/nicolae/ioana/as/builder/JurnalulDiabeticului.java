package nicolae.ioana.as.builder;

import java.util.Date;

import nicolae.ioana.as.factory.Pacient;

public class JurnalulDiabeticului {
	
	private static final String LINIE_NOUA = "\n";
	
	private Pacient pacient;
	private int nrPasi;
	private double glicemie;
	private boolean esteLuatTratamentul;
	private Date dataOraAdaugarii;
	private StareGenerala stareGenerala;
	private String notite; // optional
	
	private JurnalulDiabeticului() {}

	private JurnalulDiabeticului(Pacient pacient, int nrPasi, double glicemie, boolean esteLuatTratamentul,
			Date dataOraAdaugarii, StareGenerala stareGenerala, String notite) {
		super();
		this.pacient = pacient;
		this.nrPasi = nrPasi;
		this.glicemie = glicemie;
		this.esteLuatTratamentul = esteLuatTratamentul;
		this.dataOraAdaugarii = dataOraAdaugarii;
		this.stareGenerala = stareGenerala;
		this.notite = notite;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Pacient: " + this.pacient.getNume() + LINIE_NOUA);
		sb.append("Nr. pasi: " + this.nrPasi + LINIE_NOUA);
		sb.append("Glicemie: " + this.glicemie + LINIE_NOUA);
		sb.append((this.esteLuatTratamentul ? "Tratament a fost luat." : "Tratamentul nu a fost luat.") + LINIE_NOUA);
		sb.append("Data adaugarii: " + this.dataOraAdaugarii + LINIE_NOUA);
		sb.append("Stare generala: " + this.stareGenerala + LINIE_NOUA);
		sb.append((notite != null ? "Notite: " + this.notite : "Nu exista notite.") + LINIE_NOUA);
		
		return sb.toString();
	}
	
	public static class JurnalulDiabeticuluiBuilder {
		
		private JurnalulDiabeticului jurnal;
		
		public JurnalulDiabeticuluiBuilder(Pacient pacient) {
			this.jurnal = new JurnalulDiabeticului();
			this.jurnal.pacient = pacient;
			this.jurnal.esteLuatTratamentul = false;
			this.jurnal.dataOraAdaugarii = new Date();
		}
		
		public JurnalulDiabeticuluiBuilder setNrPasi(int nrPasi) {
			this.jurnal.nrPasi = nrPasi > 0 ? nrPasi : 0;
			return this;
		}
		
		public JurnalulDiabeticuluiBuilder setGlicemie(double glicemie) {
			this.jurnal.glicemie = glicemie;
			return this;
		}
		
		public JurnalulDiabeticuluiBuilder tratamentLuat() {
			this.jurnal.esteLuatTratamentul = true;
			return this;
		}
		
		public JurnalulDiabeticuluiBuilder setStareGenerala(StareGenerala stareGenerala) {
			this.jurnal.stareGenerala = stareGenerala;
			return this;
		}
		
		public JurnalulDiabeticuluiBuilder setNotite(String notite) {
			this.jurnal.notite = notite;
			return this;
		}
		
		public JurnalulDiabeticului build() {
			return this.jurnal;
		}
	}
}
