package tdd_fizz_buzz;

public class FizzBuzz {
	
	public String converte(int numero) {
		if (numero%3 ==0) {
			return "Fizz";
		}
		return Integer.toString(numero);
	}

}
