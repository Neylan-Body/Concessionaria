/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.PainelAdministrador;
import model.PainelLoginAdministracao;
import view.ConcessionariaView;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaLoginAdministracao implements ActionListener {

    private static PainelLoginAdministracao painelLoginAdministracao;
    private static ControladorTelaAdministrador controladorTelaAdministrador;
    private static PainelAdministrador painelAdministrador;    
    private static ConcessionariaView concessionariaView;

    public ControladorTelaLoginAdministracao(PainelLoginAdministracao painelLoginAdministracao, ConcessionariaView concessionariaView) {
        this.painelLoginAdministracao = painelLoginAdministracao;
        this.concessionariaView = concessionariaView;
        EventosTelaLoginAdminitracao();
    }

    public void EventosTelaLoginAdminitracao() {
        painelLoginAdministracao().BtnLogin().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == painelLoginAdministracao().BtnLogin()) {
            String senha = new String(painelLoginAdministracao().PsfSenha().getPassword());
            if (painelLoginAdministracao().TxtUsuario().getText().equals("Admin") && senha.equals("Neylan")) {
                try {
                    controladorTelaAdministrador = null;
                    painelLoginAdministracao().TxtUsuario().setText("");
                    painelLoginAdministracao().PsfSenha().setText("");
                    controladorTelaAdministrador();
                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaLoginAdministracao.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(painelLoginAdministracao().PainelLogin(), "Usuario ou senha incorretos");
            }
        }
    }

    public static PainelLoginAdministracao painelLoginAdministracao() {
        if (painelLoginAdministracao == null) {
            painelLoginAdministracao = new PainelLoginAdministracao();
        }
        return painelLoginAdministracao;
    }

    public static ControladorTelaAdministrador controladorTelaAdministrador() throws IOException {
        if (controladorTelaAdministrador == null) {
            controladorTelaAdministrador = new ControladorTelaAdministrador(painelAdministrador(), concessionariaView());
        }
        return controladorTelaAdministrador;
    }

    public static PainelAdministrador painelAdministrador() {
        if (painelAdministrador == null) {
            painelAdministrador = new PainelAdministrador();
        }
        return painelAdministrador;
    }

    public static ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }
}
