package principio.responsabilidade;

public class ContaBancaria {

	private String descricao;

	private double saldo = 10000;

	public void soma100Reais() {
		saldo += 100;
	}

	public void Diminui100Reais() {
		saldo -= 100;
	}

	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}

	public void depositarDinheiro(double deposito) {
		saldo += deposito;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}

}
