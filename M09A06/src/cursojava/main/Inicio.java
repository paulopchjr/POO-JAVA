package cursojava.main;

import cursojava.classes.Aluno;

public class Inicio {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setNome("Paulo");
		aluno.setNota1(9.5);
		aluno.setNota2(7);
		aluno.setNota4(8);
		aluno.setNota3(10);

		System.out.println(" Aluno:" + aluno.getNome() + "\n Nota 1: " + aluno.getNota1() + "\n Nota 2: "
				+ aluno.getNota2() + "\n Nota 3: " + aluno.getNota3() + "\n Nota 4 : " + aluno.getNota4()
				+ "\n Média Nota : " + aluno.getMediaNota());

	}
}
