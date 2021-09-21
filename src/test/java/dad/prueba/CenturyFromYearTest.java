package dad.prueba;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import dad.CodeSignal.TheJourneyBegins;

public class CenturyFromYearTest { 
	// mvn -Dtest="NOMBRE DEL TEST"#test2 test --->COMANDO PARA PASAR UN TEST CONCRETO, PODEMOS ESPECIFICAR EL TEST CONCRETO CON #
	
	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(20,tjb.centuryFromYear(1905));
	}
	
	@Test
	public void test2() {
		assertEquals(17,tjb.centuryFromYear(1700));
	}
	
	@Test
	public void test3() {
		assertEquals(20,tjb.centuryFromYear(1988));
	}
	
	@Test
	public void test4() {
		assertEquals(20,tjb.centuryFromYear(2000));
	}
	
	@Test
	public void test5() {
		assertEquals(21,tjb.centuryFromYear(2001));
	}
	
	@Test
	public void test6() {
		assertEquals(2,tjb.centuryFromYear(200));
	}
	
	@Test
	public void test7() {
		assertEquals(4,tjb.centuryFromYear(374));
	}
	
	@Test
	public void test8() {
		assertEquals(1,tjb.centuryFromYear(45));
	}
	
	@Test
	public void test9() {
		assertEquals(1,tjb.centuryFromYear(8));
	}
}


