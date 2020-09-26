package tdd_fizz_buzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	@Test
	public void testNumerosMenoresNormais() {		
		FizzBuzz fb = new FizzBuzz();
		Assertions.assertEquals("1", fb.converte(1));
		Assertions.assertEquals("2", fb.converte(2));		
	}
	
	@Test
	public void testMultiplosDeTres() {
		FizzBuzz fb = new FizzBuzz();
		Assertions.assertEquals("Fizz", fb.converte(3));
	}
	
	@Test
	public void testMultiposDe5() {
		FizzBuzz fb = new FizzBuzz();
		Assertions.assertEquals("Buzz", fb.converte(5));		
	}
	
	@Test
	public void testMultiploDe3e5() {
		FizzBuzz fb = new FizzBuzz();
		Assertions.assertEquals("FizzBuzz", fb.converte(15));		
	}

}
