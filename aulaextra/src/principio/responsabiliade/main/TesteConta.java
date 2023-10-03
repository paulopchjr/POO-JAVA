package principio.responsabiliade.main;

import principio.responsabilidade.ContaBancaria;

public class TesteConta {

	/*
	 * Principio de responsabilidade SOLID:
	 * 
	 * 1 Objeto tem que realizar o processo dentro dele prorio desde qu ele precis
	 * esteja dentro dele
	 */

	public static void main(String[] args) {

		ContaBancaria contaBancaria = new ContaBancaria();

		contaBancaria.setDescricao("Conta bancária do Paulo");

		System.out.println(contaBancaria);

		contaBancaria.Diminui100Reais();
		contaBancaria.Diminui100Reais();

		System.out.println(contaBancaria);

		contaBancaria.depositarDinheiro(12000);
		System.out.println("Atual cm deposito : " + contaBancaria);

		contaBancaria.sacarDinheiro(21800);
		System.out.println(contaBancaria);

	}

}
