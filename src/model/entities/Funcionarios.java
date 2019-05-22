package model.entities;

import java.sql.Date;

public class Funcionarios {

    private Integer idFuncionario;
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
    private Date dataContrato;
    private String Cargo;
    private String cidade;
    private String cpf;
    private String Login;
    private String password;

    public Funcionarios() {
    }

    public Funcionarios(Integer idFuncionario, String firstName, String lastName, String logradouro, Integer numero, String bairro, String complemento, String CEP, String uf, String telefone, String email, Date dataContrato, String Cargo, String cidade, String cpf) {
        this.idFuncionario = idFuncionario;
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
        this.dataContrato = dataContrato;
        this.Cargo = Cargo;
        this.cidade = cidade;
        this.cpf = cpf;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
