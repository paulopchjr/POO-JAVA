package cursojava.main;

import cursojava.classes.Aluno;

public class Inicio {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setNome("Paulo");
		aluno.setNota1(10);
		aluno.setNota2(10);
		aluno.setNota3(7);
		aluno.setNota4(10);

		System.out.println(aluno.ImprimeResultado());

	}
}
