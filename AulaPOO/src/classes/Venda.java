package classes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private Long id;
	private String descricaoVenda;
	private String enderecoVenda;
	private BigDecimal valorTotal;

	private List<Produto> produtos = new ArrayList<Produto>();

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getEnderecoVenda() {
		return enderecoVenda;
	}

	public void setEnderecoVenda(String enderecoVenda) {
		this.enderecoVenda = enderecoVenda;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	private BigDecimal total() {

		Double valor = 0.0;
		for (Produto produto : produtos) {
			valor += produto.getValorProduto().doubleValue();
		}

		return BigDecimal.valueOf(valor);

	}

	public String dadosVenda() {

		String dados = "";
		for (Produto produto : produtos) {
			dados += "Nome do Produto : " + produto.getNomeProduto() + " | Valor Unitário:" + produto.getValorProduto() + "\n";
		}

		return dados + "\n Total: " + this.total();

	}

}
