
package model.entities;

public class Remedios extends Produtos {

	private Integer idRemedio;
	private Integer quantidade;
	private String tipoRemedio;
	private Boolean prescricao;

	public Remedios() {
		super();
	}

	public Remedios(Integer codigo, Integer quantidade, String tipoRemedio, Boolean prescricao) {
		super();
		this.idRemedio = codigo;
		this.quantidade = quantidade;
		this.tipoRemedio = tipoRemedio;
		this.prescricao = prescricao;
	}

	public Integer getCodigo() {
		return idRemedio;
	}

	public void setCodigo(Integer codigo) {
		this.idRemedio = codigo;
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

	public Boolean getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(Boolean prescricao) {
		this.prescricao = prescricao;
	}

}
