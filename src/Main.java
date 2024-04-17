import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		PessoaJuridica pj = new PessoaJuridica("João", new Endereco(909090, 777, "rua", "bairro", "cidade"), new ContaBanco(1, 0), 1234);
		
		pj.getContaBanco().deposito(500.0);
		
		System.out.println(pj.getContaBanco().getSaldo());
		
		
		//Usuario user = new Funcionario("login", "senha", "email", pj, pj);
				
	}
}
