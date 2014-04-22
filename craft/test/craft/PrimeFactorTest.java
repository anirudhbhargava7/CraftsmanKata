package craft;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;

public class PrimeFactorTest {

	@Test
	public void testGenerate() {
		
		
		ArrayList <Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		
		ArrayList <Integer> actual = new ArrayList<Integer>();
		actual = PrimeFactor.generate(30);
		
		assertEquals("Prime Factors of 30 are 2,3,5",expected,actual);
		
		ArrayList <Integer> negativeExpectation = new ArrayList<Integer>();
		ArrayList <Integer> actualExpectation =new ArrayList<Integer>();
		assertEquals("Prime Factors of -30 are -1,2,3,5", negativeExpectation,actualExpectation);
	}

	@Test
	public void testIsprime() {
		
		assertEquals("Number is prime",true,PrimeFactor.isprime(3));
		assertEquals("Number is not prime",false,PrimeFactor.isprime(6));
		
	}

}
