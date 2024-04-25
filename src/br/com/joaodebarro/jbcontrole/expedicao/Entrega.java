package br.com.joaodebarro.jbcontrole.expedicao;
import java.util.Date;

import br.com.joaodebarro.jbcontrole.servicos.Venda;
import br.com.joaodebarro.jbcontrole.usuarios.Funcionario;

public class Entrega {

	private Veiculo veiculo;
	private Funcionario entregador;
	private Date dataPrevista;
	private Date dataEntrega;
	private Venda venda;
	private int tentativasEntregas;
	
	public Entrega(Veiculo veiculo, Funcionario entregador,Date dataPrevista, Venda venda) {
		super();
		this.veiculo = veiculo;
		this.entregador = entregador;
		this.dataPrevista = dataPrevista;
		this.venda = venda;
		this.tentativasEntregas = 0;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Funcionario getEntregador() {
		return entregador;
	}

	public void setEntregador(Funcionario entregador) {
		this.entregador = entregador;
	}

	public Date getDataPrevista() {
		return dataPrevista;
	}

	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public Venda getVenda() {
		return venda;
	}

	public int getTentativasEntregas() {
		return tentativasEntregas;
	}

	public void concluirEntrega() {
		this.dataEntrega = new Date();
		this.tentativasEntregas++;
	}
	
	public void tentativaFracassada() {
		this.tentativasEntregas++;
	}
	
	public Endereco getEndereco() {
		return venda.getCliente().getPessoa().getEndereco();
	}
}
