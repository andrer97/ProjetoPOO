
public abstract class Pessoa {

	private String nome;
	private Endereco endereco;
	private ContaBanco contaBanco;

	public Pessoa(String nome, Endereco endereco, ContaBanco contaBanco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.contaBanco = contaBanco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ContaBanco getContaBanco() {
		return contaBanco;
	}

	public void setContaBanco(ContaBanco contaBanco) {
		this.contaBanco = contaBanco;
	}


}
