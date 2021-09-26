package dad.prueba;
import  org.junit.Test;

import dad.CodeSignal.EdgeOfTheOcean;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class MakeArrayConsecutive2Test {
	
private EdgeOfTheOcean eoto;

	@Before
	public void setup() {
		eoto = new EdgeOfTheOcean();
	}
	
	@Test
	public void test1() {
		assertEquals(3, eoto.makeArrayConsecutive2(new int[] {6,2,3,8}));
	}
	
	@Test
	public void test2() {
		assertEquals(2, eoto.makeArrayConsecutive2(new int[] {0,3}));
	}
	
	@Test
	public void test3() {
		assertEquals(0, eoto.makeArrayConsecutive2(new int[] {5,4,6}));
	}
	
	@Test
	public void test4() {
		assertEquals(2, eoto.makeArrayConsecutive2(new int[] {6,3}));
	}
	
	@Test
	public void test5() {
		assertEquals(0, eoto.makeArrayConsecutive2(new int[] {1}));
	}

}
