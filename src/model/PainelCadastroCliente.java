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
public class PainelCadastroCliente {
    private JPanel painelCadastroCliente;
    private JButton btnCadastroCliente;
    private JTextField txtNome, txtRua, txtBairro, txtNumero, txtCidade, txtEstado;
    private JFormattedTextField txtRg, txtCpf;
    private FormataMascaras formataMascaras;
    
            
    public JPanel PainelCadastroCliente(){
        if(painelCadastroCliente == null){
            painelCadastroCliente = new JPanel();
            painelCadastroCliente.setLayout(null);
            painelCadastroCliente.setBackground(Color.white);
            painelCadastroCliente.add(LblBairro());
            painelCadastroCliente.add(LblCidade());
            painelCadastroCliente.add(LblCpf());
            painelCadastroCliente.add(LblEstado());
            painelCadastroCliente.add(LblNome());
            painelCadastroCliente.add(LblNumero());
            painelCadastroCliente.add(LblRg());
            painelCadastroCliente.add(LblRua());
            painelCadastroCliente.add(TxtBairro());
            painelCadastroCliente.add(TxtCidade());
            painelCadastroCliente.add(TxtCpf());
            painelCadastroCliente.add(TxtEstado());
            painelCadastroCliente.add(TxtNome());
            painelCadastroCliente.add(TxtNumero());
            painelCadastroCliente.add(TxtRg());
            painelCadastroCliente.add(TxtRua());
            painelCadastroCliente.add(BtnCadastroCliente());
        }
        return painelCadastroCliente;
    }
    
    public JLabel LblNome(){
        JLabel lblNome = new JLabel();
        lblNome.setBounds(10, 10, 260, 20);
        lblNome.setText("Digite o nome");
        return lblNome;
    }
    
    public JLabel LblCpf(){
        JLabel lblCpf = new JLabel();
        lblCpf.setBounds(10, 50, 260, 20);
        lblCpf.setText("Digite o CPF");
        return lblCpf;
    }
    
    public JLabel LblRg(){
        JLabel lblRg = new JLabel();
        lblRg.setBounds(10, 90, 260, 20);
        lblRg.setText("Digite o RG");
        return lblRg;
    }
    
    public JLabel LblRua(){
        JLabel lblRua = new JLabel();
        lblRua.setBounds(10, 130, 260, 20);
        lblRua.setText("Digite a rua");
        return lblRua;
    }
    
    public JLabel LblBairro(){
        JLabel lblBairro = new JLabel();
        lblBairro.setBounds(10, 170, 260, 20);
        lblBairro.setText("Digite o bairro");
        return lblBairro;
    }
    
    public JLabel LblNumero(){
        JLabel lblNumero = new JLabel();
        lblNumero.setBounds(10, 210, 260, 20);
        lblNumero.setText("Digite o numero");
        return lblNumero;
    }
    
    public JLabel LblCidade(){
        JLabel lblCidade = new JLabel();
        lblCidade.setBounds(10, 250, 260, 20);
        lblCidade.setText("Digite a cidade");
        return lblCidade;
    }
    
    public JLabel LblEstado(){
        JLabel lblEstado = new JLabel();
        lblEstado.setBounds(10, 290, 260, 20);
        lblEstado.setText("Digite o estado");
        return lblEstado;
    }
    
    public JTextField TxtNome(){
        if(txtNome == null){
            txtNome = new JTextField();
            txtNome.setBounds(290, 10, 260, 20);
        }
        return txtNome;
    }
    
    public JTextField TxtCpf(){
        if(txtCpf == null){
            txtCpf = new JFormattedTextField();
            txtCpf.setFormatterFactory(formataMascaras().getCPF());
            txtCpf.setBounds(290, 50, 260, 20);
        }
        return txtCpf;
    }
    
    public JTextField TxtRg(){
        if(txtRg == null){
            txtRg = new JFormattedTextField();
            txtRg.setFormatterFactory(formataMascaras().getRG());
            txtRg.setBounds(290, 90, 260, 20);
        }
        return txtRg;
    }
    
    public JTextField TxtRua(){
        if(txtRua == null){
            txtRua = new JTextField();
            txtRua.setBounds(290, 130, 260, 20);
        }
        return txtRua;
    }
    
    public JTextField TxtBairro(){
        if(txtBairro == null){
            txtBairro = new JTextField();
            txtBairro.setBounds(290, 170, 260, 20);
        }
        return txtBairro;
    }
    
    public JTextField TxtNumero(){
        if(txtNumero == null){
            txtNumero = new JTextField();
            txtNumero.setBounds(290, 210, 260, 20);
        }
        return txtNumero;
    }
    
    public JTextField TxtCidade(){
        if(txtCidade == null){
            txtCidade = new JTextField();
            txtCidade.setBounds(290, 250, 260, 20);
        }
        return txtCidade;
    }
    
    public JTextField TxtEstado(){
        if(txtEstado == null){
            txtEstado = new JTextField();
            txtEstado.setBounds(290, 290, 260, 20);
        }
        return txtEstado;
    }
    
    public JButton BtnCadastroCliente(){
        if(btnCadastroCliente == null){
            btnCadastroCliente = new JButton();
            btnCadastroCliente.setBounds(290, 330, 120, 20);
            btnCadastroCliente.setText("Confirmar");
        }
        return btnCadastroCliente;
    }
    
    public FormataMascaras formataMascaras() {
        if (formataMascaras == null) {
            formataMascaras = new FormataMascaras();
        }
        return formataMascaras;
    }
}
