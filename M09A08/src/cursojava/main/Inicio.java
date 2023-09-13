package cursojava.main;

import cursojava.classes.Aluno;

public class Inicio {

	public static void main(String[] args) {

		/*
		 * Aluno aluno = null; * Aqui é o erro ( java.lang.NullPointerException), toda
		 * referencia tem que ter uma instancia de um objeto
		 * 
		 * 
		 * aluno.setNome("Paulo"); aluno.setNota1(10); aluno.setNota2(10);
		 * aluno.setNota3(7); aluno.setNota4(10);
		 * System.out.println(aluno.ImprimeResultado());
		 */

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Paulo Cezar");
		aluno2.setNota1(10);
		aluno2.setNota2(10);
		aluno2.setNota3(7);
		aluno2.setNota4(10);

		System.out.println(aluno2.ImprimeResultado());

	}
}
