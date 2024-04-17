
public class Funcionario extends Usuario{

	private PessoaFisica tipoPessoa;// Pessoa já está em Usuario

	public Funcionario(String login, String senha, String email, Pessoa pessoa, PessoaFisica tipoPessoa) {
		super(login, senha, email, pessoa);
		this.tipoPessoa = tipoPessoa;
		
	}
	
	// Funcionalidades para diferenciar o usuário funcionário do usuário cliente.
	// Poderia ter uma lista de funções ou uma classe de Funcao e o objeto Funcionario ter a função. 
}
