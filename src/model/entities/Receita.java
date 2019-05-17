package model.entities;

import java.util.Date;

public class Receita {
    private Integer idReceita;
    private String nrControle;
    private Date date;
    private Integer qtd;

    public Receita() {
    }

    public Receita(Integer idReceita, String nrControle, Date date, Integer qtd) {
        this.idReceita = idReceita;
        this.nrControle = nrControle;
        this.date = date;
        this.qtd = qtd;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    

    public Integer getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(Integer idReceita) {
        this.idReceita = idReceita;
    }

    public String getNrControle() {
        return nrControle;
    }

    public void setNrControle(String nrControle) {
        this.nrControle = nrControle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
