package ptf.si.kks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConvertorTest {

	@Test
	void testInchUCmSaPozitivnim() {
		double inch = 10;
		double rezultat = Convertor.inchUCentimetar(inch);
		assertEquals(25.4, rezultat, 0.000001d);
	}
	
	@Test
	void testInchUCmSaPozitivnimSaZarezom() {
		double inch = 2.345;
		double rezultat = Convertor.inchUCentimetar(inch);
		assertEquals(5.9563, rezultat, 0.000001d);
	}
	
	@Test
	void testInchUCmSaNulom() {
		double inch = 0;
		assertThrows(IllegalArgumentException.class, () -> Convertor.inchUCentimetar(inch));
	}

	@Test
	void testInchUCmSaNegativnim() {
		double inch = -6;
		assertThrows(IllegalArgumentException.class, () -> Convertor.inchUCentimetar(inch));
	}
	
	@Test
	void testInchUCmSaParsiranimTipom() {
		String inch = "5.2 incha";
		assertThrows(IllegalArgumentException.class, () -> Convertor.inchUCentimetar(Double.parseDouble(inch)));
	}
	
	@Test
	void testFarenhajtUCelzijusSaPozitivnim() {
		double farenhajt = 45;
		double rezultat = Convertor.farenhajtUCelzijus(farenhajt);
		assertEquals(13, rezultat, 0.000001d);
	}
	
	@Test
	void testFarenhajtUCelzijusSaZarezom() {
		double farenhajt = 56.91;
		double rezultat = Convertor.farenhajtUCelzijus(farenhajt);
		assertEquals(24.91, rezultat, 0.000001d);
	}
	
	@Test
	void testFarenhajtUCelzijusSaNulom() {
		double farenhajt = 0;
		double rezultat = Convertor.farenhajtUCelzijus(farenhajt);
		assertEquals(-32, rezultat, 0.000001d);
	}

	@Test
	void testFarenhajtUCelzijusSaNegativnim() {
		double farenhajt = -5;
		double rezultat = Convertor.farenhajtUCelzijus(farenhajt);
		assertEquals(-37, rezultat, 0.000001d);
	}
	
	@Test
	void testFarenhajtUCelzijusSaParsiranimTipom() {
		String farenhajt = "48.5 farenhajta";
		assertThrows(IllegalArgumentException.class, () -> Convertor.farenhajtUCelzijus(Double.parseDouble(farenhajt)));
	}

}
