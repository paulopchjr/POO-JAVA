package executavel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Produto;
import classes.Venda;

public class Inicio {

	public static void main(String[] args) {

		int opcao = JOptionPane.showConfirmDialog(null, "Deseja realizar uma venda ?");

		List<Venda> vendas = new ArrayList<Venda>();

		Long codigo = (long) 0;
		while (opcao == 0) {
			codigo = codigo + 1;
			Venda venda = new Venda();

			venda.setId(codigo);
			String descricaoVenda = JOptionPane.showInputDialog("Descrição da venda:");
			venda.setDescricaoVenda(descricaoVenda);
			String enderecoVenda = JOptionPane.showInputDialog("Qual é o endereço");
			venda.setEnderecoVenda(enderecoVenda);

			int opcaoAddProduto = JOptionPane.showConfirmDialog(null, "Deseja adicionar produto na venda ?");
			while (opcaoAddProduto == 0) {
				Produto produto = new Produto();
				String nomeProduto = JOptionPane.showInputDialog("Qual é o nome do produto? ");
				produto.setNomeProduto(nomeProduto);
				String valorProduto = JOptionPane.showInputDialog("Qual é o valor do produto?");
				produto.setValorProduto(BigDecimal.valueOf(Double.parseDouble(valorProduto)));

				// addicionando os produtos na lista da venda
				venda.getProdutos().add(produto);
				opcaoAddProduto = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais  produto na venda ?");
			}

			vendas.add(venda);
			opcao = JOptionPane.showConfirmDialog(null, "Deseja realizar uma nova venda ?");
			

		}

		for (Venda venda : vendas) {
			System.out.println("Venda: " + venda.getId());
			System.out.println("Descrição: "+ venda.getDescricaoVenda());
			System.out.println("Endereço: " + venda.getEnderecoVenda());
			System.out.println(venda.dadosVenda());
			System.out.println("****************************");
		}

	}

}