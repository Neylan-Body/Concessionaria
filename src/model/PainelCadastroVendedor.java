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
public class PainelCadastroVendedor {

    private JTextField txtNome, txtRua, txtBairro, txtCidade, txtNumeroEndereco, txtEstado, txtAgencia, txtConta, txtSalario, txtMeta, txtComissao, txtLogin, txtSenha;
    private JPanel painelCadastroVendedor;
    private JFormattedTextField txtData_admissao;
    private JButton btnCadastroVendedor;
    private FormataMascaras formataMascaras;

    public JPanel PainelCadastroVendedor() {
        if (painelCadastroVendedor == null) {
            painelCadastroVendedor = new JPanel();
            painelCadastroVendedor.setLayout(null);
            painelCadastroVendedor.setBackground(Color.white);
            painelCadastroVendedor.add(LblAgencia());
            painelCadastroVendedor.add(LblComissao());
            painelCadastroVendedor.add(LblConta());
            painelCadastroVendedor.add(LblDataAdmissao());
            painelCadastroVendedor.add(LblRua());
            painelCadastroVendedor.add(LblBairro());
            painelCadastroVendedor.add(LblCidade());
            painelCadastroVendedor.add(LblNumeroEndereco());
            painelCadastroVendedor.add(LblEstado());
            painelCadastroVendedor.add(LblLogin());
            painelCadastroVendedor.add(LblMeta());
            painelCadastroVendedor.add(LblNome());
            painelCadastroVendedor.add(LblSalario());
            painelCadastroVendedor.add(LblSenha());
            painelCadastroVendedor.add(TxtAgencia());
            painelCadastroVendedor.add(TxtComissao());
            painelCadastroVendedor.add(TxtConta());
            painelCadastroVendedor.add(TxtData_admissao());
            painelCadastroVendedor.add(TxtRua());
            painelCadastroVendedor.add(TxtBairro());
            painelCadastroVendedor.add(TxtCidade());
            painelCadastroVendedor.add(TxtNumeroEndereco());
            painelCadastroVendedor.add(TxtEstado());
            painelCadastroVendedor.add(TxtLogin());
            painelCadastroVendedor.add(TxtMeta());
            painelCadastroVendedor.add(TxtNome());
            painelCadastroVendedor.add(TxtSalario());
            painelCadastroVendedor.add(TxtSenha());
            painelCadastroVendedor.add(BtnCadastroVendedor());
        }
        return painelCadastroVendedor;
    }

    public JLabel LblNome() {
        JLabel lblNome = new JLabel();
        lblNome.setBounds(10, 10, 260, 20);
        lblNome.setText("Digite o nome do Vendedor");
        return lblNome;
    }

    public JLabel LblRua() {
        JLabel lblRua = new JLabel();
        lblRua.setBounds(10, 50, 260, 20);
        lblRua.setText("Digite a rua");
        return lblRua;
    }

    public JLabel LblBairro() {
        JLabel lblBairro = new JLabel();
        lblBairro.setBounds(10, 90, 260, 20);
        lblBairro.setText("Digite o bairro");
        return lblBairro;
    }

    public JLabel LblCidade() {
        JLabel lblCidade = new JLabel();
        lblCidade.setBounds(10, 130, 260, 20);
        lblCidade.setText("Digite a cidade");
        return lblCidade;
    }

    public JLabel LblNumeroEndereco() {
        JLabel lblNumeroEndereco = new JLabel();
        lblNumeroEndereco.setBounds(10, 170, 260, 20);
        lblNumeroEndereco.setText("Digite o numero");
        return lblNumeroEndereco;
    }

    public JLabel LblEstado() {
        JLabel lblEstado = new JLabel();
        lblEstado.setBounds(10, 210, 260, 20);
        lblEstado.setText("Digite o estado");
        return lblEstado;
    }

    public JLabel LblAgencia() {
        JLabel lblAgencia = new JLabel();
        lblAgencia.setBounds(10, 250, 260, 20);
        lblAgencia.setText("Digite a agencia bancaria");
        return lblAgencia;
    }

    public JLabel LblConta() {
        JLabel lblConta = new JLabel();
        lblConta.setBounds(10, 290, 260, 20);
        lblConta.setText("Digite a conta bancaria");
        return lblConta;
    }

    public JLabel LblSalario() {
        JLabel lblSalario = new JLabel();
        lblSalario.setBounds(10, 330, 260, 20);
        lblSalario.setText("Digite o salario");
        return lblSalario;
    }

