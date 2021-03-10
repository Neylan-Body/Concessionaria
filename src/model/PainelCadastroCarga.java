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
public class PainelCadastroCarga {

    private JPanel painelCadastroCarga;
    private JButton btnCadastroCarga;
    private JTextField txtMarca, txtModelo, txtPotencia, txtValor, txtTamanhoCarroceria, txtPesoMaximoCarga, txtPesoTotal, txtAlturaCarga;
    private JFormattedTextField txtAnoFabricacao, txtAnoModelo, txtNumeroChassis;
    private FormataMascaras formataMascaras;

    public JPanel PainelCadastroCarga() {
        if (painelCadastroCarga == null) {
            painelCadastroCarga = new JPanel();
            painelCadastroCarga.setLayout(null);
            painelCadastroCarga.setBackground(Color.white);
            painelCadastroCarga.add(LblMarca());
            painelCadastroCarga.add(LblModelo());
            painelCadastroCarga.add(LblPotencia());
            painelCadastroCarga.add(LblAnoFabricacao());
            painelCadastroCarga.add(LblAnoModelo());
            painelCadastroCarga.add(LblValor());
            painelCadastroCarga.add(LblNumeroChassis());
            painelCadastroCarga.add(LblTamanhoCarroceria());
            painelCadastroCarga.add(LblPesoMaximoCarga());
            painelCadastroCarga.add(LblPesoTotal());
            painelCadastroCarga.add(LblAlturaCarga());
            painelCadastroCarga.add(TxtMarca());
            painelCadastroCarga.add(TxtModelo());
            painelCadastroCarga.add(TxtPotencia());
            painelCadastroCarga.add(TxtAnoFabricacao());
            painelCadastroCarga.add(TxtAnoModelo());
            painelCadastroCarga.add(TxtValor());
            painelCadastroCarga.add(TxtNumeroChassis());
            painelCadastroCarga.add(TxtTamanhoCarroceria());
            painelCadastroCarga.add(TxtPesoMaximoCarga());
            painelCadastroCarga.add(TxtPesoTotal());
            painelCadastroCarga.add(TxtAlturaCarga());
            painelCadastroCarga.add(BtnCadastroCarga());
        }
        return painelCadastroCarga;
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

    public JLabel LblTamanhoCarroceria() {
        JLabel lblTamanhoCarroceria = new JLabel();
        lblTamanhoCarroceria.setBounds(10, 290, 260, 20);
        lblTamanhoCarroceria.setText("Tamanho da carroceria");
        return lblTamanhoCarroceria;
    }

    public JLabel LblPesoMaximoCarga() {
        JLabel lblPesoMaximoCarga = new JLabel();
        lblPesoMaximoCarga.setBounds(10, 330, 260, 20);
        lblPesoMaximoCarga.setText("Peso maximo da carga");
        return lblPesoMaximoCarga;
    }

    public JLabel LblPesoTotal() {
        JLabel lblPesoTotal = new JLabel();
        lblPesoTotal.setBounds(10, 370, 260, 20);
        lblPesoTotal.setText("Peso total");
        return lblPesoTotal;
    }

    public JLabel LblAlturaCarga() {
        JLabel lblAlturaCarga = new JLabel();
        lblAlturaCarga.setBounds(10, 410, 260, 20);
        lblAlturaCarga.setText("Altura maxima da carga");
        return lblAlturaCarga;
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

    public JTextField TxtTamanhoCarroceria() {
        if (txtTamanhoCarroceria == null) {
            txtTamanhoCarroceria = new JTextField();
            txtTamanhoCarroceria.setBounds(290, 290, 260, 20);
        }
        return txtTamanhoCarroceria;
    }

    public JTextField TxtPesoMaximoCarga() {
        if (txtPesoMaximoCarga == null) {
            txtPesoMaximoCarga = new JTextField();
            txtPesoMaximoCarga.setBounds(290, 330, 260, 20);
        }
        return txtPesoMaximoCarga;
    }

    public JTextField TxtPesoTotal() {
        if (txtPesoTotal == null) {
            txtPesoTotal = new JTextField();
            txtPesoTotal.setBounds(290, 370, 260, 20);
        }
        return txtPesoTotal;
    }

    public JTextField TxtAlturaCarga() {
        if (txtAlturaCarga == null) {
            txtAlturaCarga = new JTextField();
            txtAlturaCarga.setBounds(290, 410, 260, 20);
        }
        return txtAlturaCarga;
    }

    public JButton BtnCadastroCarga() {
        if (btnCadastroCarga == null) {
            btnCadastroCarga = new JButton();
            btnCadastroCarga.setBounds(290, 450, 120, 20);
            btnCadastroCarga.setText("Confirmar");
        }
        return btnCadastroCarga;
    }

    public FormataMascaras formataMascaras() {
        if (formataMascaras == null) {
            formataMascaras = new FormataMascaras();
        }
        return formataMascaras;
    }

}
