package model.entities;

import java.util.Objects;

public class Produtos {

    private Integer idProduto;
    private String nome;
    private String categoria;
    private Double valor;
    private String codBar;
    private boolean status;
    private String tipo;

    public Produtos() {
    }

    public Produtos(Integer idProduto, String nome, String categoria, Double valor, String codBar, Boolean status) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
        this.codBar = codBar;
        this.status = status;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCodBar() {
        return codBar;
    }

    public void setCodBar(String codBar) {
        this.codBar = codBar;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   
}
