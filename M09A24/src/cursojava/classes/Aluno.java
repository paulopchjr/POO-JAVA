package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nome;
	private int idade;
	private String ra;
	private String cpf;
	private String rg;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	private double getMediaNotaALuno() {
		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}

		return somaNotas / disciplinas.size();

	}

	private String StatusAluno(){
		
		double media = this.getMediaNotaALuno();
		if(media >=5) {
			return media >=7 ? " Aluno Aprovado !" : "Aluno em Recuperação";
		}else {
			return " Aluno Reprovado";
		}
		
	}
	
	public String getDadosAluno() {
		return "Nome: " + getNome() + " . \n Ra: " + getRa() + "\n Média: " + getMediaNotaALuno() + "\n Status: " + StatusAluno() ; 
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

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

}
