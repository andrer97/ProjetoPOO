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

        // Criando 15 endereços
        List<Endereco> enderecos = new ArrayList<>();
        enderecos.add(new Endereco(10000, 10, "Rua A", "Bairro A", "Cidade A"));
        enderecos.add(new Endereco(20000, 20, "Rua B", "Bairro B", "Cidade B"));
        enderecos.add(new Endereco(30000, 30, "Rua C", "Bairro C", "Cidade C"));
        enderecos.add(new Endereco(40000, 40, "Rua D", "Bairro D", "Cidade D"));
        enderecos.add(new Endereco(50000, 50, "Rua E", "Bairro E", "Cidade E"));
        enderecos.add(new Endereco(60000, 60, "Rua F", "Bairro F", "Cidade F"));
        enderecos.add(new Endereco(70000, 70, "Rua G", "Bairro G", "Cidade G"));
        enderecos.add(new Endereco(80000, 80, "Rua H", "Bairro H", "Cidade H"));
        enderecos.add(new Endereco(90000, 90, "Rua I", "Bairro I", "Cidade I"));
        enderecos.add(new Endereco(100000, 100, "Rua J", "Bairro J", "Cidade J"));
        enderecos.add(new Endereco(110000, 110, "Rua K", "Bairro K", "Cidade K"));
        enderecos.add(new Endereco(120000, 120, "Rua L", "Bairro L", "Cidade L"));
        enderecos.add(new Endereco(130000, 130, "Rua M", "Bairro M", "Cidade M"));
        enderecos.add(new Endereco(140000, 140, "Rua N", "Bairro N", "Cidade N"));
        enderecos.add(new Endereco(150000, 150, "Rua O", "Bairro O", "Cidade O"));

        // Criando 15 contas bancárias
        List<ContaBanco> contas = new ArrayList<>();
        contas.add(new ContaBanco(1001, 1000.0));
        contas.add(new ContaBanco(1002, 2000.0));
        contas.add(new ContaBanco(1003, 3000.0));
        contas.add(new ContaBanco(1004, 4000.0));
        contas.add(new ContaBanco(1005, 5000.0));
        contas.add(new ContaBanco(1006, 6000.0));
        contas.add(new ContaBanco(1007, 7000.0));
        contas.add(new ContaBanco(1008, 8000.0));
        contas.add(new ContaBanco(1009, 9000.0));
        contas.add(new ContaBanco(1010, 10000.0));
        contas.add(new ContaBanco(1011, 11000.0));
        contas.add(new ContaBanco(1012, 12000.0));
        contas.add(new ContaBanco(1013, 13000.0));
        contas.add(new ContaBanco(1014, 14000.0));
        contas.add(new ContaBanco(1015, 15000.0));

        // Criando 10 pessoas físicas
        List<PessoaFisica> pessoasFisicas = new ArrayList<>();
        pessoasFisicas.add(new PessoaFisica("João", enderecos.get(0), contas.get(0), 123456789));
        pessoasFisicas.add(new PessoaFisica("Maria", enderecos.get(1), contas.get(1), 987654321));
        pessoasFisicas.add(new PessoaFisica("Pedro", enderecos.get(2), contas.get(2), 456789123));
        pessoasFisicas.add(new PessoaFisica("Ana", enderecos.get(3), contas.get(3), 789456123));
        pessoasFisicas.add(new PessoaFisica("Carlos", enderecos.get(4), contas.get(4), 123789456));
        pessoasFisicas.add(new PessoaFisica("Letícia", enderecos.get(5), contas.get(5), 135792468));
        pessoasFisicas.add(new PessoaFisica("Lucas", enderecos.get(6), contas.get(6), 246813579));
        pessoasFisicas.add(new PessoaFisica("Fernanda", enderecos.get(7), contas.get(7), 864197532));
        pessoasFisicas.add(new PessoaFisica("Felipe", enderecos.get(8), contas.get(8), 951753486));
        pessoasFisicas.add(new PessoaFisica("Isabela", enderecos.get(9), contas.get(9), 963852741));

        // Criando 5 pessoas jurídicas
        List<PessoaJuridica> pessoasJuridicas = new ArrayList<>();
        pessoasJuridicas.add(new PessoaJuridica("Empresa A", enderecos.get(10), contas.get(10), 678901234));
        pessoasJuridicas.add(new PessoaJuridica("Empresa B", enderecos.get(11), contas.get(11), 432101234));
        pessoasJuridicas.add(new PessoaJuridica("Empresa C", enderecos.get(12), contas.get(12), 912301234));
        pessoasJuridicas.add(new PessoaJuridica("Empresa D", enderecos.get(13), contas.get(13), 612301234));
        pessoasJuridicas.add(new PessoaJuridica("Empresa E", enderecos.get(14), contas.get(14), 945601234));

        // Criando 5 funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("login1", "senha1", "email1@gmail.com", new Cargo("Cargo 1", 2000.0), pessoasFisicas.get(5)));
        funcionarios.add(new Funcionario("login2", "senha2", "email2@gmail.com", new Cargo("Cargo 2", 2500.0), pessoasFisicas.get(6)));
        funcionarios.add(new Funcionario("login3", "senha3", "email3@gmail.com", new Cargo("Cargo 3", 3000.0), pessoasFisicas.get(7)));
        funcionarios.add(new Funcionario("login4", "senha4", "email4@gmail.com", new Cargo("Cargo 4", 3500.0), pessoasFisicas.get(8)));
        funcionarios.add(new Funcionario("login5", "senha5", "email5@gmail.com", new Cargo("Cargo 5", 4000.0), pessoasFisicas.get(9)));

        // Criando 5 clientes
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("loginCliente1", "senhaCliente1", "cliente1@gmail.com", pessoasFisicas.get(0)));
        clientes.add(new Cliente("loginCliente2", "senhaCliente2", "cliente2@gmail.com", pessoasFisicas.get(1)));
        clientes.add(new Cliente("loginCliente3", "senhaCliente3", "cliente3@gmail.com", pessoasFisicas.get(2)));
        clientes.add(new Cliente("loginCliente4", "senhaCliente4", "cliente4@gmail.com", pessoasFisicas.get(3)));
        clientes.add(new Cliente("loginCliente5", "senhaCliente5", "cliente5@gmail.com", pessoasFisicas.get(4)));

        // Criando 5 produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto A", 10.0, 15.0, 20.0));
        produtos.add(new Produto("Produto B", 20.0, 25.0, 30.0));
        produtos.add(new Produto("Produto C", 30.0, 35.0, 40.0));
        produtos.add(new Produto("Produto D", 40.0, 45.0, 50.0));
        produtos.add(new Produto("Produto E", 50.0, 55.0, 60.0));

        // Criando 5 itens
        List<Itens> itens = new ArrayList<>();
        itens.add(new Itens(produtos.get(0), 10));
        itens.add(new Itens(produtos.get(1), 20));
        itens.add(new Itens(produtos.get(2), 30));
        itens.add(new Itens(produtos.get(3), 40));
        itens.add(new Itens(produtos.get(4), 50));

        // Criando 5 vendas
        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda(1, clientes.get(0), itens, funcionarios.get(0)));
        vendas.add(new Venda(2, clientes.get(1), itens, funcionarios.get(1)));
        vendas.add(new Venda(3, clientes.get(2), itens, funcionarios.get(2)));
        vendas.add(new Venda(4, clientes.get(3), itens, funcionarios.get(3)));
        vendas.add(new Venda(5, clientes.get(4), itens, funcionarios.get(4)));

        // Criando 5 veículos
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Veiculo("Marca A", "Modelo A", "Placa A"));
        veiculos.add(new Veiculo("Marca B", "Modelo B", "Placa B"));
        veiculos.add(new Veiculo("Marca C", "Modelo C", "Placa C"));
        veiculos.add(new Veiculo("Marca D", "Modelo D", "Placa D"));
        veiculos.add(new Veiculo("Marca E", "Modelo E", "Placa E"));

        // Criando 5 entregas
        List<Entrega> entregas = new ArrayList<>();
        entregas.add(new Entrega(veiculos.get(0), funcionarios.get(0), new Date(), vendas.get(0)));
        entregas.add(new Entrega(veiculos.get(1), funcionarios.get(1), new Date(), vendas.get(1)));
        entregas.add(new Entrega(veiculos.get(2), funcionarios.get(2), new Date(), vendas.get(2)));
        entregas.add(new Entrega(veiculos.get(3), funcionarios.get(3), new Date(), vendas.get(3)));
        entregas.add(new Entrega(veiculos.get(4), funcionarios.get(4), new Date(), vendas.get(4)));

        // Criando 5 fornecedores
        List<Fornecedor> fornecedores = new ArrayList<>();
        fornecedores.add(new Fornecedor(pessoasJuridicas.get(0)));
        fornecedores.add(new Fornecedor(pessoasJuridicas.get(1)));
        fornecedores.add(new Fornecedor(pessoasJuridicas.get(2)));
        fornecedores.add(new Fornecedor(pessoasJuridicas.get(3)));
        fornecedores.add(new Fornecedor(pessoasJuridicas.get(4)));

        // Criando 5 compras
        List<Compra> compras = new ArrayList<>();
        compras.add(new Compra(1, fornecedores.get(0), itens, funcionarios.get(0)));
        compras.add(new Compra(2, fornecedores.get(1), itens, funcionarios.get(1)));
        compras.add(new Compra(3, fornecedores.get(2), itens, funcionarios.get(2)));
        compras.add(new Compra(4, fornecedores.get(3), itens, funcionarios.get(3)));
        compras.add(new Compra(5, fornecedores.get(4), itens, funcionarios.get(4)));

        // Criando 1 caixa
        Caixa caixa = new Caixa(1, 1000000.0);

        // Associando fornecedores e funcionários ao caixa
        for (Fornecedor fornecedor : fornecedores) {
            caixa.addFornecedor(fornecedor);
        }

        for (Funcionario funcionario : funcionarios) {
            caixa.addFuncionario(funcionario);
        }

        // Imprimindo o saldo inicial do caixa
        System.out.println("Saldo inicial do caixa: " + caixa.getSaldo());

        // Realizando pagamentos de fornecedores e funcionários
        caixa.realizarPagamentoFornecedores();
        caixa.realizarPagamentoFuncionarios();

        // Imprimindo o saldo final do caixa
        System.out.println("Saldo final do caixa: " + caixa.getSaldo());
    }
}
