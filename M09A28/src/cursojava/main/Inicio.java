package cursojava.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class Inicio {

	public static void main(String[] args) {

		/* Fazendo uma SIMPLES VALIDAÇÃO DE PERMISSAÃO DE ACESSO AO SISTEMA */

		String login = JOptionPane.showInputDialog("Informe o seu login");
		String senha = JOptionPane.showInputDialog("Informe a sua senha");

		if (login != null && !login.isEmpty() && login.equalsIgnoreCase("admin") && senha != null && !senha.isEmpty()
				&& senha.equalsIgnoreCase("admin")) {

			int acao1 = JOptionPane.showConfirmDialog(null, "Deseja cadastrar aluno?");

			if (acao1 == 0) {

				String qtdAluno = JOptionPane.showInputDialog("Quantos alunos deseja cadastrar ?");

				/* Converte uma Strin em um inteiro */
				int totalAluno = Integer.parseInt(qtdAluno);

				/*
				 * Uma lista que dentro dela temos uma chave identifica uma sequencia de valores
				 */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				/* Cria uma lista de alunos */
				List<Aluno> alunos = new ArrayList<Aluno>();

				/* percorre a quantidade de alunos que foi digitado */
				for (int i = 1; i <= totalAluno; i++) {

					/* instancia um aluno novo */
					Aluno aluno = new Aluno();
					String nomeAluno = JOptionPane.showInputDialog("Qual é o nome do " + i + " aluno ?");
					// String raAluno = JOptionPane.showInputDialog("Qual é o RA do " + i + " aluno
					// ?");

					/* setando os valores nas variaveis do objeto aluno */
					aluno.setNome(nomeAluno);
					// aluno.setRa(raAluno);

					/*
					 * Percorre as quatros disciplinas que foram fixadas por padrao --- por enquanto
					 */
					for (int d = 1; d <= 4; d++) {
						Disciplina disciplinas = new Disciplina();

						String nomeDisciplina = JOptionPane.showInputDialog("Qual é o nome da Disciplina ?" + d);
						disciplinas.setDisciplina(nomeDisciplina);
						String notaDisciplina = JOptionPane
								.showInputDialog("Qual é a nota da Disciplina " + disciplinas.getDisciplina());
						disciplinas.setNota(Double.parseDouble(notaDisciplina));

						/* Adicionando as discplinas no aluno */
						aluno.getDisciplinas().add(disciplinas);

					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
					if (escolha == 0) {
						int continuarremover = 0;
						int posicao = 1;
						while (continuarremover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual é a disciplina 1,2, 3, 4 ?");

							// removendo a posicao da lista;
							aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++; /* Soma uma posicao */
							continuarremover = JOptionPane.showConfirmDialog(null,
									"Deseja remover mais alguma disciplina?");
						}
					}

					/* adicionando o aluno na lista */
					alunos.add(aluno);

				}

				/*
				 * Inserindo alunos aprovado, recuperação e reprovados da lista de alunos, no
				 * hasmap
				 */
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				/* percorrendo a lista de alunos */
				for (Aluno aluno : alunos) {
					if (aluno.StatusDoAluno().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else if (aluno.StatusDoAluno().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					} else {

						maps.get(StatusAluno.REPROVADO).add(aluno);
					}
				}

				/* Imprimindo os alunos aprovados, recuperação e aprovado */
				System.out.println("Lista de Alunos Aprovados");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(aluno.getDadosAluno());
				}

				System.out.println("\n Lista de Alunos Em Recuperação");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(aluno.getDadosAluno());

				}

				System.out.println("\n Lista de Alunos Reprovados");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(aluno.getDadosAluno());
				}

			} else {

				JOptionPane.showInternalMessageDialog(null, "Saindo do sistema");
			}
		} else {
			JOptionPane.showInternalMessageDialog(null, "Erro no login");
		}

	}
}
