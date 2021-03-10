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
public class Carro {
    private String marca;
    private String modelo;
    private String motorizacao;
    private int ano_fabricacao;
    private int ano_modelo;
    private double valor_compra;
    private double valor_venda;
    private String chassis;
    //Abaixo são os opcionais
    private boolean ar;
    private boolean vidro_eletrico;
    private boolean trava_eletrica;
    private boolean alarme;
    private boolean som;
    
    //construtor

    public Carro(String marca, 
                 String modelo, 
                 String motorizacao, 
                 int ano_fabricacao, 
                 int ano_modelo, 
                 double valor_compra, 
                 double valor_venda, 
                 String chassis, 
                 boolean ar, 
                 boolean vidro_eletrico, 
                 boolean trava_eletrica, 
                 boolean alarme, 
                 boolean som) {
        this.marca = marca;
        this.modelo = modelo;
        this.motorizacao = motorizacao;
        this.ano_fabricacao = ano_fabricacao;
        this.ano_modelo = ano_modelo;
        this.valor_compra = valor_compra;
        this.valor_venda = valor_venda;
        this.chassis = chassis;
        this.ar = ar;
        this.vidro_eletrico = vidro_eletrico;
        this.trava_eletrica = trava_eletrica;
        this.alarme = alarme;
        this.som = som;
    }
    

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotorizacao() {
        return motorizacao;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public int getAno_modelo() {
        return ano_modelo;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public String getChassis() {
        return chassis;
    }

    public boolean isAr() {
        return ar;
    }

    public boolean isVidro_eletrico() {
        return vidro_eletrico;
    }

    public boolean isTrava_eletrica() {
        return trava_eletrica;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public boolean isSom() {
        return som;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotorizacao(String motorizacao) {
        this.motorizacao = motorizacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public void setAno_modelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public void setVidro_eletrico(boolean vidro_eletrico) {
        this.vidro_eletrico = vidro_eletrico;
    }

    public void setTrava_eletrica(boolean trava_eletrica) {
        this.trava_eletrica = trava_eletrica;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public void setSom(boolean som) {
        this.som = som;
    }
    
    
}
