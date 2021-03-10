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
public class TesteCadastroVendedor {
    
    private PainelCadastroVendedor painelCadastroVendedor;
    
    public TesteCadastroVendedor(PainelCadastroVendedor painelCadastroVendedor){
        this.painelCadastroVendedor = painelCadastroVendedor;        
    }
    
    public boolean TelaCadastroVendedor(){
        
        try{
            if (Integer.parseInt(painelCadastroVendedor().TxtNumeroEndereco().getText()) < 0) {
                JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Digite um numero correto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Digite um numero correto");
            return false;
        }
        
        try{
            if (Integer.parseInt(painelCadastroVendedor().TxtSalario().getText()) < 0) {
                JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Digite um salario correto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Digite um salario correto");
            return false;
        }
        
        try{
            if (Integer.parseInt(painelCadastroVendedor().TxtMeta().getText()) < 0) {
                JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Digite uma meta correta");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Digite uma meta correta");
            return false;
        }
        
        try{
            if (Integer.parseInt(painelCadastroVendedor().TxtComissao().getText()) < 0) {
                JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Digite uma comissao correta");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Digite uma comissao correta");
            return false;
        }
        for (int i = 0; i < Arrays.Vendedor().size(); i++) {
            if(painelCadastroVendedor().TxtConta().getText().equals(Arrays.Vendedor().get(i).getConta())){
                JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Este numero de conta ja existe");
                return false;
            }
        }
        for (int i = 0; i < Arrays.Vendedor().size(); i++) {
            if(painelCadastroVendedor().TxtLogin().getText().equals(Arrays.Vendedor().get(i).getLogin())){
                JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Este login ja existe");
                return false;
            }
        }
        if (painelCadastroVendedor().TxtNome().getText().isEmpty() || painelCadastroVendedor().TxtBairro().getText().isEmpty() ||
                painelCadastroVendedor().TxtEstado().getText().isEmpty() || painelCadastroVendedor().TxtRua().getText().isEmpty() ||
                painelCadastroVendedor().TxtCidade().getText().isEmpty() || painelCadastroVendedor().TxtAgencia().getText().isEmpty() || 
                painelCadastroVendedor().TxtConta().getText().isEmpty() || painelCadastroVendedor().TxtData_admissao().getText().isEmpty() || 
                painelCadastroVendedor().TxtLogin().getText().isEmpty() || painelCadastroVendedor().TxtSenha().getText().isEmpty()) {
            JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Existem campos vazios, preencha!");
            return false;
        }
        return true;
    }
    
    public PainelCadastroVendedor painelCadastroVendedor(){
        if(painelCadastroVendedor == null){
            painelCadastroVendedor = new PainelCadastroVendedor();
        }
        return painelCadastroVendedor;
    }
    
}
