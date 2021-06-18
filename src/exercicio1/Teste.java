package exercicio1;

/**1) Elaborar uma classe Java que possui uma lista de cinco números inteiros,
um método que receba a lista e a expressão lambda para imprimir todos 
os números, assim como o quadrado, o dobro e somar mais 3 em cada
um dos elementos da lista.*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
		fazOperacao(lista, (n) -> true);
	}
	
	public static void fazOperacao(List<Integer> list, Predicate<Integer> predicate) {
			list.forEach(n -> {
				if (predicate.test(n)) {
					System.out.print("numero: " + n);
					Integer quadrado = n * n; 
					System.out.print(" - quadrado: " + quadrado);
					Integer dobro = n * 2;
					System.out.print(" - dobro: " + dobro);
					Integer maisTres = n + 3;
					System.out.print(" - somando 3: " + maisTres + "\n");
				}
			});
	}

}
