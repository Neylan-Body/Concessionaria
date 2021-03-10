/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class Vendedor {
    String nome;
    String rua;
    String bairro;
    int numeroEndereco;
    String cidade;
    String estado;
    String agencia, conta;
    double salario;
    String data_admissao;
    double meta;
    double comissao;
    String login;
    String senha;

    public Vendedor(String nome, String rua, String bairro, int numeroEndereco, String cidade, 
            String estado, String agencia, String conta, double salario, String data_admissao, 
            double meta, double comissao, String login, String senha) {
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.numeroEndereco = numeroEndereco;
        this.cidade = cidade;
        this.estado = estado;
        this.agencia = agencia;
        this.conta = conta;
        this.salario = salario;
        this.data_admissao = data_admissao;
        this.meta = meta;
        this.comissao = comissao;
        this.login = login;
        this.senha = senha;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public double getSalario() {
        return salario;
    }

    public String getData_admissao() {
        return data_admissao;
    }

    public double getMeta() {
        return meta;
    }

    public double getComissao() {
        return comissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }    
}
