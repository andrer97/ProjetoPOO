package br.com.joaodebarro.jbcontrole.usuarios;

public abstract class Usuario {

	private String login;
	private String senha;
	private String email;
	
	public Usuario(String login, String senha, String email) {
		super();
		this.login = login;
		this.senha = senha;
		this.email = email;
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
}
