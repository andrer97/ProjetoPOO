package br.com.joaodebarro.jbcontrole.administrativo;
import java.util.ArrayList;
import java.util.List;

import br.com.joaodebarro.jbcontrole.usuarios.Funcionario;

public class Caixa extends ContaBanco{
	
	private List<Fornecedor> fornecedores;
	private List<Funcionario> funcionarios;
	
	public Caixa(int numeroConta, double saldo) {
		super(numeroConta, saldo);
		this.fornecedores = new ArrayList<Fornecedor>();
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void addFornecedor(Fornecedor fornecedor) {
		fornecedores.add(fornecedor);
	}
	
	public void removeFornecedor(Fornecedor fornecedor) {
		fornecedores.remove(fornecedor);
	}
	
	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void removeFuncionario(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}
	
	public void realizarPagamentoFornecedores() {
		for (Fornecedor fornecedorAtual : fornecedores) {
			double valorEmAberto = fornecedorAtual.valorEmAberto();
			this.saque(valorEmAberto);
			fornecedorAtual.getEmpresa().getContaBanco().deposito(valorEmAberto);
		}
	}
	
	public void realizarPagamentoFuncionarios() {
		for (Funcionario funcAtual : funcionarios) {
			double salarioFuncAtual = funcAtual.getCargo().getSalario();
			this.saque(salarioFuncAtual);
			funcAtual.getPessoa().getContaBanco().deposito(salarioFuncAtual);
		}
	}
}
