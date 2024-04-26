package br.com.joaodebarro.jbcontrole.pessoas;
import br.com.joaodebarro.jbcontrole.administrativo.ContaBanco;
import br.com.joaodebarro.jbcontrole.expedicao.Endereco;

public class PessoaFisica extends Pessoa{

	private String cpf;

	public PessoaFisica(String nome, Endereco endereco, ContaBanco contaBanco, String cpf) {
		super(nome, endereco, contaBanco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
}
