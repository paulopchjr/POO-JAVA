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

			/*Converte uma Strin em um inteiro*/
			int totalAluno = Integer.parseInt(qtdAluno);

			/*Cria uma lista de alunos*/
			List<Aluno> alunos = new ArrayList<Aluno>();

			/*percorre a quantidade de alunos que foi digitado */
			for (int i = 1; i <= totalAluno; i++) {
				
				/*instancia um aluno novo*/
				Aluno aluno = new Aluno();
				String nomeAluno = JOptionPane.showInputDialog("Qual é o nome do " + i + " aluno ?");
				String raAluno = JOptionPane.showInputDialog("Qual é o RA do " + i + " aluno ?");

				/*setando os valores nas variaveis do objeto aluno*/
				aluno.setNome(nomeAluno);
				aluno.setRa(raAluno);

				/*Percorre as quatros disciplinas que foram fixadas por padrao --- por enquanto*/
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

				/*adicionando o aluno na lista*/
				alunos.add(aluno);

			}
			
			
			/*Percorrendo a lista de alunos*/
			for (int posicao =0; posicao < alunos.size(); posicao++) {
				/*pegando o aluno pela sua posicao da lista*/
				Aluno aluno = alunos.get(posicao); 
				
				System.out.println(aluno.getDadosAluno());
				
			}

		} else {

			JOptionPane.showInternalMessageDialog(null, "Saindo do sistema");
		}

	}
}
