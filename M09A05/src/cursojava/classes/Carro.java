package cursojava.classes;

/**
 * 
 */
public class Carro {
	
	private String nome;
	private String cor;
	private String marca;
	private String modelo;
	private int ano;
	private double valor;
	private String descricao;
	

	public Carro() {
	
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	@Override
	public String toString() {
		return "Carro [nome=" + nome + "\n cor=" + cor + "\n marca=" + marca + "\n modelo=" + modelo + "\n ano=" + ano
				+ " \n valor=" + valor + "\n descricao=" + descricao + "]";
	}
	
	
	
	

}
