package cursojava.main;

import cursojava.classes.Aluno;

public class Inicio {
	
	public static void main(String[] args) {
		
		
		/* instancia*/            
		Aluno aluno = new Aluno();
		aluno.nome = "Paulo"; // setando um atributo publico
		aluno.setIdade(33);  //  setrando um atributo privado
		
	
	}

}
