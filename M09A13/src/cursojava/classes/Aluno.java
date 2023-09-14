package cursojava.classes;

public class Aluno {

	private String nome;
	private int idade;

	// Relacionando os objetos
	private Disciplina disciplina = new Disciplina();

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	private double getMedia() {
		return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4;
	}

	public String getStatusAluno() {
		double media = this.getMedia();
		if (media >= 5) {
			return media >= 7 ? " Aluno Aprovado" : " Aluno em recuperação";
		} else {
			return " Aluno reprovado";
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
