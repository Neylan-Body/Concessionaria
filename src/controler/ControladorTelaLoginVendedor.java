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
import model.Arrays;
import model.PainelLoginVendedor;
import model.PainelVendedor;
import view.ConcessionariaView;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaLoginVendedor implements ActionListener {

    private PainelLoginVendedor painelLoginVendedor;
    private PainelVendedor painelVendedor;
    private ControladorTelaVendedor controladorTelaVendedor;
    private ControladorTelaCadastroVendedor controladorTelaCadastroVendedor;
    private static ConcessionariaView concessionariaView;
    String loginVendedor;

    public ControladorTelaLoginVendedor(PainelLoginVendedor painelLoginVendedor, ConcessionariaView concessionariaView) {
        this.concessionariaView = concessionariaView;
        this.painelLoginVendedor = painelLoginVendedor;
        Eventos();
    }

    public void Eventos() {
        painelLoginVendedor().BtnLogin().addActionListener(this);
    }

    /**
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == painelLoginVendedor().BtnLogin()) {
            for (int i = 0; i < Arrays.Vendedor().size(); i++) {
                String senha = new String(painelLoginVendedor().PsfSenha().getPassword());
                if (painelLoginVendedor().TxtUsuario().getText().equals(Arrays.Vendedor().get(i).getLogin()) && senha.equals(Arrays.Vendedor().get(i).getSenha())) {
                    loginVendedor = painelLoginVendedor().TxtUsuario().getText();
                    try {
                        controladorTelaVendedor = null;
                        painelLoginVendedor().PsfSenha().setText("");
                        painelLoginVendedor().TxtUsuario().setText("");
                        controladorTelaVendedor();
                    } catch (IOException ex) {
                        Logger.getLogger(ControladorTelaLoginVendedor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    public PainelLoginVendedor painelLoginVendedor() {
        if (painelLoginVendedor == null) {
            painelLoginVendedor = new PainelLoginVendedor();
        }
        return painelLoginVendedor;
    }

    public PainelVendedor painelVendedor() {
        if (painelVendedor == null) {
            painelVendedor = new PainelVendedor();
        }
        return painelVendedor;
    }

    public ControladorTelaVendedor controladorTelaVendedor() throws IOException {
        if (controladorTelaVendedor == null) {
            controladorTelaVendedor = new ControladorTelaVendedor(painelVendedor(), concessionariaView(), loginVendedor);
        }
        return controladorTelaVendedor;
    }

    public static ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }

}
