package br.com.joaodebarro.jbcontrole.usuarios;
import br.com.joaodebarro.jbcontrole.pessoas.Pessoa;

public class Cliente extends Usuario{

	private int pontos;
	Pessoa pessoa;
	
		public Cliente(String login, String senha, String email, Pessoa pessoa) {
		super(login, senha, email);
		this.pontos = 0;
		this.pessoa = pessoa;
	}
		
	public Pessoa getPessoa() {
			return pessoa;
	}

	public int getPontos() {
		return pontos;
	}
	
	public void addPonto() {
		pontos += 1;
	}
}
