/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class PainelVendaPasseio {

    private JPanel painelVendaPasseio;
    private JComboBox listaCarroPasseio;
    private JLabel lblAnoFabricacao, lblAnoModelo, lblLitragemPortaMalas, lblMarca, lblModelo, lblNumeroChassis, lblNumeroPassageiros, lblPotencia;
    private JRadioButton jrbArSim, jrbArNao, jrbVidroEletricoSim, jrbVidroEletricoNao, jrbTravaEletricaSim, jrbTravaEletricaNao, jrbAlarmeSim, jrbAlarmeNao, jrbSomSim, jrbSomNao, jrbFormasPagamentoAVista, jrbFormasPagamentoFinanciamento;
    private JFormattedTextField txtCpfCliente;
    private JButton btnCpfCliente;  
    private FormataMascaras formataMascaras;

    public JComboBox ListaCarroPasseio() {
        if (listaCarroPasseio == null) {
            listaCarroPasseio = new JComboBox();
            listaCarroPasseio.setBounds(10, 10, 200, 30);
        }
        return listaCarroPasseio;
    }

    public JPanel PainelVendaPasseio() {
        if (painelVendaPasseio == null) {
            painelVendaPasseio = new JPanel();
            painelVendaPasseio.setLayout(null);
            painelVendaPasseio.setBackground(Color.white);
            painelVendaPasseio.add(ListaCarroPasseio());
            painelVendaPasseio.add(LblAnoFabricacao());
            painelVendaPasseio.add(LblAnoModelo());
            painelVendaPasseio.add(LblLitragemPortaMalas());
            painelVendaPasseio.add(LblMarca());
            painelVendaPasseio.add(LblModelo());
            painelVendaPasseio.add(LblNumeroChassis());
            painelVendaPasseio.add(LblNumeroPassageiros());
            painelVendaPasseio.add(LblPotencia());
            painelVendaPasseio.add(LblAnoFabricacao1());
            painelVendaPasseio.add(LblAnoModelo1());
            painelVendaPasseio.add(LblLitragemPortaMalas1());
            painelVendaPasseio.add(LblMarca1());
            painelVendaPasseio.add(LblModelo1());
            painelVendaPasseio.add(LblNumeroChassis1());
            painelVendaPasseio.add(LblNumeroPassageiros1());
            painelVendaPasseio.add(LblPotencia1());
            painelVendaPasseio.add(LblOpcionais());
            painelVendaPasseio.add(LblAr());
            painelVendaPasseio.add(JrbArSim());
            painelVendaPasseio.add(JrbArNao());
            painelVendaPasseio.add(LblVidroEletrico());
            painelVendaPasseio.add(JrbVidroEletricoSim());
            painelVendaPasseio.add(JrbVidroEletricoNao());
            painelVendaPasseio.add(LblAlarme());
            painelVendaPasseio.add(JrbAlarmeNao());
            painelVendaPasseio.add(JrbAlarmeSim());
            painelVendaPasseio.add(LblTravaEletrica());
            painelVendaPasseio.add(JrbTravaEletricaNao());
            painelVendaPasseio.add(JrbTravaEletricaSim());
            painelVendaPasseio.add(LblSom());
            painelVendaPasseio.add(JrbSomNao());
            painelVendaPasseio.add(JrbSomSim());
            painelVendaPasseio.add(LblCpfCliente());
            painelVendaPasseio.add(TxtCpfCliente());
            painelVendaPasseio.add(BtnCpfCliente());
            painelVendaPasseio.add(LblFormasPagamento());
            painelVendaPasseio.add(JrbFormasPagamentoAVista());
            painelVendaPasseio.add(JrbFormasPagamentoFinanciamento());
        }
        return painelVendaPasseio;
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

    public JLabel LblLitragemPortaMalas() {
        if (lblLitragemPortaMalas == null) {
            lblLitragemPortaMalas = new JLabel();
            lblLitragemPortaMalas.setBounds(290, 290, 260, 20);
        }
        return lblLitragemPortaMalas;
    }

    public JLabel LblNumeroPassageiros() {
        if (lblNumeroPassageiros == null) {
            lblNumeroPassageiros = new JLabel();
            lblNumeroPassageiros.setBounds(290, 330, 260, 20);
        }
        return lblNumeroPassageiros;
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

    public JLabel LblLitragemPortaMalas1() {
        JLabel lblLitragemPortaMalas1 = new JLabel();
        lblLitragemPortaMalas1.setBounds(10, 290, 260, 20);
        lblLitragemPortaMalas1.setText("Litragem porta malas");
        return lblLitragemPortaMalas1;
    }

    public JLabel LblNumeroPassageiros1() {
        JLabel lblNumeroPassageiros1 = new JLabel();
        lblNumeroPassageiros1.setBounds(10, 330, 260, 20);
        lblNumeroPassageiros1.setText("Numero de passageiros");
        return lblNumeroPassageiros1;
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
