package br.com.joaodebarro.jbcontrole.administrativo;
import java.util.ArrayList;
import java.util.List;

import br.com.joaodebarro.jbcontrole.pessoas.PessoaJuridica;
import br.com.joaodebarro.jbcontrole.servicos.Compra;

public class Fornecedor {

	private PessoaJuridica empresa;
	private List<Compra> pedidos;

	public Fornecedor(PessoaJuridica empresa) {
		super();
		this.empresa = empresa;
		this.pedidos = new ArrayList<Compra>();
	}

	public PessoaJuridica getEmpresa() {
		return empresa;
	}

	public List<Compra> getTodasCompras() {
		return pedidos;
	}
	
	public void novaCompra(Compra compra) {
		pedidos.add(compra);
	}
	
	public double valorEmAberto() {
		double valorTotalEmAberto = 0;
		for (Compra compraAtual : pedidos) {
			valorTotalEmAberto += compraAtual.getValorFinal();
		}
		return valorTotalEmAberto;
	}
}
