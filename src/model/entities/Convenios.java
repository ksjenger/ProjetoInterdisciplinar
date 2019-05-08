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
    private String carterinha;

    public Convenios(Integer IdConvenio, String nomeConvenio, String carterinha) {
        this.IdConvenio = IdConvenio;
        this.nomeConvenio = nomeConvenio;
        this.carterinha = carterinha;
    }

    public Convenios(String nomeConvenio, Integer IdConvenio) {
        this.nomeConvenio = nomeConvenio;
        this.IdConvenio = IdConvenio;
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
        return carterinha;
    }

    public void setCarterinha(String Carterinha) {
        this.carterinha = Carterinha;
    }

    public Integer getIdConvenio() {
        return IdConvenio;
    }

    public void setIdConvenio(Integer IdConvenio) {
        this.IdConvenio = IdConvenio;
    }
    
    
    
}
