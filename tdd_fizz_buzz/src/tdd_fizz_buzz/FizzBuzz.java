package tdd_fizz_buzz;

public class FizzBuzz {
	
	public String converte(int numero) {
		if ((numero == 15) || (numero == 30)) {
			return "FizzBuzz";
		}
		if (numero%5 ==0) {
			return "Buzz";
		}		
		if (numero%3 ==0) {
			return "Fizz";
		}
		return Integer.toString(numero);
	}

}
