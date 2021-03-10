/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class PainelCadastroPasseio {

    private JPanel painelCadastroPasseio;
    private JTextField txtMarca, txtModelo, txtPotencia, txtValor, txtLitragemPortaMalas, txtNumeroPassageiros;
    private JFormattedTextField txtAnoFabricacao, txtAnoModelo, txtNumeroChassis;
    private JButton btnCadastroPasseio;
    private FormataMascaras formataMascaras;

    public JPanel PainelCadastroPasseio() {
        if (painelCadastroPasseio == null) {
            painelCadastroPasseio = new JPanel();
            painelCadastroPasseio.setLayout(null);
            painelCadastroPasseio.setBackground(Color.white);
            painelCadastroPasseio.add(LblMarca());
            painelCadastroPasseio.add(LblModelo());
            painelCadastroPasseio.add(LblPotencia());
            painelCadastroPasseio.add(LblAnoFabricacao());
            painelCadastroPasseio.add(LblAnoModelo());
            painelCadastroPasseio.add(LblValor());
            painelCadastroPasseio.add(LblNumeroChassis());
            painelCadastroPasseio.add(LblLitragemPortaMalas());
            painelCadastroPasseio.add(LblNumeroPassageiros());
            painelCadastroPasseio.add(TxtMarca());
            painelCadastroPasseio.add(TxtModelo());
            painelCadastroPasseio.add(TxtPotencia());
            painelCadastroPasseio.add(TxtAnoFabricacao());
            painelCadastroPasseio.add(TxtAnoModelo());
            painelCadastroPasseio.add(TxtValor());
            painelCadastroPasseio.add(TxtNumeroChassis());
            painelCadastroPasseio.add(TxtLitragemPortaMalas());
            painelCadastroPasseio.add(TxtNumeroPassageiros());
            painelCadastroPasseio.add(BtnCadastroPasseio());
        }
        return painelCadastroPasseio;
    }

    public JLabel LblMarca() {
        JLabel lblMarca = new JLabel();
        lblMarca.setBounds(10, 10, 260, 20);
        lblMarca.setText("Digite a marca do carro");
        return lblMarca;
    }

    public JLabel LblModelo() {
        JLabel lblModelo = new JLabel();
        lblModelo.setBounds(10, 50, 260, 20);
        lblModelo.setText("Digite o modelo do carro");
        return lblModelo;
    }

    public JLabel LblPotencia() {
        JLabel lblPotencia = new JLabel();
        lblPotencia.setBounds(10, 90, 260, 20);
        lblPotencia.setText("Digite a potencia");
        return lblPotencia;
    }

    public JLabel LblAnoFabricacao() {
        JLabel lblAnoFabricacao = new JLabel();
        lblAnoFabricacao.setBounds(10, 130, 260, 20);
        lblAnoFabricacao.setText("Digite o ano de fabricação");
        return lblAnoFabricacao;
    }

    public JLabel LblAnoModelo() {
        JLabel lblAnoModelo = new JLabel();
        lblAnoModelo.setBounds(10, 170, 260, 20);
        lblAnoModelo.setText("Digite o ano modelo");
        return lblAnoModelo;
    }

    public JLabel LblValor() {
        JLabel lblValor = new JLabel();
        lblValor.setBounds(10, 210, 260, 20);
        lblValor.setText("Digite o Valor do veiculo");
        return lblValor;
    }

    public JLabel LblNumeroChassis() {
        JLabel lblNumeroChassis = new JLabel();
        lblNumeroChassis.setBounds(10, 250, 260, 20);
        lblNumeroChassis.setText("Digite o numero do chassis");
        return lblNumeroChassis;
    }

    public JLabel LblLitragemPortaMalas() {
        JLabel lblLitragemPortaMalas = new JLabel();
        lblLitragemPortaMalas.setBounds(10, 290, 260, 20);
        lblLitragemPortaMalas.setText("Litragem do porta mala");
        return lblLitragemPortaMalas;
    }

    public JLabel LblNumeroPassageiros() {
        JLabel lblNumeroPassageiros = new JLabel();
        lblNumeroPassageiros.setBounds(10, 330, 260, 20);
        lblNumeroPassageiros.setText("Numero total de passageiros");
        return lblNumeroPassageiros;
    }

    public JTextField TxtMarca() {
        if (txtMarca == null) {
            txtMarca = new JTextField();
            txtMarca.setBounds(290, 10, 260, 20);
        }
        return txtMarca;
    }

    public JTextField TxtModelo() {
        if (txtModelo == null) {
            txtModelo = new JTextField();
            txtModelo.setBounds(290, 50, 260, 20);
        }
        return txtModelo;
    }

    public JTextField TxtPotencia() {
        if (txtPotencia == null) {
            txtPotencia = new JTextField();
            txtPotencia.setBounds(290, 90, 260, 20);
        }
        return txtPotencia;
    }

    public JTextField TxtAnoFabricacao() {
        if (txtAnoFabricacao == null) {
            txtAnoFabricacao = new JFormattedTextField();
            txtAnoFabricacao.setFormatterFactory(formataMascaras().getAno());
            txtAnoFabricacao.setBounds(290, 130, 260, 20);
        }
        return txtAnoFabricacao;
    }

    public JTextField TxtAnoModelo() {
        if (txtAnoModelo == null) {
            txtAnoModelo = new JFormattedTextField();
            txtAnoModelo.setFormatterFactory(formataMascaras().getAno());
            txtAnoModelo.setBounds(290, 170, 260, 20);
        }
        return txtAnoModelo;
    }

    public JTextField TxtValor() {
        if (txtValor == null) {
            txtValor = new JTextField();
            txtValor.setBounds(290, 210, 260, 20);
        }
        return txtValor;
    }

    public JTextField TxtNumeroChassis() {
        if (txtNumeroChassis == null) {
            txtNumeroChassis = new JFormattedTextField();
            txtNumeroChassis.setFormatterFactory(formataMascaras().getChassi());
            txtNumeroChassis.setBounds(290, 250, 260, 20);
        }
        return txtNumeroChassis;
    }

    public JTextField TxtLitragemPortaMalas() {
        if (txtLitragemPortaMalas == null) {
            txtLitragemPortaMalas = new JTextField();
            txtLitragemPortaMalas.setBounds(290, 290, 260, 20);
        }
        return txtLitragemPortaMalas;
    }

    public JTextField TxtNumeroPassageiros() {
        if (txtNumeroPassageiros == null) {
            txtNumeroPassageiros = new JTextField();
            txtNumeroPassageiros.setBounds(290, 330, 260, 20);
        }
        return txtNumeroPassageiros;
    }

    public JButton BtnCadastroPasseio() {
        if (btnCadastroPasseio == null) {
            btnCadastroPasseio = new JButton();
            btnCadastroPasseio.setBounds(290, 370, 120, 20);
            btnCadastroPasseio.setText("Confirmar");
        }
        return btnCadastroPasseio;
    }

    public FormataMascaras formataMascaras() {
        if (formataMascaras == null) {
            formataMascaras = new FormataMascaras();
        }
        return formataMascaras;
    }
}
