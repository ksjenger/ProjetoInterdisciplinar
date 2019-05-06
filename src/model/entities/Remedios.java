package model.entities;

public class Remedios extends Produtos {

	private Integer codigo;
	private Integer quantidade;
	private Integer tamanhoML;
	private String prescricao;

	public Remedios() {
		super();
	}

	public Remedios(Integer codigo, Integer quantidade, Integer tamanhoML, String prescricao) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.tamanhoML = tamanhoML;
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

	public Integer getTamanhoML() {
		return tamanhoML;
	}

	public void setTamanhoML(Integer tamanhoML) {
		this.tamanhoML = tamanhoML;
	}

	public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}

}
