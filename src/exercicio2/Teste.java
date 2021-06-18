package exercicio2;

/**2) Codificar uma classe Java para exibir uma mensagem por meio da 
implementação de uma interface chamada “InterfaceFuncional”,
adicionando uma anotação de interface funcional, utilizando do método 
“show” da interface para exibição da mensagem.*/

public class Teste{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Hello World!";
		
		InterfaceFuncional i = (t) -> System.out.println(t);
		
		i.show(msg);
	}

}
