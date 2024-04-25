package br.com.joaodebarro.jbcontrole.administrativo;

public class Cargo {

	private String nomeCargo;
	private double salario;

	public Cargo(String nomeCargo, double salario) {
		super();
		this.nomeCargo = nomeCargo;
		this.salario = salario;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
