
public abstract class Usuario {

	private String login;
	private String senha;
	private String email;
	private Pessoa pessoa;
	
	public Usuario(String login, String senha, String email, Pessoa pessoa) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.pessoa = pessoa;
	}

	public String getLogin() {
		return login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
}
