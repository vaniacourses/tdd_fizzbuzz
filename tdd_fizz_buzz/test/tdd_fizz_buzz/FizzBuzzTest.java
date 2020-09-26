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
	


}
