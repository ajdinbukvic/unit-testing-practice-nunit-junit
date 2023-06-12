package ptf.si.kks;

import java.time.LocalDate;
import java.util.List;

public class Program {

	public static String danUSedmici(int godina, int mjesec, int dan)
	{
		if (godina < 1900 || godina > 2023) throw new IllegalArgumentException("Godina nije validna");
		if (mjesec <= 0 || mjesec > 12) throw new IllegalArgumentException("Mjesec nije validan");
		if (dan <= 0 || dan > 31) throw new IllegalArgumentException("Dan nije validan");
		LocalDate localDate = LocalDate.of(godina, mjesec, dan);
        java.time.DayOfWeek danRez = localDate.getDayOfWeek();
        String danStr = danRez.toString().substring(0, 1).toUpperCase() + danRez.toString().substring(1).toLowerCase();
        return danStr;
	}
	
	public static boolean djeljiviSaTri(List<Integer> brojevi)
	{
		if (brojevi == null) throw new NullPointerException("Lista je null");
		if (brojevi.size() == 0) throw new IllegalStateException("Lista je prazna");
		for (int i = 0; i < brojevi.size(); i++) {
			if (brojevi.get(i) % 3 != 0) return false;
		}
		return true;
	}
}
