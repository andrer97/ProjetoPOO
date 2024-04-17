import java.util.List;

public class Fornecedor {

	private PessoaJuridica empresa;
	private List<Compra> todasCompras;

	public Fornecedor(PessoaJuridica empresa) {
		super();
		this.empresa = empresa;
		this.todasCompras = null;
	}

	public PessoaJuridica getEmpresa() {
		return empresa;
	}

	public List<Compra> getTodasCompras() {
		return todasCompras;
	}
	
	public void novaCompra(Compra compra) {
		todasCompras.add(compra);
	}
}
