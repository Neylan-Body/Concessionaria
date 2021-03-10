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
import model.PainelAdministrador;
import model.PainelCadastroCarga;
import model.PainelCadastroCliente;
import model.PainelCadastroPasseio;
import model.PainelCadastroVendedor;
import model.PainelInicio;
import model.PainelRelatorios;
import view.ConcessionariaView;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaAdministrador implements ActionListener {

    private PainelAdministrador painelAdministrador;
    private ControladorTelaCadastroPasseio controladorTelaCadastroPasseio;
    private ControladorTelaCadastroCliente controladorTelaCadastroCliente;
    private ControladorTelaCadastroVendedor controladorTelaCadastroVendedor;
    private ControladorTelaCadastroCarga controladorTelaCadastroCarga;
    private ControladorTelaInicial controladorTelaInicial;
    private ControladorTelaRelatorios controladorTelaRelatorios;
    private ConcessionariaView concessionariaView;
    private PainelCadastroPasseio painelCadastroPasseio;
    private PainelCadastroCarga painelCadastroCarga;
    private PainelCadastroVendedor painelCadastroVendedor;
    private PainelCadastroCliente painelCadastroCliente;
    private PainelInicio painelInicio;
    private PainelRelatorios painelRelatorios;

    /**
     *
     * @param painelAdministrador
     */
    public ControladorTelaAdministrador(PainelAdministrador painelAdministrador, ConcessionariaView concessionariaView) throws IOException {
        this.painelAdministrador = painelAdministrador;
        this.concessionariaView = concessionariaView;
        EventosTelaAdminitrador();
        concessionariaView().MenuBar().removeAll();
        concessionariaView().setContentPane(painelAdministrador().PainelAdministrador());
        concessionariaView().setJMenuBar(concessionariaView().MenuBar());
        concessionariaView().MenuBar().add(concessionariaView().CadastroVeiculos());
        concessionariaView().MenuBar().add(concessionariaView().CadastroVendedor());
        concessionariaView().MenuBar().add(concessionariaView().CadastroCliente());
        concessionariaView().MenuBar().add(concessionariaView().Relatorios());
        concessionariaView().MenuBar().add(concessionariaView().Voltar());
        concessionariaView().Voltar().add(concessionariaView().Logof());
        concessionariaView().CadastroVendedor().add(concessionariaView().VendedorCadastro());
        concessionariaView().CadastroVeiculos().add(concessionariaView().CadastroCarga());
        concessionariaView().CadastroVeiculos().add(concessionariaView().CadastroPasseio());
        concessionariaView().CadastroCliente().add(concessionariaView().Cliente());
        concessionariaView().Relatorios().add(concessionariaView().Relatorio());
        concessionariaView().setVisible(true);
    }

    public void EventosTelaAdminitrador() throws IOException {
        concessionariaView().CadastroCarga().addActionListener(this);
        concessionariaView().CadastroPasseio().addActionListener(this);
        concessionariaView().VendedorCadastro().addActionListener(this);
        concessionariaView().Cliente().addActionListener(this);
        concessionariaView().Relatorio().addActionListener(this);
        concessionariaView().Logof().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == concessionariaView().CadastroPasseio()) {
                try {
                    concessionariaView().setContentPane(painelCadastroPasseio().PainelCadastroPasseio());
                    concessionariaView().repaint();
                    concessionariaView().validate();
                    controladorTelaCadastroPasseio();
                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (ae.getSource() == concessionariaView().CadastroCarga()) {
                try {
                    concessionariaView().setContentPane(painelCadastroCarga().PainelCadastroCarga());
                    concessionariaView().repaint();
                    concessionariaView().validate();
                    controladorTelaCadastroCarga();
                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (ae.getSource() == concessionariaView().VendedorCadastro()) {
                try {
                    concessionariaView().setContentPane(painelCadastroVendedor().PainelCadastroVendedor());
                    concessionariaView().repaint();
                    concessionariaView().validate();
                    controladorTelaCadastroVendedor();
                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (ae.getSource() == concessionariaView().Cliente()) {
                try {
                    concessionariaView().setContentPane(painelCadastroCliente().PainelCadastroCliente());
                    concessionariaView().repaint();
                    concessionariaView().validate();
                    controladorTelaCadastroCliente();
                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (ae.getSource() == concessionariaView().Relatorio()) {
                controladorTelaRelatorios();
            }
            if (ae.getSource() == concessionariaView().Logof()) {
                try {
                    concessionariaView().MenuBar().removeAll();
                    concessionariaView().dispose();
                    controladorTelaInicial = null;
                    controladorTelaInicial();
                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ControladorTelaAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public PainelAdministrador painelAdministrador() {
        if (painelAdministrador == null) {
            painelAdministrador = new PainelAdministrador();
        }
        return painelAdministrador;
    }

    public PainelCadastroPasseio painelCadastroPasseio() {
        if (painelCadastroPasseio == null) {
            painelCadastroPasseio = new PainelCadastroPasseio();
        }
        return painelCadastroPasseio;
    }

    public PainelCadastroVendedor painelCadastroVendedor() {
        if (painelCadastroVendedor == null) {
            painelCadastroVendedor = new PainelCadastroVendedor();
        }
        return painelCadastroVendedor;
    }

    public PainelCadastroCliente painelCadastroCliente() {
        if (painelCadastroCliente == null) {
            painelCadastroCliente = new PainelCadastroCliente();
        }
        return painelCadastroCliente;
    }
    
    public PainelRelatorios painelRelatorios(){
        if(painelRelatorios == null){
            painelRelatorios = new PainelRelatorios();
        }
        return painelRelatorios;
    }

    public PainelCadastroCarga painelCadastroCarga() {
        if (painelCadastroCarga == null) {
            painelCadastroCarga = new PainelCadastroCarga();
        }
        return painelCadastroCarga;
    }

    public PainelInicio painelInicio() {
        if (painelInicio == null) {
            painelInicio = new PainelInicio();
        }
        return painelInicio;
    }

    public ControladorTelaCadastroPasseio controladorTelaCadastroPasseio() throws IOException {
        if (controladorTelaCadastroPasseio == null) {
            controladorTelaCadastroPasseio = new ControladorTelaCadastroPasseio(painelCadastroPasseio(), concessionariaView());
        }
        return controladorTelaCadastroPasseio;
    }

    public ControladorTelaInicial controladorTelaInicial() throws IOException {
        if (controladorTelaInicial == null) {
            controladorTelaInicial = new ControladorTelaInicial(concessionariaView());
        }
        return controladorTelaInicial;
    }
    
    public ControladorTelaRelatorios controladorTelaRelatorios() throws IOException{
        if(controladorTelaRelatorios == null){
            controladorTelaRelatorios = new ControladorTelaRelatorios(painelRelatorios(), concessionariaView());
        }
        return controladorTelaRelatorios;
    }

    public ControladorTelaCadastroCarga controladorTelaCadastroCarga() throws IOException {
        if (controladorTelaCadastroCarga == null) {
            controladorTelaCadastroCarga = new ControladorTelaCadastroCarga(painelCadastroCarga(), concessionariaView());
        }
        return controladorTelaCadastroCarga;
    }

    public ControladorTelaCadastroVendedor controladorTelaCadastroVendedor() throws IOException {
        if (controladorTelaCadastroVendedor == null) {
            controladorTelaCadastroVendedor = new ControladorTelaCadastroVendedor(painelCadastroVendedor(), concessionariaView());
        }
        return controladorTelaCadastroVendedor;
    }

    public ControladorTelaCadastroCliente controladorTelaCadastroCliente() throws IOException {
        if (controladorTelaCadastroCliente == null) {
            controladorTelaCadastroCliente = new ControladorTelaCadastroCliente(painelCadastroCliente(), concessionariaView());
        }
        return controladorTelaCadastroCliente;
    }

    public ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }
}
