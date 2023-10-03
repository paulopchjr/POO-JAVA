package bancojavax.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import bancojavax.classes.Clientes;
import bancojavax.classes.Colaborador;
import bancojavax.classes.ContaBancaria;

public class Inicio {

	public static void main(String[] args) {

		int passo = 0;
		while (passo == 0) {

			String login = JOptionPane.showInputDialog("Informe o seu login");
			String senha = JOptionPane.showInputDialog("Informe a sua senha");
			String confirmeLogin = JOptionPane.showInputDialog("Confirme o seu login");
			String confirmeSenha = JOptionPane.showInputDialog("Confirme a sua senha");

			if (confirmeLogin.equalsIgnoreCase(login) && confirmeSenha.equalsIgnoreCase(senha)
					&& !login.equalsIgnoreCase("colaborador")) {

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

				String numeroConta = JOptionPane.showInputDialog("Número da conta ? ");
				bancaria.setNumeroConta(numeroConta);

				int escolha = 0;
				do {

					String info2 = JOptionPane
							.showInputDialog("O que deseja fazer? \n 1-Saque \n 2-Consulta \n 3- Deposito ?");
					escolha = Integer.parseInt(info2);
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

					escolha = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?");
				} while (escolha == 0);
				JOptionPane.showInternalMessageDialog(null,
						"Sr(a). " + clientes.getNome() + " O " + bancaria.verSaldoAtual());

			}

			else if (login.equalsIgnoreCase("colaborador") && senha.equalsIgnoreCase("col123!")) {

				Colaborador colaborador = new Colaborador();
				String nomeColaborador = JOptionPane.showInputDialog("Informe o nome do Colaborador");
				colaborador.setNome(nomeColaborador);
				String cargoColaborador = JOptionPane
						.showInputDialog("Informe o cardo do colaborador " + colaborador.getNome());
				colaborador.setCargo(cargoColaborador);

				int escolhaCol = 0;
				List<Clientes> listaClientes = new ArrayList<Clientes>();
				do {

					String info3 = JOptionPane.showInputDialog("O Que Deseja Fazer? \n 1- Cadastrar Clientes");
					escolhaCol = Integer.parseInt(info3);
					
					switch (escolhaCol) {
					case 1:
						String qtdCli = JOptionPane.showInputDialog("Quantos clientes deseja Cadastrar?");
						for (int pos = 0; pos < Integer.parseInt(qtdCli); pos++) {
							Clientes clientes = new Clientes();
							String nomeCliente = JOptionPane.showInputDialog("Qual é o nome do cliente " + pos + " ? ");
							clientes.setNome(nomeCliente);
							String cpfCliente = JOptionPane.showInputDialog("Qual é o seu cpf ?");
							clientes.setCpf(cpfCliente);

							String qtdConta = JOptionPane
									.showInputDialog("Quantas contas o cliente" + clientes.getNome() + " Possui?");
							for(int poscont =1; poscont <= Integer.parseInt(qtdConta); poscont++) {
									ContaBancaria conta = new ContaBancaria();
									String numerocontaCli = JOptionPane.showInputDialog("Informe o numero da conta");
									conta.setNumeroConta(numerocontaCli);
									
									clientes.getContasb().add(conta); // add uma conta no cliente
									
								
								
							}
							
							//add cliente na listadecliente
							listaClientes.add(clientes);

						}
						break;
					}
					
					
					

				} while (escolhaCol== 0);

			} else {
				JOptionPane.showInternalMessageDialog(null, "Login e/ou senha inválidos");
			}

			passo = 1;

		}
	}

}
