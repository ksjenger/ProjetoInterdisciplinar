package model.entities;

public class Infantil extends Produtos{

	private Integer codigo;
	private Integer quantidade;


	public Infantil(Integer codigo, Integer quantidade, String tipoProduto) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;

	}

	public Infantil() {
		super();
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

}
