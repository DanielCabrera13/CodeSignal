package dad.prueba;
import  org.junit.Test;
import dad.CodeSignal.TheJourneyBegins;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class ShapeAreaTest {

private TheJourneyBegins tjb;

	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(5, tjb.shapeArea(2));
	}
	
	@Test
	public void test2() {
		assertEquals(13, tjb.shapeArea(3));
	}
	
	@Test
	public void test3() {
		assertEquals(1, tjb.shapeArea(1));
	}
	
	@Test
	public void test4() {
		assertEquals(41, tjb.shapeArea(5));
	}
	
	@Test
	public void test5() {
		assertEquals(97986001, tjb.shapeArea(7000));
	}
	
	@Test
	public void test6() {
		assertEquals(127984001, tjb.shapeArea(8000));
	}
	
	@Test
	public void test7() {
		assertEquals(199940005, tjb.shapeArea(9999));
	}
	
	@Test
	public void test8() {
		assertEquals(199900013, tjb.shapeArea(9998));
	}
	
	@Test
	public void test9() {
		assertEquals(161946005, tjb.shapeArea(8999));
	}
	
	@Test
	public void test10() {
		assertEquals(19801, tjb.shapeArea(100));
	}
}
