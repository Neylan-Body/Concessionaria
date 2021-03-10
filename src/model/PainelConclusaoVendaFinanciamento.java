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
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class PainelConclusaoVendaFinanciamento {

    private JPanel painelConclusaoVendaFinanciamento;
    private JSpinner spParcelas;
    private JLabel lblValorVeiculo1, lblValorParcelas1;
    private JButton btnSimular, btnVender;

    public JPanel painelConclusaoVendaFinanciamento() {
        if (painelConclusaoVendaFinanciamento == null) {
            painelConclusaoVendaFinanciamento = new JPanel();
            painelConclusaoVendaFinanciamento.setLayout(null);
            painelConclusaoVendaFinanciamento.setBackground(Color.white);
            painelConclusaoVendaFinanciamento.add(SpParcelas());
            painelConclusaoVendaFinanciamento.add(LblParcelas());
            painelConclusaoVendaFinanciamento.add(LblValorParcelas());
            painelConclusaoVendaFinanciamento.add(LblValorParcelas1());
            painelConclusaoVendaFinanciamento.add(LblValorVeiculo());
            painelConclusaoVendaFinanciamento.add(LblValorVeiculo1());
            painelConclusaoVendaFinanciamento.add(BtnSimular());
            painelConclusaoVendaFinanciamento.add(BtnVender());
        }
        return painelConclusaoVendaFinanciamento;
    }

    public JLabel LblParcelas() {
        JLabel lblparcelas = new JLabel();
        lblparcelas.setBounds(10, 50, 200, 20);
        lblparcelas.setText("Quantidade de parcelas");
        return lblparcelas;
    }

    public JSpinner SpParcelas() {
        if (spParcelas == null) {
            SpinnerModel sm = new SpinnerNumberModel(1, 1, 72, 1);
            spParcelas = new JSpinner(sm);
            spParcelas.setBounds(10, 90, 200, 20);
        }
        return spParcelas;
    }

    public JLabel LblValorParcelas() {
        JLabel lblValorParcelas = new JLabel();
        lblValorParcelas.setBounds(10, 130, 200, 20);
        lblValorParcelas.setText("Valor das parcelas");
        return lblValorParcelas;
    }

    public JLabel LblValorParcelas1() {
        if (lblValorParcelas1 == null) {
            lblValorParcelas1 = new JLabel();
            lblValorParcelas1.setBounds(10, 170, 200, 20);
        }
        return lblValorParcelas1;
    }
    
    public JLabel LblValorVeiculo() {
        JLabel lblvalorVeiculo = new JLabel();
        lblvalorVeiculo.setBounds(10, 210, 200, 20);
        lblvalorVeiculo.setText("Valor do veiculo");
        return lblvalorVeiculo;
    }
    
    public JLabel LblValorVeiculo1() {
        if (lblValorVeiculo1 == null) {
            lblValorVeiculo1 = new JLabel();
            lblValorVeiculo1.setBounds(10, 250, 200, 20);
        }
        return lblValorVeiculo1;
    }
    
    public JButton BtnSimular() {
        if (btnSimular == null) {
            btnSimular = new JButton();
            btnSimular.setBounds(10, 290, 200, 20);
            btnSimular.setText("Simular");
        }
        return btnSimular;
    }
    
    public JButton BtnVender(){
        if(btnVender == null){
            btnVender = new JButton();
            btnVender.setBounds(10, 330, 200, 20);
            btnVender.setText("Vender");
            btnVender.setVisible(false);
        }
        return btnVender;
    }
}
