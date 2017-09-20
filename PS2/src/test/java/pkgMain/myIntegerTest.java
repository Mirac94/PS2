package pkgMain;

import static org.junit.Assert.*;

import org.junit.Test;

public class myIntegerTest {

	@Test
	public void testEven() {
		
		MyInteger myInt = new MyInteger(2);
		assertTrue(myInt.isEven());
	}
	@Test
	public void testOdd() {
		
		MyInteger myInt = new MyInteger(3);
		assertTrue(myInt.isOdd());
		
	}
	@Test
	public void testEvenInt() {
		
		MyInteger myInt = new MyInteger(2);
		
		assertEquals(myInt.isEven(),true);
		
		assertTrue(myInt.isEven());
			
		
	}
	@Test
	public void testMyIntegerEven() {
		
		MyInteger myInt = new MyInteger(2);
		assertEquals(myInt.isEven(),true);
	}
	@Test
	public void testOddInt() {
		
		MyInteger myInt = new MyInteger(3);
		assertTrue(myInt.isOdd());
	}
	@Test
	public void testMyIntegerOdd() {
		
		MyInteger myInt = new MyInteger(3);
		assertTrue(myInt.isOdd());
	}
	@Test
	public void testequals() {
		
		MyInteger myInt = new MyInteger(2);
		assertEquals(myInt.isEquals(2),true);
	}
	@Test 
	public void testequalsMyInteger() {
		MyInteger myInt = new MyInteger(2);
		MyInteger myInt2 = new MyInteger(2);
		assertEquals(myInt.isEquals(myInt2),true);
	}
	@Test 
	public void testPrime() {
		boolean actual = MyInteger.isPrime(5);
		assertTrue(actual);
		boolean not = MyInteger.isPrime(6);
		assertFalse(not);
	}
	@Test
	public void testPrimeInt() {
		boolean actual = MyInteger.isPrime(5);
		assertTrue(actual);
	}
	@Test
	public void testPrimeMyInteger() {
		MyInteger MyInt = new MyInteger(3);
		assertTrue(MyInteger.isPrime(MyInt));
	}
}
