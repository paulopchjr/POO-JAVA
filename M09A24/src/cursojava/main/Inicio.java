package cursojava.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Inicio {

	public static void main(String[] args) {

		int acao1 = JOptionPane.showConfirmDialog(null, "Deseja cadastrar aluno?");

		if (acao1 == 0) {

			String qtdAluno = JOptionPane.showInputDialog("Quantos alunos deseja cadastrar ?");

			/* Converte uma Strin em um inteiro */
			int totalAluno = Integer.parseInt(qtdAluno);

			/* Cria uma lista de alunos */
			List<Aluno> alunos = new ArrayList<Aluno>();

			/* percorre a quantidade de alunos que foi digitado */
			for (int i = 1; i <= totalAluno; i++) {

				/* instancia um aluno novo */
				Aluno aluno = new Aluno();
				String nomeAluno = JOptionPane.showInputDialog("Qual é o nome do " + i + " aluno ?");
				String raAluno = JOptionPane.showInputDialog("Qual é o RA do " + i + " aluno ?");

				/* setando os valores nas variaveis do objeto aluno */
				aluno.setNome(nomeAluno);
				aluno.setRa(raAluno);

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

			/* Percorrendo a lista de alunos */

			System.out.println("Lista de Alunos:");
			for (int posicao = 0; posicao < alunos.size(); posicao++) {
				/* pegando o aluno pela sua posicao da lista */
				Aluno aluno = alunos.get(posicao);

				System.out.println(aluno.getDadosAluno());

				for (int posDisciplina = 0; posDisciplina < aluno.getDisciplinas().size(); posDisciplina++) {
					Disciplina dis = aluno.getDisciplinas().get(posDisciplina);
					System.out.println("Disciplina = " + dis.getDisciplina() + " | Nota :" + dis.getNota());
				}

				System.out.println("*****************************");

			}

			int acao2 = JOptionPane.showConfirmDialog(null, "Deseja trocar o Aluno?");

			while (acao2 == 0) {
				String alunoTroca = JOptionPane.showInputDialog("Qual é aluno você deseja trocar?");
				for (int posiAluno = 0; posiAluno < alunos.size(); posiAluno++) {
					Aluno aluno = alunos.get(posiAluno);

					if (aluno.getNome().equalsIgnoreCase(alunoTroca)) {
						Aluno trocarAluno = new Aluno();
						String nomeAlunoTroca = JOptionPane.showInputDialog("Qual é o nome do novo aluno ?");
						trocarAluno.setNome(nomeAlunoTroca);
						String raAlunoTroca = JOptionPane.showInputDialog("Qual é o ra do aluno " + trocarAluno.getNome() + " ? ");
						trocarAluno.setRa(raAlunoTroca);
						for (int disciNova = 1; disciNova <= 4; disciNova++) {
							Disciplina novaDisciplina = new Disciplina();
							String novaD = JOptionPane.showInputDialog("Qual é a" + disciNova
									+ " disciplina nova do aluno" + trocarAluno.getNome() + " ?");
							novaDisciplina.setDisciplina(novaD);
							String novaN = JOptionPane.showInputDialog("Qual é o valor da nota" + disciNova
									+ " disciplina nova do aluno" + trocarAluno.getNome() + " ?");

							novaDisciplina.setNota(Double.parseDouble(novaN));

							trocarAluno.getDisciplinas().add(novaDisciplina);

						}
						// aqui atualiza a lista
						alunos.set(posiAluno, trocarAluno);

					}

				}
				acao2 = JOptionPane.showConfirmDialog(null, "Continuar a trocar aluno?");
			}

			System.out.println("Lista Atualizada de Alunos:");
			for (int p = 0; p < alunos.size(); p++) {
				/* pegando o aluno pela sua posicao da lista */
				Aluno aluno = alunos.get(p);

				System.out.println(aluno.getDadosAluno());

				for (int posDisciplina = 0; posDisciplina < aluno.getDisciplinas().size(); posDisciplina++) {
					Disciplina dis = aluno.getDisciplinas().get(posDisciplina);
					System.out.println("Disciplina = " + dis.getDisciplina() + " | Nota :" + dis.getNota());
				}

				System.out.println("*****************************");

			}

		} else {

			JOptionPane.showInternalMessageDialog(null, "Saindo do sistema");
		}

	}
}
