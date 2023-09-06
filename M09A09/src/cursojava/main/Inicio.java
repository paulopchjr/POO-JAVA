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

				String nota1 = JOptionPane.showInputDialog("Qual é a Nota: 1  do aluno " + aluno.getNome());
				String nota2 = JOptionPane.showInputDialog("Qual é a Nota: 2  do aluno " + aluno.getNome());
				String nota3 = JOptionPane.showInputDialog("Qual é a Nota: 3  do aluno " + aluno.getNome());
				String nota4 = JOptionPane.showInputDialog("Qual é a Nota: 4  do aluno " + aluno.getNome());

				/* Atribuindo os valores das variaveis no atributo do objeto */
				aluno.setN1(Double.parseDouble(nota1));
				aluno.setN2(Double.parseDouble(nota2));
				aluno.setN3(Double.parseDouble(nota3));
				aluno.setN4(Double.parseDouble(nota4));

				listaAlunos.add(aluno);

			}

			for (Aluno alunos : listaAlunos) {

				System.out.println(alunos.imprimeStatusAluno());
			}

		} else {
			System.out.println("Não foi possível realizar essa operação");
		}

	}

}
