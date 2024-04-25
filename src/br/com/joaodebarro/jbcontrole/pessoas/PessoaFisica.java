package br.com.joaodebarro.jbcontrole.pessoas;
import br.com.joaodebarro.jbcontrole.administrativo.ContaBanco;
import br.com.joaodebarro.jbcontrole.expedicao.Endereco;

public class PessoaFisica extends Pessoa{

	private int cpf;

	public PessoaFisica(String nome, Endereco endereco, ContaBanco contaBanco, int cpf) {
		super(nome, endereco, contaBanco);
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}
}
