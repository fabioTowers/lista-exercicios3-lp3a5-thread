package exercicio2;

/**2) Codificar uma classe Java para exibir uma mensagem por meio da 
implementa��o de uma interface chamada �InterfaceFuncional�,
adicionando uma anota��o de interface funcional, utilizando do m�todo 
�show� da interface para exibi��o da mensagem.*/

public class Teste{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Hello World!";
		
		InterfaceFuncional i = (t) -> System.out.println(t);
		
		i.show(msg);
	}

}
