/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.Toolkit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.PainelAdministrador;
import model.PainelInicio;
import model.PainelLoginAdministracao;
import model.PainelLoginVendedor;
import model.PainelVendaCarga;
import model.PainelVendaPasseio;
import view.ConcessionariaView;

import de.muntjak.tinylookandfeel.TinyLookAndFeel;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaInicial implements ActionListener {

    private static ControladorTelaVendaCarga controladorTelaVendaCarga;
    private static ControladorTelaVendaPasseio controladorTelaVendaPasseio;
    private static ControladorTelaLoginAdministracao controladorTelaLoginAdministracao;
    private static ControladorTelaLoginVendedor controladorTelaLoginVendedor;
    private static ConcessionariaView concessionariaView;
    private static PainelInicio painelInicio;
    private static PainelAdministrador painelAdministrador;
    private static PainelVendaPasseio painelVendaPasseio;
    private static PainelVendaCarga painelVendaCarga;
    private static PainelLoginAdministracao painelLoginAdministracao;
    private static PainelLoginVendedor painelLoginVendedor;
    static String login;

    /**
     *
     */
    public ControladorTelaInicial(ConcessionariaView concessionariaView) throws IOException {
        this.concessionariaView = concessionariaView;
        EventosTelaIncial();
        concessionariaView().setContentPane(painelInicio().PainelIncio());
        concessionariaView().setJMenuBar(concessionariaView().MenuBar());
        concessionariaView().MenuBar().add(concessionariaView().Administracao());
        concessionariaView().MenuBar().add(concessionariaView().VendedorLogin());
        concessionariaView().Administracao().add(concessionariaView().LoginAdministrador());
        concessionariaView().VendedorLogin().add(concessionariaView().LoginVendedor());
        concessionariaView().setVisible(true);
    }

    private void EventosTelaIncial() throws IOException {
        concessionariaView().LoginAdministrador().addActionListener(this);
        concessionariaView().LoginVendedor().addActionListener(this);
    }

    /**
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == concessionariaView().LoginAdministrador()) {
                concessionariaView().setContentPane(painelLoginAdministracao().PainelLogin());
                concessionariaView().repaint();
                concessionariaView().validate();
                controladorTelaLoginAdministracao();
            }
        } catch (IOException ex) {
            Logger.getLogger(ControladorTelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (ae.getSource() == concessionariaView().LoginVendedor()) {
                concessionariaView().setContentPane(painelLoginVendedor().PainelLogin());
                concessionariaView().repaint();
                concessionariaView().validate();
                controladorTelaLoginVendedor();
            }
        } catch (IOException ex) {
            Logger.getLogger(ControladorTelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ControladorTelaLoginAdministracao controladorTelaLoginAdministracao() throws IOException {
        if (controladorTelaLoginAdministracao == null) {
            controladorTelaLoginAdministracao = new ControladorTelaLoginAdministracao(painelLoginAdministracao(), concessionariaView());
        }
        return controladorTelaLoginAdministracao;
    }
    
     public static ControladorTelaLoginVendedor controladorTelaLoginVendedor() throws IOException {
        if (controladorTelaLoginVendedor == null) {
            controladorTelaLoginVendedor = new ControladorTelaLoginVendedor(painelLoginVendedor(), concessionariaView());
        }
        return controladorTelaLoginVendedor;
    }

    public static ControladorTelaVendaCarga controladorTelaVendaCarga() throws IOException {
        if (controladorTelaVendaCarga == null) {
            controladorTelaVendaCarga = new ControladorTelaVendaCarga(painelVendaCarga(), concessionariaView(), login);
        }
        return controladorTelaVendaCarga;
    }

    public static ControladorTelaVendaPasseio controladorTelaVendaPasseio() throws IOException {
        if (controladorTelaVendaPasseio == null) {
            controladorTelaVendaPasseio = new ControladorTelaVendaPasseio(painelVendaPasseio(), concessionariaView(), login);
        }
        return controladorTelaVendaPasseio;
    }

    public static ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }

    public static PainelInicio painelInicio() {
        if (painelInicio == null) {
            painelInicio = new PainelInicio();
        }
        return painelInicio;
    }

    public static PainelLoginAdministracao painelLoginAdministracao() {
        if (painelLoginAdministracao == null) {
            painelLoginAdministracao = new PainelLoginAdministracao();
        }
        return painelLoginAdministracao;
    }
    
    public static PainelLoginVendedor painelLoginVendedor() {
        if (painelLoginVendedor == null) {
            painelLoginVendedor = new PainelLoginVendedor();
        }
        return painelLoginVendedor;
    }

    public static PainelAdministrador painelAdministrador() {
        if (painelAdministrador == null) {
            painelAdministrador = new PainelAdministrador();
        }
        return painelAdministrador;
    }

    public static PainelVendaCarga painelVendaCarga() {
        if (painelVendaCarga == null) {
            painelVendaCarga = new PainelVendaCarga();
        }
        return painelVendaCarga;
    }

    public static PainelVendaPasseio painelVendaPasseio() {
        if (painelVendaPasseio == null) {
            painelVendaPasseio = new PainelVendaPasseio();
        }
        return painelVendaPasseio;
    }

    public static void main(String[] args) throws IOException {
        //new ConcessionariaView();
    	Toolkit.getDefaultToolkit().setDynamicLayout(true);
        System.setProperty("sun.awt.noerasebackground", "true");
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel("de.muntjak.tinylookandfeel.TinyLookAndFeel");
            TinyLookAndFeel.class.getResource("/Default.theme");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorTelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ControladorTelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ControladorTelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ControladorTelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ControladorTelaInicial(concessionariaView());
    }

}
