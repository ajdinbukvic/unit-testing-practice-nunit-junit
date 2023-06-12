package ptf.si.kks;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ProgramTest {

	@Test
	void testDanUSedmiciValidanDatum() 
	{
		String danRezultat = Program.danUSedmici(2023, 3, 27);
		String danOcekivani = "Monday";
		assertEquals(danOcekivani, danRezultat);
	}
	
	@Test
	void testDanUSedmiciValidanDatumPrestupnaGodina() 
	{
		String danRezultat = Program.danUSedmici(2020, 2, 28);
		String danOcekivani = "Friday";
		assertEquals(danOcekivani, danRezultat);
	}
	
	@Test
	void testDanUSedmiciNepostojeciDatum() 
	{
		assertThrows(java.time.DateTimeException.class, () -> Program.danUSedmici(2021, 4, 31));
	}
	
	@Test
	void testDanUSedmiciNevalidnaGodina() 
	{
		assertThrows(IllegalArgumentException.class, () -> Program.danUSedmici(3000, 5, 13));
	}
	
	@Test
	void testDanUSedmiciNevalidnaMjesec() 
	{
		assertThrows(IllegalArgumentException.class, () -> Program.danUSedmici(2000, -6, 22));
	}
	
	@Test
	void testDanUSedmiciNevalidnaDan() 
	{
		assertThrows(IllegalArgumentException.class, () -> Program.danUSedmici(2004, 9, 0));
	}
	
	@Test
	void testDjeljiviSaTriSvi() 
	{
		List<Integer> djeljivi = List.of(9, 15, 27, 48);
		boolean daLiSuDjeljivi = Program.djeljiviSaTri(djeljivi);
		assertTrue(daLiSuDjeljivi);
	}
	
	@Test
	void testDjeljiviSaTriOsimJednog() 
	{
		List<Integer> djeljivi = List.of(9, 15, 27, 48, 55);
		boolean daLiSuDjeljivi = Program.djeljiviSaTri(djeljivi);
		assertFalse(daLiSuDjeljivi);
	}
	
	@Test
	void testDjeljiviSaTriNijedan() 
	{
		List<Integer> djeljivi = List.of(11, 26, 38, 70);
		boolean daLiSuDjeljivi = Program.djeljiviSaTri(djeljivi);
		assertFalse(daLiSuDjeljivi);
	}
	
	@Test
	void testDjeljiviSaTriPraznaLista() 
	{
		List<Integer> djeljivi = List.of();
		assertThrows(IllegalStateException.class, () -> Program.djeljiviSaTri(djeljivi));
	}
	
	@Test
	void testDjeljiviSaTriNullLista() 
	{
		List<Integer> djeljivi = null;
		assertThrows(NullPointerException.class, () -> Program.djeljiviSaTri(djeljivi));
	}

}
