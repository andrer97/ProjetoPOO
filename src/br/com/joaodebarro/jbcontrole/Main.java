package br.com.joaodebarro.jbcontrole;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.joaodebarro.jbcontrole.administrativo.Caixa;
import br.com.joaodebarro.jbcontrole.administrativo.Cargo;
import br.com.joaodebarro.jbcontrole.administrativo.ContaBanco;
import br.com.joaodebarro.jbcontrole.administrativo.Fornecedor;
import br.com.joaodebarro.jbcontrole.expedicao.Endereco;
import br.com.joaodebarro.jbcontrole.expedicao.Entrega;
import br.com.joaodebarro.jbcontrole.expedicao.Veiculo;
import br.com.joaodebarro.jbcontrole.pessoas.Pessoa;
import br.com.joaodebarro.jbcontrole.pessoas.PessoaFisica;
import br.com.joaodebarro.jbcontrole.pessoas.PessoaJuridica;
import br.com.joaodebarro.jbcontrole.servicos.Compra;
import br.com.joaodebarro.jbcontrole.servicos.Itens;
import br.com.joaodebarro.jbcontrole.servicos.Produto;
import br.com.joaodebarro.jbcontrole.servicos.Venda;
import br.com.joaodebarro.jbcontrole.usuarios.Cliente;
import br.com.joaodebarro.jbcontrole.usuarios.Funcionario;

public class Main {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco(89460000, 100, "Rua", "Bairro", "Cidade");
		ContaBanco contabanco1 = new ContaBanco(888888, 500);
		Pessoa pessoa1 = new PessoaFisica("Joao", endereco1, contabanco1, 12345);
		Cliente cliente1 = new Cliente("login", "1234", "cliente@gmail.com", pessoa1);
		
		
		
		Endereco endereco2 = new Endereco(8946000, 33434, "rua do marcelo", "campo", "Canoinhas");
		ContaBanco conta2 = new ContaBanco(44444, 100000);
		Cargo vendedor = new Cargo("Vendedor", 50000);
		//porque nao consigo criar o objeto como Pessoa generica
		Pessoa pessoa2 = new PessoaFisica("marcelo", endereco2, conta2, 3333333);
		Funcionario funcionario1 = new Funcionario("loginfunc", "2345", "marcelao@gmail.com", vendedor, (PessoaFisica)pessoa2);
		
		//produto cimento com informacoes 
		Produto cimento = new Produto("cimento", 50.00, 41.20, 100.00);
		//oisi item cimento com a quantidade comprada/vendido
		Itens itemCimento = new Itens(cimento, 5);
		
		List<Itens> lista1 = new ArrayList<>(); 
		lista1.add(itemCimento);
		
		Venda venda1 = new Venda(123, cliente1, lista1, funcionario1);
		
		
		Veiculo caminhao1 = new Veiculo("ford", "cargo", "mkl-9j88");
		Entrega entrega1 = new Entrega(caminhao1, funcionario1, new Date(), venda1);
		
		
		//porque nao consigo criar o objeto como Pessoa generica
		PessoaJuridica pj1 = new PessoaJuridica("votorantin", endereco2, contabanco1, 383838383);
		Fornecedor votorantin = new Fornecedor(pj1);
		Compra compra1 = new Compra(33123231, votorantin, lista1, funcionario1);
		
		Caixa cx2 = new Caixa(643333, 1000000.0);
		cx2.addFornecedor(votorantin);
		cx2.addFuncionario(funcionario1);
		
		System.out.println(cx2.getSaldo());
		
		cx2.realizarPagamentoFornecedores();
		cx2.realizarPagamentoFuncionarios();
		
		System.out.println(cx2.getSaldo());
		
	}
}
