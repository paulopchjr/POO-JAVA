package cursoja.main;

import cursojava.classes.Aluno;

public class Inicio {
	
	public static void main(String[] args) {
		
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Paulo");
		
		
		Aluno  aluno2 = new Aluno();
		aluno2.setNome("Paulo");
		
		
		
		if(aluno.equals(aluno2)) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
		
	}

}
