
public class PessoaJuridica extends Pessoa{

	private int cnpj;

	public PessoaJuridica(String nome, Endereco endereco, ContaBanco contaBanco, int cnpj) {
		super(nome, endereco, contaBanco);
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}
}
