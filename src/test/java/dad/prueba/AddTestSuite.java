package dad.prueba;
import static org.junit.Assert.assertEquals;
import  org.junit.Test;

import dad.CodeSignal.TheJourneyBegins;

public class AddTestSuite {
	

	@Test
	public void test1() {
		TheJourneyBegins tjb = new TheJourneyBegins();
		int resultado = tjb.add(1,2);
		assertEquals(resultado, 3);
	}
	
	@Test
	public void test2() {
		TheJourneyBegins tjb = new TheJourneyBegins();
		int resultado = tjb.add(2,3);
		assertEquals(resultado, 5);
	}
}
