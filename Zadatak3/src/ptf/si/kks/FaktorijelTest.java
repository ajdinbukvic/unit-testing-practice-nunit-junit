package ptf.si.kks;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FaktorijelTest {

	@Test
    public void testFaktorijelNegativniBroj() {
		assertThrows(IllegalArgumentException.class, () -> Faktorijel.faktorijel(-1));
    }

    @Test
    public void testFaktorijelNula() {
        assertEquals(1, Faktorijel.faktorijel(0));
    }

    @Test
    public void testFaktorijelPozitivanBroj() {
        assertEquals(120, Faktorijel.faktorijel(5));
    }

}
