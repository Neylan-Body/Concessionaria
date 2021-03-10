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
public class Salario {
    private String nome;
    private String login;
    private double valor;
    private double venda;
    private int carrosCarga, carrosPasseio;
    private int a;

    public Salario(String nome, String login, double valor, double venda, int carrosCarga, int carrosPasseio, int a, int b) {
        this.nome = nome;
        this.login = login;
        this.valor = valor;
        this.venda = venda;
        this.carrosCarga = carrosCarga;
        this.carrosPasseio = carrosPasseio;
        this.a = a;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }

    public int getCarrosCarga() {
        return carrosCarga;
    }

    public void setCarrosCarga(int carrosCarga) {
        this.carrosCarga = carrosCarga;
    }

    public int getCarrosPasseio() {
        return carrosPasseio;
    }

    public void setCarrosPasseio(int carrosPasseio) {
        this.carrosPasseio = carrosPasseio;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    
}
