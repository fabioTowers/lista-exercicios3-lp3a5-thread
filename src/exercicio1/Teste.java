package exercicio1;

import java.util.Arrays;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		
		lista.forEach((n) -> {
			System.out.print("numero: " + n);
			Integer quadrado = n * n; 
			System.out.print(" - quadrado: " + quadrado);
			Integer dobro = n * 2;
			System.out.print(" - dobro: " + dobro);
			Integer maisTres = n + 3;
			System.out.print(" - somando 3: " + maisTres + "\n");
		});
	}

}
