package br.com.joaodebarro.jbcontrole.servicos;
import java.util.Date;
import java.util.List;

import br.com.joaodebarro.jbcontrole.usuarios.Cliente;
import br.com.joaodebarro.jbcontrole.usuarios.Funcionario;

public class Venda {

	private Date data;
	private int notaFiscal;
	private Cliente cliente;
	private List<Itens> listaItens;
	private Funcionario vendedor;
	private double valorFinal;
	
	public Venda(int notaFiscal, Cliente cliente, List<Itens> listaItens, Funcionario vendedor) {
		super();
		this.data = new Date();
		this.notaFiscal = notaFiscal;
		this.cliente = cliente;
		this.listaItens = listaItens;
		this.vendedor = vendedor;
		valorFinal = 0;
		for(Itens itemAtual : listaItens) {
			
			double quantidade = itemAtual.getQuantidade();
			
			Produto produto = itemAtual.getProduto();
			valorFinal += quantidade * produto.getValorVenda();
			
			produto.setQtdEstoque(produto.getQtdEstoque() - quantidade);
		}
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Itens> getListaItens() {
		return listaItens;
	}

	public Funcionario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Funcionario vendedor) {
		this.vendedor = vendedor;
	}

	public double getValorFinal() {
		return valorFinal;
	}	
}
