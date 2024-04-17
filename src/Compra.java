import java.util.Date;
import java.util.List;

public class Compra {

	private Date data;
	private int notaFiscal;
	private Fornecedor fornecedor;
	private List<Itens> listaItens;
	private Funcionario comprador;
	private double valorFinal;
	
	public Compra(Date data, int notaFiscal, Fornecedor fornecedor, List<Itens> listaItens, Funcionario comprador) {
		super();
		this.data = new Date();
		this.notaFiscal = notaFiscal;
		this.fornecedor = fornecedor;
		this.listaItens = listaItens;
		this.comprador = comprador;
		valorFinal = 0;
		for(Itens atual : listaItens) {
			valorFinal += atual.getQuantidade() * atual.getProduto().getValorCompra();
			atual.getProduto().setQtdEstoque(atual.getProduto().getQtdEstoque() + atual.getQuantidade());
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

	public void setListaItens(List<Itens> listaItens) {
		this.listaItens = listaItens;
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
