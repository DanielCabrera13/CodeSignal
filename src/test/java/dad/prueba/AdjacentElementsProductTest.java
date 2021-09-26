package dad.prueba;
import  org.junit.Test;
import dad.CodeSignal.EdgeOfTheOcean;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class AdjacentElementsProductTest {
	
private EdgeOfTheOcean eoto;

	
	@Before
	public void setup() {
		eoto = new EdgeOfTheOcean();
	}
	
	@Test
	public void test1() {
		assertEquals(21, eoto.adjacentElementsProduct(new int[] {3, 6, -2, -5, 7, 3}));
	}
	
	@Test
	public void test2() {
		assertEquals(2, eoto.adjacentElementsProduct(new int[] {-1,-2}));
	}
	
	@Test
	public void test3() {
		assertEquals(6, eoto.adjacentElementsProduct(new int[] {5, 1, 2, 3, 1, 4}));
	}
	
	@Test
	public void test4() {
		assertEquals(6, eoto.adjacentElementsProduct(new int[] {1,2,3,0}));
	}
	
	@Test
	public void test5() {
		assertEquals(50, eoto.adjacentElementsProduct(new int[] {9, 5, 10, 2, 24, -1, -48}));
	}
	
	@Test
	public void test6() {
		assertEquals(30, eoto.adjacentElementsProduct(new int[] {5, 6, -4, 2, 3, 2, -23}));
	}
	
	@Test
	public void test7() {
		assertEquals(6, eoto.adjacentElementsProduct(new int[] {4, 1, 2, 3, 1, 5}));
	}
	
	@Test
	public void test8() {
		assertEquals(-12, eoto.adjacentElementsProduct(new int[] {-23, 4, -3, 8, -12}));
	}
	
	@Test
	public void test9() {
		assertEquals(0, eoto.adjacentElementsProduct(new int[] {1, 0, 1, 0, 1000}));
	}

}