    public JLabel LblDataAdmissao() {
        JLabel lblDataAdmissao = new JLabel();
        lblDataAdmissao.setBounds(10, 370, 260, 20);
        lblDataAdmissao.setText("Digite a data de admissao");
        return lblDataAdmissao;
    }

    public JLabel LblMeta() {
        JLabel lblMeta = new JLabel();
        lblMeta.setBounds(10, 410, 260, 20);
        lblMeta.setText("Digite a meta");
        return lblMeta;
    }

    public JLabel LblComissao() {
        JLabel lblComissao = new JLabel();
        lblComissao.setBounds(10, 450, 260, 20);
        lblComissao.setText("Digite a comissão");
        return lblComissao;
    }

    public JLabel LblLogin() {
        JLabel lblLogin = new JLabel();
        lblLogin.setBounds(10, 490, 260, 20);
        lblLogin.setText("Digite o login");
        return lblLogin;
    }

    public JLabel LblSenha() {
        JLabel lblSenha = new JLabel();
        lblSenha.setBounds(10, 530, 260, 20);
        lblSenha.setText("Digite a senha");
        return lblSenha;
    }

    public JTextField TxtNome() {
        if (txtNome == null) {
            txtNome = new JTextField();
            txtNome.setBounds(290, 10, 260, 20);
        }
        return txtNome;
    }

    public JTextField TxtRua() {
        if (txtRua == null) {
            txtRua = new JTextField();
            txtRua.setBounds(290, 50, 260, 20);
        }
        return txtRua;
    }

    public JTextField TxtBairro() {
        if (txtBairro == null) {
            txtBairro = new JTextField();
            txtBairro.setBounds(290, 90, 260, 20);
        }
        return txtBairro;
    }

    public JTextField TxtCidade() {
        if (txtCidade == null) {
            txtCidade = new JTextField();
            txtCidade.setBounds(290, 130, 260, 20);
        }
        return txtCidade;
    }

    public JTextField TxtNumeroEndereco() {
        if (txtNumeroEndereco == null) {
            txtNumeroEndereco = new JTextField();
            txtNumeroEndereco.setBounds(290, 170, 260, 20);
        }
        return txtNumeroEndereco;
    }

    public JTextField TxtEstado() {
        if (txtEstado == null) {
            txtEstado = new JTextField();
            txtEstado.setBounds(290, 210, 260, 20);
        }
        return txtEstado;
    }

    public JTextField TxtAgencia() {
        if (txtAgencia == null) {
            txtAgencia = new JTextField();
            txtAgencia.setBounds(290, 250, 260, 20);
        }
        return txtAgencia;
    }

    public JTextField TxtConta() {
        if (txtConta == null) {
            txtConta = new JTextField();
            txtConta.setBounds(290, 290, 260, 20);
        }
        return txtConta;
    }

    public JTextField TxtSalario() {
        if (txtSalario == null) {
            txtSalario = new JTextField();
            txtSalario.setBounds(290, 330, 260, 20);
        }
        return txtSalario;
    }

    public JTextField TxtData_admissao() {
        if (txtData_admissao == null) {
            txtData_admissao = new JFormattedTextField();
            txtData_admissao.setFormatterFactory(formataMascaras().getData());
            txtData_admissao.setBounds(290, 370, 260, 20);
        }
        return txtData_admissao;
    }

    public JTextField TxtMeta() {
        if (txtMeta == null) {
            txtMeta = new JTextField();
            txtMeta.setBounds(290, 410, 260, 20);
        }
        return txtMeta;
    }

    public JTextField TxtComissao() {
        if (txtComissao == null) {
            txtComissao = new JTextField();
            txtComissao.setBounds(290, 450, 260, 20);
        }
        return txtComissao;
    }

    public JTextField TxtLogin() {
        if (txtLogin == null) {
            txtLogin = new JTextField();
            txtLogin.setBounds(290, 490, 260, 20);
        }
        return txtLogin;
    }

    public JTextField TxtSenha() {
        if (txtSenha == null) {
            txtSenha = new JTextField();
            txtSenha.setBounds(290, 530, 260, 20);
        }
        return txtSenha;
    }

    public JButton BtnCadastroVendedor() {
        if (btnCadastroVendedor == null) {
            btnCadastroVendedor = new JButton();
            btnCadastroVendedor.setBounds(290, 570, 120, 20);
            btnCadastroVendedor.setText("Confirmar");
        }
        return btnCadastroVendedor;
    }
    
    public FormataMascaras formataMascaras() {
        if (formataMascaras == null) {
            formataMascaras = new FormataMascaras();
        }
        return formataMascaras;
    }
}
