package cursojava.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class Inicio {

	public static void main(String[] args) {

		int acao = JOptionPane.showConfirmDialog(null, "Você deseja lançar a	 média dos alunos? ");

		if (acao == 0) {

			String qtdAluno = JOptionPane.showInputDialog(" Quantos alunos você deseja lançar a média? ");

			/* atribuindo o total de alunos na sala */
			int totalAluno = Integer.parseInt(qtdAluno);

			/* Criando uma lista de alunos */
			List<Aluno> listaAlunos = new ArrayList<Aluno>();

			/* Percorrendo todos os alunos da sala */
			for (int i = 1; i <= totalAluno; i++) {

				/* Instanciando um novo Aluno */
				Aluno aluno = new Aluno();

				/* Entada de dados */
				String nomeAluno = JOptionPane.showInputDialog("Nome do " + i + " aluno");
				aluno.setNome(nomeAluno);

				String disciplina1 = JOptionPane.showInputDialog("Qual é o nome da 1º Disciplina ?");
				String nota1 = JOptionPane.showInputDialog("Qual é a Nota a 1º  do aluno " + aluno.getNome() + "?");
				String disciplina2 = JOptionPane.showInputDialog("Qual é o nome da 2º Disciplina?");
				String nota2 = JOptionPane.showInputDialog("Qual é a Nota a 2º  do aluno ?" + aluno.getNome() + "?");
				String disciplina3 = JOptionPane.showInputDialog("Qual é o nome da 3º Disciplina ?");
				String nota3 = JOptionPane.showInputDialog("Qual é a Nota a 3º  do aluno " + aluno.getNome() + "?");
				String disciplina4 = JOptionPane.showInputDialog("Qual é o nome da 4º Disciplina ?");
				String nota4 = JOptionPane.showInputDialog("Qual é a Nota a 4º  do aluno " + aluno.getNome() + "?");

			}

		} else {
			System.out.println("Não foi possível realizar essa operação");
		}

	}

}
