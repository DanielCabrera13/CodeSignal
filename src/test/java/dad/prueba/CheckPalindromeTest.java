package dad.prueba;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import  org.junit.Test;
import dad.CodeSignal.TheJourneyBegins;
import org.junit.Before;

public class CheckPalindromeTest {
	
	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertTrue(tjb.checkPalindrome("aabaa"));
	}
	
	@Test
	public void test2() {
		assertFalse(tjb.checkPalindrome("abac"));
	}
	
	@Test
	public void test3() {
		assertTrue(tjb.checkPalindrome("a"));
	}
	
	@Test
	public void test4() {
		assertFalse(tjb.checkPalindrome("az"));
	}
	
	@Test
	public void test5() {
		assertTrue(tjb.checkPalindrome("abacaba"));
	}
	
	@Test
	public void test6() {
		assertTrue(tjb.checkPalindrome("z"));
	}
	
	@Test
	public void test7() {
		assertFalse(tjb.checkPalindrome("aaabaaaa"));
	}
	
	@Test
	public void test8() {
		assertFalse(tjb.checkPalindrome("zzzazzazz"));
	}
	
	@Test
	public void test9() {
		assertTrue(tjb.checkPalindrome("hlbeeykoqqqqokyeeblh"));
	}
	
	@Test
	public void test10() {
		assertTrue(tjb.checkPalindrome("hlbeeykoqqqokyeeblh"));
	}

}
