import java.util.Date;

public class Entrega {

	private Funcionario entregador;
	private Date dataPrevista;
	private Date dataEntrega;
	private Venda venda;
	private int tentativasEntregas;
	
	public Entrega(Funcionario entregador,Date dataPrevista, Venda venda) {
		super();
		this.entregador = entregador;
		this.dataPrevista = dataPrevista;
		this.venda = venda;
		this.tentativasEntregas = 0;
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
}
