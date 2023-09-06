package cursojava.classes;

// Criando a nossa classe / objeto que representa o Aluno
public class Aluno {

	String nome;
	int idade;
	String dataNascimento;
	String numerocpf;
	String registroGeral;
	String nomeMae;
	String nomePai;

	/// Criando um construtor

	public Aluno() { // 1 jeito

	}

	public Aluno(String nomePadrao, int idadePadrao) { // 2 jeito ja tendo um atributo como paramentros
		nome = nomePadrao;
		idade = idadePadrao;
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
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNumerocpf() {
		return numerocpf;
	}

	public void setNumerocpf(String numerocpf) {
		this.numerocpf = numerocpf;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

}
