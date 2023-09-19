package cursojava.main;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Inicio {

	public static void main(String[] args) {

		/* Instanciando um novo Aluno */
		Aluno aluno = new Aluno();

		/* instanciando uma disciplina */
		Disciplina disciplina = new Disciplina();

		/* Entada de dados do Primeiro Objeto */
		String nomeAluno = JOptionPane.showInputDialog("Nome do aluno");
		String nomeDisplina = JOptionPane.showInputDialog("Qual é o nome da Disciplina?");
		String notaDisplina = JOptionPane.showInputDialog("Qual é a nota da Disciplina?");
		disciplina.setDisciplina(nomeDisplina);
		disciplina.setNota(Double.parseDouble(notaDisplina));
		aluno.setNome(nomeAluno);

		Disciplina disciplina2 = new Disciplina();
		String nomeDisplina2 = JOptionPane.showInputDialog("Qual é o nome da Disciplina?");
		String notaDisplina2 = JOptionPane.showInputDialog("Qual é a nota da Disciplina?");
		disciplina2.setDisciplina(nomeDisplina2);
		disciplina2.setNota(Double.parseDouble(notaDisplina2));

		Disciplina disciplina3 = new Disciplina();
		String nomeDisplina3 = JOptionPane.showInputDialog("Qual é o nome da Disciplina?");
		String notaDisplina3 = JOptionPane.showInputDialog("Qual é a nota da Disciplina?");
		disciplina3.setDisciplina(nomeDisplina3);
		disciplina3.setNota(Double.parseDouble(notaDisplina3));

		Disciplina disciplina4 = new Disciplina();
		String nomeDisplina4 = JOptionPane.showInputDialog("Qual é o nome da Disciplina?");
		String notaDisplina4 = JOptionPane.showInputDialog("Qual é a nota da Disciplina?");
		disciplina4.setDisciplina(nomeDisplina4);
		disciplina4.setNota(Double.parseDouble(notaDisplina4));

		/* Adicionando a lista de disciplinas do aluno */
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		aluno.getDisciplinas().add(disciplina3);
		aluno.getDisciplinas().add(disciplina4);

		System.out.println(aluno.StatusAluno());

	}

}
