package nicolae.ioana.as.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MedicFactory {
	
	private static final Map<Specializare, Medic> mapMedici = new HashMap();
	
	public static Medic getMedicDupaSpecializare(Specializare specializare) {
		Medic medic = mapMedici.get(specializare);
		
		if (medic == null) {
			medic = new Medic(specializare);
			mapMedici.put(specializare, medic);
		}
		
		return medic;
	}
}
