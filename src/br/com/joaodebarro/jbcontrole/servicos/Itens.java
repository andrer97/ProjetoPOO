package br.com.joaodebarro.jbcontrole.servicos;

public class Itens {

	private Produto produto;
	private double quantidade;
	
	public Itens(Produto produto, double quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
}
