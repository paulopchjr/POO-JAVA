package cursojava.main;

import cursojava.classes.Carro;

public class Inicio {
	
	
	public static void main(String[] args) {
		
		
		
		Carro carro = new Carro();
		carro.setNome("JETTA");
		carro.setMarca("WOLKSWAGEN");
		carro.setCor("CHUMBO");
		carro.setModelo("GLI");
		carro.setAno(2023);
		carro.setValor(216.00);
		carro.setDescricao(" Multimídia com tela de 10,1 polegadas.\n Volante com teclas touch.\n Parachoque resedenhados. \n Rodas Aro 18 poleagdas" +
		"\n Motor: 2.0 TSI EA888 -> 231 cv e 35,7 kgfm. \n Velocidade: 0 a 100 em 6,7 segundos velocidade maxima 249, km/h");
		
		
		System.out.println(carro);
		
		
		
	}

}
