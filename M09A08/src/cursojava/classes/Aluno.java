package cursojava.classes;

public class Aluno {

	private String nome;
	private double nota1, nota2, nota3, nota4;

	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	private double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

	private String getStatusAluno() {
		double media = this.getMediaNota();
		if (media >= 5) {
			return media > 7 ? "Aluno aprovado" : "Aluno em Recuperação";

		} else {
			return " Aluno Reprovado";
		}
	}
	
	
	public String ImprimeResultado() {
		String n1 = String.valueOf(nota1);
		String n2 = String.valueOf(nota2);
		String n3 = String.valueOf(nota3);
		String n4 = String.valueOf(nota4);
		String media = String.valueOf(this.getMediaNota());
		
		return " Nota 1: "+ n1 + "\n Nota 2:"+ n2 + "\n Nota 3:"+ n3 +"\n Nota 4:"+ n4 + "\n Média:" + media +"\nStatus:" + this.getStatusAluno();
		
	}

	
}
