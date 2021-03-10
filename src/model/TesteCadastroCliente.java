/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class TesteCadastroCliente {

    private PainelCadastroCliente painelCadastroCliente;
    
    public TesteCadastroCliente(PainelCadastroCliente painelCadastroCliente) {
        this.painelCadastroCliente = painelCadastroCliente;
    } 
    
    public boolean TelaCadastroCliente(){
        try{
            if (Integer.parseInt(painelCadastroCliente().TxtNumero().getText()) < 0) {
                JOptionPane.showMessageDialog(painelCadastroCliente().PainelCadastroCliente(), "Digite um numero correto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroCliente().PainelCadastroCliente(), "Digite um numero correto");
            return false;
        }
        for (int i = 0; i < Arrays.Cliente().size(); i++) {
            if(painelCadastroCliente().TxtCpf().getText().equals(Arrays.Cliente().get(i).getCpf())){
                JOptionPane.showMessageDialog(painelCadastroCliente().PainelCadastroCliente(), "CPF já existe");
                return false;
            }
        }
        for (int i = 0; i < Arrays.Cliente().size(); i++) {
            if(painelCadastroCliente().TxtRg().getText().equals(Arrays.Cliente().get(i).getRg())){
                JOptionPane.showMessageDialog(painelCadastroCliente().PainelCadastroCliente(), "RG já existe");
                return false;
            }
        }
        if (painelCadastroCliente().TxtNome().getText().isEmpty() || painelCadastroCliente().TxtBairro().getText().isEmpty() ||
                painelCadastroCliente().TxtCidade().getText().isEmpty() || painelCadastroCliente().TxtCpf().getText().isEmpty() ||
                painelCadastroCliente().TxtEstado().getText().isEmpty() || painelCadastroCliente().TxtRg().getText().isEmpty() ||
                painelCadastroCliente().TxtRua().getText().isEmpty()) {
            JOptionPane.showMessageDialog(painelCadastroCliente().PainelCadastroCliente(), "Existem campos vazios, preencha!");
            return false;
        }
        return true;
    }
    
    public PainelCadastroCliente painelCadastroCliente(){
        if(painelCadastroCliente == null){
           painelCadastroCliente = new PainelCadastroCliente();
        }
        return painelCadastroCliente;
    }
}
