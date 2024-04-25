package br.com.joaodebarro.jbcontrole.administrativo;

public class ContaBanco {

	private int numeroConta;
	private double saldo;

	public ContaBanco(int numeroConta, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor;	
	}
}
