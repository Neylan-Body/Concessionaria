/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.ConcessionariaView;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class PainelAdministrador {

    private ImageIcon imagem;
    private JLabel labelImagem;
    private JPanel painelAdministrador;
    private ConcessionariaView concessionariaView;

    public ConcessionariaView concessionariaView() throws IOException{
        if(concessionariaView == null){
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }
    
    public JPanel PainelAdministrador() {
        if (painelAdministrador == null) {
            painelAdministrador = new JPanel();
            painelAdministrador.setLayout(null);
            painelAdministrador.setBackground(Color.white);
            painelAdministrador.add(LabelImagem());
            
        }
        return painelAdministrador;
    }

    public ImageIcon Imagem() {
        if (imagem == null) {
            imagem = new ImageIcon(getClass().getResource("marcas.png"));
        }
        return imagem;
    }

    public JLabel LabelImagem() {
        if (labelImagem == null) {
            labelImagem = new JLabel();
            labelImagem.setIcon(Imagem());
            labelImagem.setBounds(1, 1, 970, 593);
        }
        return labelImagem;
    }
}
