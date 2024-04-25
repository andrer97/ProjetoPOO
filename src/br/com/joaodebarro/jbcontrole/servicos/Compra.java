package br.com.joaodebarro.jbcontrole.servicos;
import java.util.Date;
import java.util.List;

import br.com.joaodebarro.jbcontrole.administrativo.Fornecedor;
import br.com.joaodebarro.jbcontrole.usuarios.Funcionario;

public class Compra {

	private Date data;
	private int notaFiscal;
	private Fornecedor fornecedor;
	private List<Itens> listaItens;
	private Funcionario comprador;
	private double valorFinal;
	
	public Compra(int notaFiscal, Fornecedor fornecedor, List<Itens> listaItens, Funcionario comprador) {
		super();
		this.data = new Date();
		this.notaFiscal = notaFiscal;
		this.fornecedor = fornecedor;
		this.listaItens = listaItens;
		this.comprador = comprador;
		valorFinal = 0;
		for(Itens itemAtual : listaItens) {
			// cria a variavel quantidade que recebe atraves do metodo getQuantidade() a quantidade do Itens atual
			double quantidade = itemAtual.getQuantidade();
			//cria a variavel produto do tipo produto que recebe o produto do Itens atual
			Produto produto = itemAtual.getProduto();
			//acessa o valor de compra do produto atual e multiplica pela quantidade atual
			valorFinal +=  quantidade * produto.getValorCompra();
			//pega a quantidade em estoque do produto atual e soma com a quantidade atual e joga esse valor para a quantidade em estoque do produto atual
			produto.setQtdEstoque(produto.getQtdEstoque() + quantidade);
		}
		this.fornecedor.novaCompra(this);
	}

	public Date getData() {
		return data;
	}

	public int getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Itens> getListaItens() {
		return listaItens;
	}

	public Funcionario getComprador() {
		return comprador;
	}

	public void setComprador(Funcionario comprador) {
		this.comprador = comprador;
	}

	public double getValorFinal() {
		return valorFinal;
	}
}
