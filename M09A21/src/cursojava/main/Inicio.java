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

			int totalAluno = Integer.parseInt(qtdAluno);

			List<Aluno> alunos = new ArrayList<Aluno>();

			for (int i = 1; i <= totalAluno; i++) {

				Aluno aluno = new Aluno();
				String nomeAluno = JOptionPane.showInputDialog("Qual é o nome do " + i + " aluno ?");
				String raAluno = JOptionPane.showInputDialog("Qual é o RA do " + i + " aluno ?");

				aluno.setNome(nomeAluno);
				aluno.setRa(raAluno);

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

				alunos.add(aluno);
			}

			int acao2 = JOptionPane.showConfirmDialog(null, "Deseja procurar um Aluno no sistema?");

			if (acao2 == 0) {
				String nomeAlunoProcurado = JOptionPane.showInputDialog("Qual é o nome do aluno que deseja procurar?");
				for (Aluno aluno : alunos) {
					if (aluno.getNome().equals(nomeAlunoProcurado)) {
						System.out.println(aluno.getDadosAluno());
						break;
					} else {

						System.out.println(" Não possui esse nome na lista: " + nomeAlunoProcurado
								+ "\n Lista de Alunos" + aluno.getDadosAluno());
					}
				}
			} else {
				for (Aluno aluno : alunos) {
					System.out.println(aluno.getDadosAluno());
				}
			}

		} else {

			JOptionPane.showInternalMessageDialog(null, "Saindo do sistema");
		}

	}
}
