package exercicio4;

public class Avaliacao{
	private String disciplina;
	private String aluno;
	private Integer nota;

	// Construtor
	public Avaliacao(String disciplina, String aluno, Integer nota) {
	    this.disciplina = disciplina;
	    this.aluno = aluno;
	    this.nota = nota;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}
	
	
}
