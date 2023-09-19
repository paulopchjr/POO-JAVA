package cursojava.main;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Inicio {

	public static void main(String[] args) {

		/* Instanciando um novo Aluno */
		Aluno aluno = new Aluno();

		/* Entada de dados do Primeiro Objeto */
		String nomeAluno = JOptionPane.showInputDialog("Nome do aluno");
		String raAluno = JOptionPane.showInputDialog("Número do RA");
		String termo = JOptionPane.showInputDialog("Qual é o termo");

		/* Setando os objetos */
		aluno.setNome(nomeAluno);
		aluno.setMatricula(raAluno);
		aluno.setTermo(termo);

		for (int posicao = 1; posicao <= 4; posicao++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + posicao + " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + posicao + " ?");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.parseDouble(notaDisciplina));

			// adicionando displinas no aluno
			aluno.getDisciplinas().add(disciplina);
		}
		
		 int escolha  = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		 if(escolha ==0) {
			 String disciplinaRemover = JOptionPane.showInputDialog("Qual é a disciplina 1,2, 3, 4 ?");
			 
			 // removendo a posicao da lista;
			 aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1 );
		 }

		System.out.println(aluno.StatusAluno());
		

	}

}
