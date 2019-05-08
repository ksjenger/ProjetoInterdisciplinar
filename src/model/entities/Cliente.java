package model.entities;

public class Cliente {

    private String firstName;
    private String lastName;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String complemento;
    private String CEP;
    private String uf;
    private String telefone;
    private String email;
    
    private Convenios convenio;

    public Convenios getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenios convenio) {
        this.convenio = convenio;
    }

    public Cliente(String firstName, String lastName, String logradouro, Integer numero, String bairro, String complemento, String CEP, String uf, String telefone, String convenio, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.CEP = CEP;
        this.uf = uf;
        this.telefone = telefone;
        this.email = email;
    }

    public Cliente() {
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
