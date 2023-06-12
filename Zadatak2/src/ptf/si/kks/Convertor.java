package ptf.si.kks;

public class Convertor {

	public static double inchUCentimetar(double vrijednost)
	{
		if (vrijednost <= 0) throw new IllegalArgumentException("Vrijednost mora biti veca od 0");
		return vrijednost * 2.54;
	}
	
	public static double farenhajtUCelzijus(double vrijednost)
	{
		return vrijednost - 32;
	}
}
