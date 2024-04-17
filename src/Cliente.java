
public class Cliente extends Usuario{

	private int pontos;
	Pessoa tipoPessoa;
	
	public Cliente(String login, String senha, String email, Pessoa pessoa) {
		super(login, senha, email, pessoa);
		pontos = 0;
		if (this.tipoPessoa.getClass().toString() == "class PessoaJuridica") {
			tipoPessoa = new PessoaJuridica(pessoa.getNome(), pessoa.getEndereco(), pessoa.getContaBanco(), ((PessoaJuridica) pessoa).getCnpj());
		}
		else {
			tipoPessoa = new PessoaFisica(pessoa.getNome(), pessoa.getEndereco(), pessoa.getContaBanco(), ((PessoaFisica)pessoa).getCpf());
		}
		// Aqui ele cria objetos para cada tipo de pessoa, mas precisa criar estes objetos ou eles já estão criados? Pessoa já está em Usuario.
	}

	public int getPontos() {
		return pontos;
	}
	
	public void addPonto() {
		pontos += 1;
	}
	
	// Alguma outra funcionalidade para justificar a diferença entre pessoa juridica e pessoa fisica, pois do jeito que está não precisa diferenciar.
}
