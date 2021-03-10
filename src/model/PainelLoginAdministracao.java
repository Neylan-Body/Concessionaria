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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class PainelLoginAdministracao {

    private JPanel painelLogin;
    private JPasswordField psfSenha;
    private JTextField txtUsuario;
    private JLabel lblSenha, lblUsuario;
    private JButton btnLogin;

    public JPanel PainelLogin() {
        if (painelLogin == null) {
            painelLogin = new JPanel();
            painelLogin.setLayout(null);
            painelLogin.setBackground(Color.white);
            painelLogin.add(LblSenha());
            painelLogin.add(LblUsuario());
            painelLogin.add(PsfSenha());
            painelLogin.add(TxtUsuario());            
            painelLogin.add(BtnLogin());
        }
        return painelLogin;
    }

    public JTextField TxtUsuario() {
        if (txtUsuario == null) {
            txtUsuario = new JTextField();
            txtUsuario.setBounds(290, 10, 260, 20);
        }
        return txtUsuario;
    }

    public JPasswordField PsfSenha() {
        if (psfSenha == null) {
            psfSenha = new JPasswordField();
            psfSenha.setBounds(290, 50, 260, 20);
        }
        return psfSenha;
    }

    public JLabel LblUsuario() {
        if (lblUsuario == null) {
            lblUsuario = new JLabel();
            lblUsuario.setBounds(10, 10, 260, 20);            
            lblUsuario.setText("Usuario");
        }
        return lblUsuario;
    }

    public JLabel LblSenha() {
        if (lblSenha == null) {            
            lblSenha = new JLabel();
            lblSenha.setBounds(10, 50, 260, 20);
            lblSenha.setText("Senha");
        }
        return lblSenha;
    }

    public JButton BtnLogin() {
        if (btnLogin == null) {
            btnLogin = new JButton();
            btnLogin.setBounds(10, 90, 260, 20);
            btnLogin.setText("Login");
        }
        return btnLogin;
    }
}
