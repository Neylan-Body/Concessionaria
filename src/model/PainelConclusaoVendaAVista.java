/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class PainelConclusaoVendaAVista {
 
    private JPanel painelConclusaoVendaAVista;
    private JLabel lblMensagem, lblValorFinal;
    private JButton btnVender;
    
    public JPanel PainelConclusaoVendaAVista(){
        if(painelConclusaoVendaAVista == null){
            painelConclusaoVendaAVista = new JPanel();
            painelConclusaoVendaAVista.setLayout(null);
            painelConclusaoVendaAVista.setBackground(Color.WHITE);
            painelConclusaoVendaAVista.add(BtnVender());
            painelConclusaoVendaAVista.add(LblMensagem());
            painelConclusaoVendaAVista.add(LblValorFinal());
        }
        return painelConclusaoVendaAVista;
    }
    
    public JLabel LblMensagem(){
        if(lblMensagem == null){
            lblMensagem = new JLabel();
            lblMensagem.setBounds(10, 50, 200, 20);
            lblMensagem.setText("Valor do a vista do Veiculo");
        }
        return lblMensagem;
    }
    
    public JLabel LblValorFinal(){
        if(lblValorFinal == null){
            lblValorFinal = new JLabel();
            lblValorFinal.setBounds(10, 90, 200, 20);
        }
        return lblValorFinal;
    }
    
    public JButton BtnVender(){
        if(btnVender == null){
            btnVender = new JButton();
            btnVender.setBounds(10, 130, 200, 20);
            btnVender.setText("Vender");
        }
        return btnVender;
    }
}
