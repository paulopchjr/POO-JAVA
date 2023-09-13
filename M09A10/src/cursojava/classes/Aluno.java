package cursojava.classes;

public class Aluno {

	private String nome;
	private double n1;
	private double n2;
	private double n3;
	private double n4;;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getN4() {
		return n4;
	}

	public void setN4(double n4) {
		this.n4 = n4;
	}

	private double getMedia() {
		return (n1 + n2 + n3 + n4) / 4;
	}

	private String getStatusAluno() {
		double media = this.getMedia();
		if (media >= 5) {
			return media >= 7 ? " Aluno Aprovado" : " Aluno em recuperação";
		} else {
			return " Aluno reprovado";
		}

	}

	public String imprimeStatusAluno() {
		return "Nome do Aluno : "+nome+"\nNota 1:" + n1 + "\nNota 2:" + n2 + "\nNota 3:" + n3 + "\nNota 4:" + n4 + "\n média:" + this.getMedia()
				+ "\n Status:"+ this.getStatusAluno()+"\n -------------------\n";
	}

	/* método to String */
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + "]";
	}
	
	
	

}
