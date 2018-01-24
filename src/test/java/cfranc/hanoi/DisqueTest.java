package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	public void testCompareTo() {
            Disque petit = new Disque(1);
            Disque moyen = new Disque(2);
            Disque grand = new Disque(3);
            assertEquals("Disque petit comparé au moyen",-1, petit.compareTo(moyen));
            assertEquals("Disque moyen comparé au grand",-1, moyen.compareTo(grand));
            assertEquals("Disque moyen comparé au moyen",0, moyen.compareTo(moyen));
            assertEquals("Disque petit comparé au grand",-1, petit.compareTo(grand));
            assertEquals("Disque moyen comparé au petit",1, moyen.compareTo(petit));
            assertEquals("Disque grand comparé au moyen",1, grand.compareTo(moyen));
            assertEquals("Disque grand comparé au petit",1, grand.compareTo(petit));
	}

}
