package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private int idade;
	private String DataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomePai;
	private String nomeMae;
	private String nomeEscola;
	private String matricula;
	private String termo;

	/* Criando uma lista de Disciplinas */
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	private double getMediaNotaAluno() {

		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();

		}
		return somaNotas / disciplinas.size(); /* retorna a quantidade de disciplinas na lista */
	}

	
	/*Método que retorna se o aluno está aprovado ou não*/
	public String StatusAluno() {
		double media = this.getMediaNotaAluno();
		if (media >= 5) {
			return media >= 7 ? "Aluno Aprovado" + "\nMédia:" + media : "Aluno recuperação:" +"\nMédia:" + media;
		} else {
			return "Aluno reprovado";
		}
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
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

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTermo() {
		return termo;
	}

	public void setTermo(String termo) {
		this.termo = termo;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", disciplinas=" + disciplinas + "]";
	}

}
