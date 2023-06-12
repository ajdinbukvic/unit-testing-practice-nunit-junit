package ptf.si.kks;

public class Faktorijel {
	
	public static int faktorijel(int broj) {
        if (broj < 0) throw new IllegalArgumentException("Broj ne može biti negativan!");
        int proizvod = 1;
        for (int i = 1; i <= broj; i++) proizvod *= i;
        return proizvod;
    }
}
