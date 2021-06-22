package exercicio3;

import java.util.stream.LongStream;

/**Construir uma classe Java para imprimir o fatorial de um n�mero utilizando 
express�o lambda.
**/

public class Teste {

	public static void main(String[] args) {
		long  n = 6;
	    long resultado;
	   
	    resultado  = fatorial(n);
	    System.out.println("O fatorial de " + n + " � "+ resultado);
	}
	
	public static long fatorial(long n) {
	    return LongStream.rangeClosed(2, n)
	      .reduce(1, (long x, long y) -> x * y);
	}

}
