/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 ** @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class PainelVendaCarga {

    private JPanel painelVendaCarga;
    private JComboBox listaCarroCarga;
    private JLabel lblAnoFabricacao, lblAnoModelo, lblMarca, lblModelo, lblNumeroChassis, lblPotencia;
    private JLabel lblTamanhoCarroceria, lblPesoMaximoCarga, lblPesoTotal, lblAlturaCargaMaxima;
    private JRadioButton jrbArSim, jrbArNao, jrbVidroEletricoSim, jrbVidroEletricoNao, jrbTravaEletricaSim, jrbTravaEletricaNao, jrbAlarmeSim, jrbAlarmeNao, jrbSomSim, jrbSomNao, jrbFormasPagamentoAVista, jrbFormasPagamentoFinanciamento;
    private JFormattedTextField txtCpfCliente;
    private JButton btnCpfCliente;    
    private FormataMascaras formataMascaras;

    public JComboBox ListaCarroCarga() {
        if (listaCarroCarga == null) {
            listaCarroCarga = new JComboBox();
            listaCarroCarga.setBounds(10, 10, 200, 30);
        }
        return listaCarroCarga;
    }

    public JPanel PainelVendaCarga() {
        if (painelVendaCarga == null) {
            painelVendaCarga = new JPanel();
            painelVendaCarga.setLayout(null);
            painelVendaCarga.setBackground(Color.white);
            painelVendaCarga.add(ListaCarroCarga());
            painelVendaCarga.add(LblAlturaCargaMaxima());
            painelVendaCarga.add(LblAlturaCargaMaxima1());
            painelVendaCarga.add(LblAnoFabricacao());
            painelVendaCarga.add(LblAnoFabricacao1());
            painelVendaCarga.add(LblAnoModelo());
            painelVendaCarga.add(LblAnoModelo1());
            painelVendaCarga.add(LblMarca());
            painelVendaCarga.add(LblMarca1());
            painelVendaCarga.add(LblModelo());
            painelVendaCarga.add(LblModelo1());
            painelVendaCarga.add(LblNumeroChassis());
            painelVendaCarga.add(LblNumeroChassis1());
            painelVendaCarga.add(LblPesoMaximoCarga());
            painelVendaCarga.add(LblPesoMaximoCarga1());
            painelVendaCarga.add(LblPesoTotal());
            painelVendaCarga.add(LblPesoTotal1());
            painelVendaCarga.add(LblPotencia());
            painelVendaCarga.add(LblPotencia1());
            painelVendaCarga.add(LblTamanhoCarroceria());
            painelVendaCarga.add(LblTamanhoCarroceria1());
            painelVendaCarga.add(LblOpcionais());
            painelVendaCarga.add(LblAr());
            painelVendaCarga.add(JrbArSim());
            painelVendaCarga.add(JrbArNao());
            painelVendaCarga.add(LblVidroEletrico());
            painelVendaCarga.add(JrbVidroEletricoSim());
            painelVendaCarga.add(JrbVidroEletricoNao());
            painelVendaCarga.add(LblAlarme());
            painelVendaCarga.add(JrbAlarmeNao());
            painelVendaCarga.add(JrbAlarmeSim());
            painelVendaCarga.add(LblTravaEletrica());
            painelVendaCarga.add(JrbTravaEletricaNao());
            painelVendaCarga.add(JrbTravaEletricaSim());
            painelVendaCarga.add(LblSom());
            painelVendaCarga.add(JrbSomNao());
            painelVendaCarga.add(JrbSomSim());
            painelVendaCarga.add(LblCpfCliente());
            painelVendaCarga.add(TxtCpfCliente());
            painelVendaCarga.add(BtnCpfCliente());
            painelVendaCarga.add(LblFormasPagamento());
            painelVendaCarga.add(JrbFormasPagamentoAVista());
            painelVendaCarga.add(JrbFormasPagamentoFinanciamento());
        }
        return painelVendaCarga;
    }

    public JLabel LblMarca() {
        if (lblMarca == null) {
            lblMarca = new JLabel();
            lblMarca.setBounds(290, 50, 260, 20);
        }
        return lblMarca;
    }

    public JLabel LblModelo() {
        if (lblModelo == null) {
            lblModelo = new JLabel();
            lblModelo.setBounds(290, 90, 260, 20);
        }
        return lblModelo;
    }

    public JLabel LblPotencia() {
        if (lblPotencia == null) {
            lblPotencia = new JLabel();
            lblPotencia.setBounds(290, 130, 260, 20);
        }
        return lblPotencia;
    }

    public JLabel LblAnoFabricacao() {
        if (lblAnoFabricacao == null) {
            lblAnoFabricacao = new JLabel();
            lblAnoFabricacao.setBounds(290, 170, 260, 20);
        }
        return lblAnoFabricacao;
    }

    public JLabel LblAnoModelo() {
        if (lblAnoModelo == null) {
            lblAnoModelo = new JLabel();
            lblAnoModelo.setBounds(290, 210, 260, 20);
        }
        return lblAnoModelo;
    }

    public JLabel LblNumeroChassis() {
        if (lblNumeroChassis == null) {
            lblNumeroChassis = new JLabel();
            lblNumeroChassis.setBounds(290, 250, 260, 20);
        }
        return lblNumeroChassis;
    }

    public JLabel LblTamanhoCarroceria() {
        if (lblTamanhoCarroceria == null) {
            lblTamanhoCarroceria = new JLabel();
            lblTamanhoCarroceria.setBounds(290, 290, 260, 20);
        }
        return lblTamanhoCarroceria;
    }

    public JLabel LblPesoMaximoCarga() {
        if (lblPesoMaximoCarga == null) {
            lblPesoMaximoCarga = new JLabel();
            lblPesoMaximoCarga.setBounds(290, 330, 260, 20);
        }
        return lblPesoMaximoCarga;
    }

    public JLabel LblPesoTotal() {
        if (lblPesoTotal == null) {
            lblPesoTotal = new JLabel();
            lblPesoTotal.setBounds(290, 370, 260, 20);
        }
        return lblPesoTotal;
    }

    public JLabel LblAlturaCargaMaxima() {
        if (lblAlturaCargaMaxima == null) {
            lblAlturaCargaMaxima = new JLabel();
            lblAlturaCargaMaxima.setBounds(290, 410, 260, 20);
        }
        return lblAlturaCargaMaxima;
    }

    public JLabel LblMarca1() {
        JLabel lblMarca1 = new JLabel();
        lblMarca1.setBounds(10, 50, 260, 20);
        lblMarca1.setText("Marca");
        return lblMarca1;
    }

    public JLabel LblModelo1() {
        JLabel lblModelo1 = new JLabel();
        lblModelo1.setBounds(10, 90, 260, 20);
        lblModelo1.setText("Modelo");
        return lblModelo1;
    }

    public JLabel LblPotencia1() {
        JLabel lblPotencia1 = new JLabel();
        lblPotencia1.setBounds(10, 130, 260, 20);
        lblPotencia1.setText("Potencia");
        return lblPotencia1;
    }

    public JLabel LblAnoFabricacao1() {
        JLabel lblAnoFabricacao1 = new JLabel();
        lblAnoFabricacao1.setBounds(10, 170, 260, 20);
        lblAnoFabricacao1.setText("Ano de Fabricação");
        return lblAnoFabricacao1;
    }

    public JLabel LblAnoModelo1() {
        JLabel lblAnoModelo1 = new JLabel();
        lblAnoModelo1.setBounds(10, 210, 260, 20);
        lblAnoModelo1.setText("Ano de Modelo");
        return lblAnoModelo1;
    }

    public JLabel LblNumeroChassis1() {
        JLabel lblNumeroChassis1 = new JLabel();
        lblNumeroChassis1.setBounds(10, 250, 260, 20);
        lblNumeroChassis1.setText("Numero chassis");
        return lblNumeroChassis1;
    }

    public JLabel LblTamanhoCarroceria1() {
        JLabel lblTamanhoCarroceria1 = new JLabel();
        lblTamanhoCarroceria1.setBounds(10, 290, 260, 20);
        lblTamanhoCarroceria1.setText("Tamanho da carroceria");
        return lblTamanhoCarroceria1;
    }

    public JLabel LblPesoMaximoCarga1() {
        JLabel lblPesoMaximoCarga1 = new JLabel();
        lblPesoMaximoCarga1.setBounds(10, 330, 260, 20);
        lblPesoMaximoCarga1.setText("Peso maximo da carga");
        return lblPesoMaximoCarga1;
    }

    public JLabel LblPesoTotal1() {
        JLabel lblPesoTotal1 = new JLabel();
        lblPesoTotal1.setBounds(10, 370, 260, 20);
        lblPesoTotal1.setText("Peso Total");
        return lblPesoTotal1;
    }

    public JLabel LblAlturaCargaMaxima1() {
        JLabel lblAlturaCargaMaxima1 = new JLabel();
        lblAlturaCargaMaxima1.setBounds(10, 410, 260, 20);
        lblAlturaCargaMaxima1.setText("Altura maxima da carga");
        return lblAlturaCargaMaxima1;
    }

    public JLabel LblOpcionais() {
        JLabel lblOpcionais = new JLabel();
        lblOpcionais.setBounds(600, 10, 150, 20);
        lblOpcionais.setText("Opcionais");
        return lblOpcionais;
    }

    public JLabel LblAr() {
        JLabel lblAr = new JLabel();
        lblAr.setBounds(570, 30, 150, 20);
        lblAr.setText("Ar");
        return lblAr;
    }

    public JRadioButton JrbArSim() {
        if (jrbArSim == null) {
            jrbArSim = new JRadioButton("SIM");
            jrbArSim.setBounds(570, 50, 50, 20);
        }
        return jrbArSim;
    }

    public JRadioButton JrbArNao() {
        if (jrbArNao == null) {
            jrbArNao = new JRadioButton("NAO");
            jrbArNao.setSelected(false);
            jrbArNao.setBounds(630, 50, 50, 20);
        }
        return jrbArNao;
    }

    public JLabel LblVidroEletrico() {
        JLabel lblVidroEletrico = new JLabel();
        lblVidroEletrico.setBounds(570, 70, 150, 20);
        lblVidroEletrico.setText("Vidro eletrico");
        return lblVidroEletrico;
    }

    public JRadioButton JrbVidroEletricoSim() {
        if (jrbVidroEletricoSim == null) {
            jrbVidroEletricoSim = new JRadioButton("SIM");
            jrbVidroEletricoSim.setBounds(570, 90, 50, 20);
        }
        return jrbVidroEletricoSim;
    }

    public JRadioButton JrbVidroEletricoNao() {
        if (jrbVidroEletricoNao == null) {
            jrbVidroEletricoNao = new JRadioButton("NAO");
            jrbVidroEletricoNao.setSelected(false);
            jrbVidroEletricoNao.setBounds(630, 90, 50, 20);
        }
        return jrbVidroEletricoNao;
    }

    public JLabel LblTravaEletrica() {
        JLabel lblTravaEletrica = new JLabel();
        lblTravaEletrica.setBounds(570, 110, 150, 20);
        lblTravaEletrica.setText("Trava eletrica");
        return lblTravaEletrica;
    }

    public JRadioButton JrbTravaEletricaSim() {
        if (jrbTravaEletricaSim == null) {
            jrbTravaEletricaSim = new JRadioButton("SIM");
            jrbTravaEletricaSim.setBounds(570, 130, 50, 20);
        }
        return jrbTravaEletricaSim;
    }

    public JRadioButton JrbTravaEletricaNao() {
        if (jrbTravaEletricaNao == null) {
            jrbTravaEletricaNao = new JRadioButton("NAO");
            jrbTravaEletricaNao.setSelected(false);
            jrbTravaEletricaNao.setBounds(630, 130, 50, 20);
        }
        return jrbTravaEletricaNao;
    }

    public JLabel LblAlarme() {
        JLabel lblAlarme = new JLabel();
        lblAlarme.setBounds(570, 150, 150, 20);
        lblAlarme.setText("Alarme");
        return lblAlarme;
    }

    public JRadioButton JrbAlarmeSim() {
        if (jrbAlarmeSim == null) {
            jrbAlarmeSim = new JRadioButton("SIM");
            jrbAlarmeSim.setBounds(570, 170, 50, 20);
        }
        return jrbAlarmeSim;
    }

    public JRadioButton JrbAlarmeNao() {
        if (jrbAlarmeNao == null) {
            jrbAlarmeNao = new JRadioButton("NAO");
            jrbAlarmeNao.setSelected(false);
            jrbAlarmeNao.setBounds(630, 170, 50, 20);
        }
        return jrbAlarmeNao;
    }

    public JLabel LblSom() {
        JLabel lblSom = new JLabel();
        lblSom.setBounds(570, 190, 150, 20);
        lblSom.setText("Som");
        return lblSom;
    }

    public JRadioButton JrbSomSim() {
        if (jrbSomSim == null) {
            jrbSomSim = new JRadioButton("SIM");
            jrbSomSim.setBounds(570, 210, 50, 20);
        }
        return jrbSomSim;
    }

    public JRadioButton JrbSomNao() {
        if (jrbSomNao == null) {
            jrbSomNao = new JRadioButton("NAO");
            jrbSomNao.setSelected(false);
            jrbSomNao.setBounds(630, 210, 50, 20);
        }
        return jrbSomNao;
    }
    
    public JLabel LblCpfCliente(){
        JLabel lblCpfCliente = new JLabel();
        lblCpfCliente.setBounds(570, 250, 100, 20);
        lblCpfCliente.setText("CPF Cliente");
        return lblCpfCliente;
    }
    
    public JTextField TxtCpfCliente(){
        if(txtCpfCliente == null){
            txtCpfCliente = new JFormattedTextField();
            txtCpfCliente.setFormatterFactory(formataMascaras().getCPF());
            txtCpfCliente.setBounds(570, 290, 200, 20);
        }
        return txtCpfCliente;
    }
    
    public JButton BtnCpfCliente(){
        if(btnCpfCliente == null){
           btnCpfCliente = new JButton();
           btnCpfCliente.setBounds(790, 290, 100, 20);
           btnCpfCliente.setText("Confirmar");
        }
        return btnCpfCliente;
    }
    
    public JLabel LblFormasPagamento() {
        JLabel lblFormasPagamento = new JLabel();
        lblFormasPagamento.setBounds(570, 330, 250, 20);
        lblFormasPagamento.setText("Formas de pagamento");
        return lblFormasPagamento;
    }

    public JRadioButton JrbFormasPagamentoFinanciamento() {
        if (jrbFormasPagamentoFinanciamento == null) {
            jrbFormasPagamentoFinanciamento = new JRadioButton("Financiamento");
            jrbFormasPagamentoFinanciamento.setBounds(570, 350, 160, 20);
        }
        return jrbFormasPagamentoFinanciamento;
    }

    public JRadioButton JrbFormasPagamentoAVista() {
        if (jrbFormasPagamentoAVista == null) {
            jrbFormasPagamentoAVista = new JRadioButton("A vista");
            jrbFormasPagamentoAVista.setSelected(false);
            jrbFormasPagamentoAVista.setBounds(740, 350, 160, 20);
        }
        return jrbFormasPagamentoAVista;
    }
    
    public FormataMascaras formataMascaras() {
        if (formataMascaras == null) {
            formataMascaras = new FormataMascaras();
        }
        return formataMascaras;
    }
}

