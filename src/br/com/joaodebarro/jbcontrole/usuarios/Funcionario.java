package br.com.joaodebarro.jbcontrole.usuarios;
import br.com.joaodebarro.jbcontrole.administrativo.Cargo;
import br.com.joaodebarro.jbcontrole.pessoas.Pessoa;
import br.com.joaodebarro.jbcontrole.pessoas.PessoaFisica;

public class Funcionario extends Usuario{

	private Cargo cargo;
	private PessoaFisica pessoa;
	
	public Funcionario(String login, String senha, String email, Cargo cargo, PessoaFisica pessoa) {
		super(login, senha, email);
		this.cargo = cargo;
		this.pessoa = pessoa;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
}
