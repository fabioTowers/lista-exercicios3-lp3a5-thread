package exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Avaliacao> quartaD = new ArrayList<Avaliacao>();
		
		new Thread(() -> {
			quartaD.add(new Avaliacao("Dialética", "Zenão", 6));
		}).start();
		
		new Thread(() -> {
			quartaD.add(new Avaliacao("Gramática", "Sócrates", 9));
		}).start();
		
		new Thread(() -> {
			quartaD.add(new Avaliacao("Retórica", "Hipócrates", 8));
		}).start();
		
		new Thread(() -> {
			quartaD.add(new Avaliacao("Dialética", "Sófocles", 5));
		}).start();
		
		System.out.println("Alunos ordenados:");
		
		quartaD.forEach(a -> System.out.println(a.getAluno()));
		
		ordenar(quartaD);
		
		classificar(quartaD, (a) -> a.getNota() >= 6);
	}
	
	static void ordenar(List<Avaliacao> avaliacoes) {
		Collections.sort(avaliacoes, (Avaliacao avaliacao1, Avaliacao avaliacao2) -> avaliacao1.getAluno().compareTo(avaliacao2.getAluno()));
	}
	
	static void classificar(List<Avaliacao> avaliacoes, Predicate<Avaliacao> predicato) {
		System.out.println("\nLista de aprovados:");
		avaliacoes.forEach(a -> {
			if (predicato.test(a)) {
				System.out.println("\n\tNome: "+a.getAluno()+" - Nota: " + a.getNota());
			}
		});
		
	}

}
