/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class PainelRelatorios {

    private JPanel painelRelatorios;
    private JTextArea txaRelatorio;

    public JPanel PainelRelatorios() {
        if (painelRelatorios == null) {
            painelRelatorios = new JPanel();
            painelRelatorios.setLayout(null);
            painelRelatorios.setBackground(Color.white);
            painelRelatorios.add(TxaRelatorio());
        }
        return painelRelatorios;
    }
    
    public JTextArea TxaRelatorio(){
        if(txaRelatorio == null){
            txaRelatorio = new JTextArea();
            txaRelatorio.setBounds(10, 10, 1000, 680);
        }
        return txaRelatorio;
    }

}
