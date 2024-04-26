package br.com.joaodebarro.jbcontrole.pessoas;
import br.com.joaodebarro.jbcontrole.administrativo.ContaBanco;
import br.com.joaodebarro.jbcontrole.expedicao.Endereco;

public class PessoaJuridica extends Pessoa{

	private String cnpj;

	public PessoaJuridica(String nome, Endereco endereco, ContaBanco contaBanco, String cnpj) {
		super(nome, endereco, contaBanco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}
}
