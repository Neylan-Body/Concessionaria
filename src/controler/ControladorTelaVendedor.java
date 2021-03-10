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
import model.PainelRelatorios;
import model.PainelVendaCarga;
import model.PainelVendaPasseio;
import model.PainelVendedor;
import view.ConcessionariaView;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaVendedor implements ActionListener {

    private PainelVendedor painelVendedor;
    private PainelVendaCarga painelVendaCarga;
    private PainelVendaPasseio painelVendaPasseio;
    private PainelRelatorios painelRelatorios;
    private ControladorTelaInicial controladorTelaInicial;
    private ControladorTelaVendaPasseio controladorTelaVendaPasseio;
    private ControladorTelaVendaCarga controladorTelaVendaCarga;
    private ControladorTelaRelatorios controladorTelaRelatorios;
    private ConcessionariaView concessionariaView;
    String login;

    public ControladorTelaVendedor(PainelVendedor painelVendedor, ConcessionariaView concessionariaView, String login) throws IOException {
        this.concessionariaView = concessionariaView;
        this.painelVendedor = painelVendedor;
        this.login = login;
        Eventos();
        concessionariaView().MenuBar().removeAll();
        concessionariaView().setContentPane(painelVendedor().PainelVendedor());
        concessionariaView().setJMenuBar(concessionariaView().MenuBar());
        concessionariaView().MenuBar().add(concessionariaView().VendaCarga());
        concessionariaView().MenuBar().add(concessionariaView().VendaPasseio());
        concessionariaView().MenuBar().add(concessionariaView().Voltar());
        concessionariaView().Voltar().add(concessionariaView().Logof());
        concessionariaView().VendaCarga().add(concessionariaView().Carga());
        concessionariaView().VendaPasseio().add(concessionariaView().Passeio());
        concessionariaView().setVisible(true);
    }

    public void Eventos() throws IOException {
        concessionariaView().Carga().addActionListener(this);
        concessionariaView().Passeio().addActionListener(this);
        concessionariaView().Logof().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == concessionariaView().Carga()) {
                painelVendaCarga = null;
                controladorTelaVendaCarga = null;
                controladorTelaVendaCarga();
            }
            if (ae.getSource() == concessionariaView().Passeio()) {
                painelVendaPasseio = null;
                controladorTelaVendaPasseio = null;
                controladorTelaVendaPasseio();
            }
            if (ae.getSource() == concessionariaView().Logof()) {
                try {
                    for(int i = 0; i< Arrays.CarroCarga().size(); i++){
                        Arrays.CarroCarga().get(i).setValor_venda(Arrays.CarroCarga().get(i).getValor_compra()*1.226);
                    }
                    for(int i = 0; i< Arrays.CarroPasseio().size(); i++){
                        Arrays.CarroPasseio().get(i).setValor_venda(Arrays.CarroPasseio().get(i).getValor_compra()*1.36);
                    }
                    concessionariaView().MenuBar().removeAll();
                    concessionariaView().dispose();
                    controladorTelaInicial = null;
                    controladorTelaInicial();
                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaVendedor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ControladorTelaVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public PainelVendedor painelVendedor() {
        if (painelVendedor == null) {
            painelVendedor = new PainelVendedor();
        }
        return painelVendedor;
    }

    public PainelVendaCarga painelVendaCarga() {
        if (painelVendaCarga == null) {
            painelVendaCarga = new PainelVendaCarga();
        }
        return painelVendaCarga;
    }

    public PainelVendaPasseio painelVendaPasseio() {
        if (painelVendaPasseio == null) {
            painelVendaPasseio = new PainelVendaPasseio();
        }
        return painelVendaPasseio;
    }
    
    public PainelRelatorios painelRelatorios(){
        if(painelRelatorios == null){
            painelRelatorios = new PainelRelatorios();
        }
        return painelRelatorios;
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

    public ControladorTelaVendaPasseio controladorTelaVendaPasseio() throws IOException {
        if (controladorTelaVendaPasseio == null) {
            controladorTelaVendaPasseio = new ControladorTelaVendaPasseio(painelVendaPasseio(), concessionariaView(), login);
        }
        return controladorTelaVendaPasseio;
    }

    public ControladorTelaVendaCarga controladorTelaVendaCarga() throws IOException {
        if (controladorTelaVendaCarga == null) {
            controladorTelaVendaCarga = new ControladorTelaVendaCarga(painelVendaCarga(), concessionariaView(), login);
        }
        return controladorTelaVendaCarga;
    }

    public ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }

}
