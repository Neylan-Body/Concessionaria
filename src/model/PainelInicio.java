/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class PainelInicio {

    private ImageIcon imagem;
    private JLabel labelImagem;    
    private JPanel painelInicio;

    public JPanel PainelIncio() {
        if (painelInicio == null) {
            painelInicio = new JPanel();
            painelInicio.setLayout(null);
            painelInicio.setBackground(Color.white);
            painelInicio.add(LabelImagem());
        }
        return painelInicio;
    }
    
    public ImageIcon Imagem(){
        if(imagem == null){
            imagem = new ImageIcon(getClass().getResource("marcas.png"));
        }
        return imagem;
    }
    
    public JLabel LabelImagem() {
        if(labelImagem == null){
            labelImagem = new JLabel();
            labelImagem.setIcon(Imagem());
            labelImagem.setBounds(1,1,970,593);
        }
        return labelImagem;
    }
}