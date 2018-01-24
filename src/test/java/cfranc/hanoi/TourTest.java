package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	public void test() {
            System.out.println("Test de la fonction empiler");
            
            //Tour vide 
            Disque d = new Disque(1);
            Tour t = new Tour();
            //boolean expResult = true;
            boolean result = t.empiler(d);
            assertTrue("disque de taille 1 dans tour vide", result);
            
            //Tour vide, disque de taille max
            Disque d2 = new Disque(Integer.MAX_VALUE);
            Tour t2 = new Tour();
            //boolean expResult = true;
            boolean result2 = t2.empiler(d2);
            assertTrue("disque de taille max dans tour vide", result2);
            
            //tour vide, disque de taille 0
            Disque d3 = new Disque(0);
            Tour t3 = new Tour();
            boolean result3 = t3.empiler(d3);
            assertFalse("disque de taille 0 dans tour vide", result3);
            
            //Tour vide, disque de taille max +1 
            Disque d4 = new Disque(Integer.MAX_VALUE+1);
            Tour t4 = new Tour();
            boolean result4 = t4.empiler(d4);
            assertFalse("disque de taille max +1 dans tour vide", result4);
            
            
            Disque sommet = new Disque(2);
            Disque d5 = new Disque(sommet.d-1);
            Tour t5 = new Tour();
            boolean result5 = t5.empiler(d5);
            assertTrue("disque de taille du disque au sommet -1 dans tour non vide", result5);
            
            Disque sommet2 = new Disque(2);
            Disque d6 = new Disque(sommet2.d);
            Tour t6 = new Tour();
            t6.empiler(sommet2);
            boolean result6 = t6.empiler(d6);
            assertFalse("disque de taille du disque au sommet dans tour non vide", result6);
            
            //Tour pleine 
            Disque d7 = new Disque(4);
            Disque d8 = new Disque(3);
            Disque d9 = new Disque(2);
            
            Tour t7 = new Tour();
            t7.empiler(d7);
            t7.empiler(d8);
            t7.empiler(d9);
            
            Disque d10 = new Disque(1);
            boolean result7 = t7.empiler(d6);
            assertFalse("Empilement de disque dans une tour", result7);
	}

}
