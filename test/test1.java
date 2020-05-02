import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test1 {

	@Test
	   public void derTest1() {
	      Rechteck myRechteck = new Rechteck(10, 20);
	      assertTrue(60 == myRechteck.berechneUmfang());      
	   }
}
