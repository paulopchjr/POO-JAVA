package cursojava.classes;

public class Aluno {

	/*
	 * Atributos -> Privados só acessivel dentro da Classe, public acessivel em
	 * todas desde que ela seja instanciado
	 */
	public String nome;
	private int idade;

	/// Criando um construtor

	public Aluno() { // 1 jeito

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
