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
public class Passeio extends Carro {

    
    private int litragem_porta_mala;
    private int num_passageiros;
    
    public Passeio(int litragem_porta_mala, 
                   int num_passageiros, 
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
        this.litragem_porta_mala = litragem_porta_mala;
        this.num_passageiros = num_passageiros;
    }

    public int getLitragem_porta_mala() {
        return litragem_porta_mala;
    }

    public int getNum_passageiros() {
        return num_passageiros;
    }

    public void setLitragem_porta_mala(int litragem_porta_mala) {
        this.litragem_porta_mala = litragem_porta_mala;
    }

    public void setNum_passageiros(int num_passageiros) {
        this.num_passageiros = num_passageiros;
    }
    
    public boolean PersistirPasseio(){
        return true;
    }
    
    
}
