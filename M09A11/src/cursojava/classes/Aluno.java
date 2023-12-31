package cursojava.classes;

import java.util.Objects;

public class Aluno {

	private String nome;
	private int idade;
	
	
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
	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}
	
	
	/* metodo que de comparação no java*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return idade == other.idade && Objects.equals(nome, other.nome);
	}
	
	
	
}
