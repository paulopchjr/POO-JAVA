package cursojava.main;

import cursojava.classes.Aluno;

public class Inicio {

	public static void main(String[] args) {

		// instanciando aluno
		Aluno aluno = new Aluno();

		// setando os atributos do aluno
		aluno.setNome("Paulo Cezar");
		aluno.setIdade(33);

		
		System.out.println("Nome do Aluno 1 = " + aluno.getNome());
		
		/////////////// ***////////
		
		/* Segundo jeito de instancia o aluno com o nome no construtor*/
		Aluno aluno2 = new Aluno("Junior",33); // ja seta o atributos dentro da instancia;
		System.out.println("Nome do Aluno 2 = " + aluno2.getNome() + "\n idade  = " + aluno2.getIdade());
		
		
		
	}

}
