package dad.prueba;
import static org.junit.Assert.assertEquals;
import  org.junit.Test;
import dad.CodeSignal.TheJourneyBegins;
import org.junit.Before;

public class AddTest {
	
	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(tjb.add(1, 2), 3);
	}
	
	@Test
	public void test2() {
		assertEquals(tjb.add(20, -15), 5);
	}
}
