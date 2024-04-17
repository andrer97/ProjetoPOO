import java.util.Date;
import java.util.List;

public class Venda {

	private Date data;
	private int notaFiscal;
	private Cliente cliente;
	private List<Itens> listaItens;
	private Funcionario vendedor;
	private double valorFinal;
	
	public Venda(Date data, int notaFiscal, Cliente cliente, List<Itens> listaItens, Funcionario vendedor,
			double valorFinal) {
		super();
		this.data = new Date();
		this.notaFiscal = notaFiscal;
		this.cliente = cliente;
		this.listaItens = listaItens;
		this.vendedor = vendedor;
		valorFinal = 0;
		for(Itens atual : listaItens) {
			valorFinal += atual.getQuantidade() * atual.getProduto().getValorCompra();
			atual.getProduto().setQtdEstoque(atual.getProduto().getQtdEstoque() - atual.getQuantidade());
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

	public void setListaItens(List<Itens> listaItens) {
		this.listaItens = listaItens;
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
