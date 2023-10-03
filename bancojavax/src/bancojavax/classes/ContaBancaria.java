package bancojavax.classes;

public class ContaBancaria {

	private String descricao;
	private String numeroConta;
	private String agencia;
	private double saldo = 0.0;

	
	public void saque(double valor) {
		saldo -= valor;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String verSaldoAtual() {
		return "Saldo atual é = R$" + this.saldo;
	} 
	public String getDescricao() {
		return descricao;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", numeroConta=" + numeroConta + ", agencia=" + agencia
				+ ", saldo=" + saldo + "]";
	}

}
