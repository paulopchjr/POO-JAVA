package cursojava.classes;

public class Aluno {

	private String nome;
	private int idade;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private String Disciplina1;
	private String Disciplina2;
	private String Disciplina3;
	private String Disciplina4;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	private double getMedia() {
		return (getNota1() + getNota2() + getNota3() + getNota4()) / 4;
	}

	private String getStatusAluno() {
		double media = this.getMedia();
		if (media >= 5) {
			return media >= 7 ? " Aluno Aprovado" : " Aluno em recuperação";
		} else {
			return " Aluno reprovado";
		}

	}

	public String imprimeStatusAluno() {
		return "Nome do Aluno : " + nome + "\n Disciplina 1 = " + getDisciplina1() + " \n Nota 1:" + getNota1()
				+ "\n Disciplina 2 = " + getDisciplina2() + "\nNota 2:" + getNota2() + "\n Disciplina 3 = "
				+ getDisciplina3() + "\nNota 3:" + getNota3() + "\n Disciplina 4 = " + getDisciplina4() + "Nota 4:"
				+ getNota4() + "\n média:" + this.getMedia() + "\n Status:" + this.getStatusAluno()
				+ "\n -------------------\n";
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public String getDisciplina1() {
		return Disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		Disciplina1 = disciplina1;
	}

	public String getDisciplina2() {
		return Disciplina2;
	}

	public void setDisciplina2(String disciplina2) {
		Disciplina2 = disciplina2;
	}

	public String getDisciplina3() {
		return Disciplina3;
	}

	public void setDisciplina3(String disciplina3) {
		Disciplina3 = disciplina3;
	}

	public String getDisciplina4() {
		return Disciplina4;
	}

	public void setDisciplina4(String disciplina4) {
		Disciplina4 = disciplina4;
	}

}
