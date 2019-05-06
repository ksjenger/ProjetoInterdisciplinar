package model.entities;

public class Cliente {
	
	private String nome;
	private String telefone;
	private Integer convenio;

	public Cliente() {
		
	}

	public Cliente(String nome, String telefone, Integer convenio) {
		this.nome = nome;
		this.telefone = telefone;
		this.convenio = convenio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getConvenio() {
		return convenio;
	}

	public void setConvenio(Integer convenio) {
		this.convenio = convenio;
	}
	
}
