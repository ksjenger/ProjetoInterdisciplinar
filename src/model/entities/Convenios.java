/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

public class Convenios {

    private Integer IdConvenio;
    private String nomeConvenio;

    public Convenios(String nomeConvenio) {
        this.IdConvenio = IdConvenio;
        this.nomeConvenio = nomeConvenio;
    }

    public Convenios() {
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public Integer getIdConvenio() {
        return IdConvenio;
    }

    public void setIdConvenio(Integer IdConvenio) {
        this.IdConvenio = IdConvenio;
    }
}
