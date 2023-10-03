package bancojavax.classes;

import java.util.ArrayList;
import java.util.List;

public class Clientes {

	private String nome;
	private String cpf;
	
	private List<ContaBancaria>contasb = new ArrayList<ContaBancaria>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<ContaBancaria> getContasb() {
		return contasb;
	}

	public void setContasb(List<ContaBancaria> contasb) {
		this.contasb = contasb;
	}
	
	public String dadosConta() {
		
		String cb = "";
		for (ContaBancaria contaBancaria : contasb) {
			cb = contaBancaria.toString();
			
		}
		
		
		return cb;
		
	}
	
	
	
}
