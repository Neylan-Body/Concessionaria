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
public class Carga extends Carro{
    private String tamanho_carroceria;
    private String peso_maximo_carga;
    private String peso_total;
    private String altura_carga_maxima;

    public Carga(String tamanho_carroceria, 
                 String peso_maximo_carga, 
                 String peso_total, 
                 String altura_carga_maxima, 
                 String marca, 
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
        super(marca, 
              modelo, 
              motorizacao, 
              ano_fabricacao, 
              ano_modelo, 
              valor_compra, 
              valor_venda, 
              chassis, 
              ar, 
              vidro_eletrico, 
              trava_eletrica, 
              alarme, 
              som);
        this.tamanho_carroceria = tamanho_carroceria;
        this.peso_maximo_carga = peso_maximo_carga;
        this.peso_total = peso_total;
        this.altura_carga_maxima = altura_carga_maxima;
    }

    public String getTamanho_carroceria() {
        return tamanho_carroceria;
    }

    public String getPeso_maximo_carga() {
        return peso_maximo_carga;
    }

    public String getPeso_total() {
        return peso_total;
    }

    public String getAltura_carga_maxima() {
        return altura_carga_maxima;
    }

    public void setTamanho_carroceria(String tamanho_carroceria) {
        this.tamanho_carroceria = tamanho_carroceria;
    }

    public void setPeso_maximo_carga(String peso_maximo_carga) {
        this.peso_maximo_carga = peso_maximo_carga;
    }

    public void setPeso_total(String peso_total) {
        this.peso_total = peso_total;
    }

    public void setAltura_carga_maxima(String altura_carga_maxima) {
        this.altura_carga_maxima = altura_carga_maxima;
    }
    
    public boolean PersistirCarga(){
        return true;
    }
    
}
