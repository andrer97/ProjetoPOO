
public class Produto {

	private String nome;
	private double qtdEstoque;
	private double valorCompra;
	private double valorVenda;
	
	public Produto(String nome, double qtdEstoque, double valorCompra, double valorVenda) {
		super();
		this.nome = nome;
		this.qtdEstoque = qtdEstoque;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(double qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
}
