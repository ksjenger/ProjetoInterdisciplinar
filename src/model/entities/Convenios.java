/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

/**
 *
 * @author kauan
 */
public class Convenios {
    
    private Integer IdConvenio;
    private String nomeConvenio;
    private String Carterinha;

    public Convenios(Integer IdConvenio, String nomeConvenio, String Carterinha) {
        this.IdConvenio = IdConvenio;
        this.nomeConvenio = nomeConvenio;
        this.Carterinha = Carterinha;
    }

    public Convenios(String nomeConvenio, String Carterinha) {
        this.nomeConvenio = nomeConvenio;
        this.Carterinha = Carterinha;
    }

    public Convenios() {
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public String getCarterinha() {
        return Carterinha;
    }

    public void setCarterinha(String Carterinha) {
        this.Carterinha = Carterinha;
    }

    public Integer getIdConvenio() {
        return IdConvenio;
    }

    public void setIdConvenio(Integer IdConvenio) {
        this.IdConvenio = IdConvenio;
    }
    
    
    
}
