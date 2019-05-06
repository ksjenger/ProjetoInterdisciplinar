package model.entities;

public class Remedios extends Produtos {

	private Integer codigo;
	private Integer quantidade;
	private String tipoRemedio;
	private String prescricao;

	public Remedios() {
		super();
	}

	public Remedios(Integer codigo, Integer quantidade, String tipoRemedio, String prescricao) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.tipoRemedio = tipoRemedio;
		this.prescricao = prescricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getTipoRemedio() {
		return tipoRemedio;
	}

	public void setTipoRemedio(String tipoRemedio) {
		this.tipoRemedio = tipoRemedio;
	}

	public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}

}
