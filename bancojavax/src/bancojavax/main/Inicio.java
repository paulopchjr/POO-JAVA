package bancojavax.main;

import javax.swing.JOptionPane;

import bancojavax.classes.Clientes;
import bancojavax.classes.ContaBancaria;

public class Inicio {

	public static void main(String[] args) {

		int passo = 0;
		while (passo == 0) {
			String info = JOptionPane.showInputDialog("Quem é você? \n 1- Cliente 2- Colaborador");
			System.out.println(info);
			if (info.equalsIgnoreCase("1")) {

				String login = JOptionPane.showInputDialog("Informe o seu login");
				String senha = JOptionPane.showInputDialog("Informe a sua senha");
				String confirmeLogin = JOptionPane.showInputDialog("Confirme o seu login");
				String confirmeSenha = JOptionPane.showInputDialog("Confirme a sua senha");

				if (confirmeLogin.equalsIgnoreCase(login) && confirmeSenha.equalsIgnoreCase(senha)) {

					Clientes clientes = new Clientes();
					String nomeCliente = JOptionPane.showInputDialog("Informe o seu nome:");
					clientes.setNome(nomeCliente);
					String cpfCliente = JOptionPane.showInputDialog("Informe o seu CPF:");
					clientes.setCpf(cpfCliente);
					
					
					
					ContaBancaria bancaria = new ContaBancaria();
					
					
					
					String descricaoConta = JOptionPane.showInputDialog("Qual é o tipo da conta");
					bancaria.setDescricao(descricaoConta);
					String agenciaConta = JOptionPane.showInputDialog("Número da Agência?");
					bancaria.setAgencia(agenciaConta);
					
					String numeroConta =JOptionPane.showInputDialog("Número da conta ? ");
					bancaria.setNumeroConta(numeroConta);
					

					do {
						
						String info2 = JOptionPane
								.showInputDialog("O que deseja fazer? \n 1-Saque \n 2-Consulta \n 3- Deposito ?");
						int escolha = Integer.parseInt(info2);
						switch (escolha) {
						case 1:
							String valorSaque = JOptionPane.showInputDialog("Quantos deseja sacar ?");
							bancaria.saque(Double.parseDouble(valorSaque));
							break;
						case 2:
							JOptionPane.showInternalMessageDialog(null, bancaria.verSaldoAtual());
							break;
						case 3:
							String valorDeposito = JOptionPane.showInputDialog("Quantos deseja Deposito ?");
							bancaria.depositar(Double.parseDouble(valorDeposito));
							break;
							default:
								JOptionPane.showInternalMessageDialog(null, bancaria);
							
						}
						
						passo = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?");
					}while(passo == 0);
					
					

				} else {
					JOptionPane.showInternalMessageDialog(null, "Login e/senha inválidos");
				}

				passo = 1;
			}
		}

	}
}
