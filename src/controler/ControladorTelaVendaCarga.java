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
import model.Arrays;
import model.PainelCadastroCarga;
import model.PainelConclusaoVendaAVista;
import model.PainelConclusaoVendaFinanciamento;
import model.PainelVendaCarga;
import view.ConcessionariaView;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaVendaCarga implements ActionListener {

    private PainelVendaCarga painelVendaCarga;
    private PainelCadastroCarga painelCadastroCarga;
    private PainelConclusaoVendaFinanciamento painelConclusaoVendaFinanciamento;
    private PainelConclusaoVendaAVista painelConclusaoVendaAVista;
    private ControladorTelaCadastroCarga controladorTelaCadastroCarga;
    private ControladorTelaConclusaoVendaFinanciamento controladorTelaConclusaoVendaFinanciamento;
    private ControladorTelaConclusaoVendaAVista controladorTelaConclusaoVendaAVista;
    private ConcessionariaView concessionariaView;
    String login;

    public ControladorTelaVendaCarga(PainelVendaCarga painelVendaCarga, ConcessionariaView concessionariaView, String login) throws IOException {
        this.concessionariaView = concessionariaView;
        this.painelVendaCarga = painelVendaCarga;
        this.login = login;
        concessionariaView().setContentPane(painelVendaCarga().PainelVendaCarga());
        concessionariaView().repaint();
        concessionariaView().validate();
        for (int i = 0; i < Arrays.CarroCarga().size(); i++) {
            painelVendaCarga().ListaCarroCarga().addItem(Arrays.CarroCarga().get(i).getModelo());
        }
        painelVendaCarga().ListaCarroCarga().addActionListener(this);
        painelVendaCarga().JrbAlarmeNao().addActionListener(this);
        painelVendaCarga().JrbAlarmeSim().addActionListener(this);
        painelVendaCarga().JrbArNao().addActionListener(this);
        painelVendaCarga().JrbArSim().addActionListener(this);
        painelVendaCarga().JrbSomNao().addActionListener(this);
        painelVendaCarga().JrbSomSim().addActionListener(this);
        painelVendaCarga().JrbTravaEletricaNao().addActionListener(this);
        painelVendaCarga().JrbTravaEletricaSim().addActionListener(this);
        painelVendaCarga().JrbVidroEletricoNao().addActionListener(this);
        painelVendaCarga().JrbVidroEletricoSim().addActionListener(this);
        painelVendaCarga().JrbFormasPagamentoAVista().addActionListener(this);
        painelVendaCarga().JrbFormasPagamentoFinanciamento().addActionListener(this);
        painelVendaCarga().BtnCpfCliente().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        int i = painelVendaCarga().ListaCarroCarga().getSelectedIndex();
        if (ae.getSource() == painelVendaCarga().ListaCarroCarga()) {
            painelVendaCarga().LblAnoFabricacao().setText(Integer.toString(Arrays.CarroCarga().get(i).getAno_fabricacao()));
            painelVendaCarga().LblAnoModelo().setText(Integer.toString(Arrays.CarroCarga().get(i).getAno_modelo()));
            painelVendaCarga().LblAlturaCargaMaxima().setText(Arrays.CarroCarga().get(i).getAltura_carga_maxima());
            painelVendaCarga().LblPesoMaximoCarga().setText(Arrays.CarroCarga().get(i).getPeso_maximo_carga());
            painelVendaCarga().LblMarca().setText(Arrays.CarroCarga().get(i).getMarca());
            painelVendaCarga().LblModelo().setText(Arrays.CarroCarga().get(i).getModelo());
            painelVendaCarga().LblNumeroChassis().setText(Arrays.CarroCarga().get(i).getChassis());
            painelVendaCarga().LblPotencia().setText(Arrays.CarroCarga().get(i).getMotorizacao());
            painelVendaCarga().LblPesoTotal().setText(Arrays.CarroCarga().get(i).getPeso_total());
            painelVendaCarga().LblTamanhoCarroceria().setText(Arrays.CarroCarga().get(i).getTamanho_carroceria());
        }
        if (ae.getSource() == painelVendaCarga().JrbAlarmeNao()) {
            if (painelVendaCarga().JrbAlarmeNao().isSelected()) {
                painelVendaCarga().JrbAlarmeSim().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaCarga().JrbAlarmeSim()) {
            if (painelVendaCarga().JrbAlarmeSim().isSelected()) {
                painelVendaCarga().JrbAlarmeNao().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaCarga().JrbArNao()) {
            if (painelVendaCarga().JrbArNao().isSelected()) {
                painelVendaCarga().JrbArSim().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaCarga().JrbArSim()) {
            if (painelVendaCarga().JrbArSim().isSelected()) {
                painelVendaCarga().JrbArNao().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaCarga().JrbSomNao()) {
            if (painelVendaCarga().JrbSomNao().isSelected()) {
                painelVendaCarga().JrbSomSim().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaCarga().JrbSomSim()) {
            if (painelVendaCarga().JrbSomSim().isSelected()) {
                painelVendaCarga().JrbSomNao().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaCarga().JrbTravaEletricaNao()) {
            if (painelVendaCarga().JrbTravaEletricaNao().isSelected()) {
                painelVendaCarga().JrbTravaEletricaSim().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaCarga().JrbTravaEletricaSim()) {
            if (painelVendaCarga().JrbTravaEletricaSim().isSelected()) {
                painelVendaCarga().JrbTravaEletricaNao().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaCarga().JrbVidroEletricoNao()) {
            if (painelVendaCarga().JrbVidroEletricoNao().isSelected()) {
                painelVendaCarga().JrbVidroEletricoSim().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaCarga().JrbVidroEletricoSim()) {
            if (painelVendaCarga().JrbVidroEletricoSim().isSelected()) {
                painelVendaCarga().JrbVidroEletricoNao().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaCarga().JrbFormasPagamentoAVista()) {
            if (painelVendaCarga().JrbFormasPagamentoAVista().isSelected()) {
                painelVendaCarga().JrbFormasPagamentoFinanciamento().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaCarga().JrbFormasPagamentoFinanciamento()) {
            if (painelVendaCarga().JrbFormasPagamentoFinanciamento().isSelected()) {
                painelVendaCarga().JrbFormasPagamentoAVista().setSelected(false);
            }
        }
        int a = 0;
        if (ae.getSource() == painelVendaCarga().BtnCpfCliente()) {
            for (int j = 0; j < Arrays.Cliente().size(); j++) {
                if (painelVendaCarga().TxtCpfCliente().getText().equals(Arrays.Cliente().get(j).getCpf())) {
                    a = 1;
                    if (painelVendaCarga().JrbAlarmeSim().isSelected()) {
                        Arrays.CarroCarga().get(i).setValor_venda(Arrays.CarroCarga().get(i).getValor_venda() + (1500 * 1.226));
                    }
                    if (painelVendaCarga().JrbArSim().isSelected()) {
                        Arrays.CarroCarga().get(i).setValor_venda(Arrays.CarroCarga().get(i).getValor_venda() + (1500 * 1.226));
                    }
                    if (painelVendaCarga().JrbSomSim().isSelected()) {
                        Arrays.CarroCarga().get(i).setValor_venda(Arrays.CarroCarga().get(i).getValor_venda() + (1200 * 1.226));
                    }
                    if (painelVendaCarga().JrbTravaEletricaSim().isSelected()) {
                        Arrays.CarroCarga().get(i).setValor_venda(Arrays.CarroCarga().get(i).getValor_venda() + (292 * 1.226));
                    }
                    if (painelVendaCarga().JrbVidroEletricoSim().isSelected()) {
                        Arrays.CarroCarga().get(i).setValor_venda(Arrays.CarroCarga().get(i).getValor_venda() + (435 * 1.226));
                    }
                    if (painelVendaCarga().JrbFormasPagamentoFinanciamento().isSelected()) {
                        try {
                            String tipo = new String("Carga");
                            Arrays.lucroCarga += (Arrays.CarroCarga().get(i).getValor_venda() / 1.226) * 0.226;
                            Arrays.lucroTotal += (Arrays.CarroCarga().get(i).getValor_venda() / 1.226) * 0.226;
                            controladorTelaConclusaoVendaFinanciamento(i, tipo);
                        } catch (IOException ex) {
                            Logger.getLogger(ControladorTelaVendaCarga.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if (painelVendaCarga().JrbFormasPagamentoAVista().isSelected()) {
                        try {
                            String tipo = new String("Carga");
                            Arrays.lucroCarga += (Arrays.CarroCarga().get(i).getValor_venda() / 1.226) * 0.226;
                            Arrays.lucroTotal += (Arrays.CarroCarga().get(i).getValor_venda() / 1.226) * 0.226;
                            controladorTelaConclusaoVendaAVista(i, tipo);
                        } catch (IOException ex) {
                            Logger.getLogger(ControladorTelaVendaCarga.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
            if (a == 0) {
                try {
                    JOptionPane.showMessageDialog(concessionariaView(), "Cliente inexistente, corrija os dados ou faça o cadastro");
                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaVendaCarga.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public PainelVendaCarga painelVendaCarga() {
        if (painelVendaCarga == null) {
            painelVendaCarga = new PainelVendaCarga();
        }
        return painelVendaCarga;
    }

    public ControladorTelaCadastroCarga controladorTelaCadastroCarga() throws IOException {
        if (controladorTelaCadastroCarga == null) {
            controladorTelaCadastroCarga = new ControladorTelaCadastroCarga(painelCadastroCarga(), concessionariaView());
        }
        return controladorTelaCadastroCarga;
    }

    public PainelCadastroCarga painelCadastroCarga() {
        if (painelCadastroCarga == null) {
            painelCadastroCarga = new PainelCadastroCarga();
        }
        return painelCadastroCarga;
    }

    public ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }

    public ControladorTelaConclusaoVendaFinanciamento controladorTelaConclusaoVendaFinanciamento(int a, String tipo) throws IOException {
        if (controladorTelaConclusaoVendaFinanciamento == null) {
            controladorTelaConclusaoVendaFinanciamento = new ControladorTelaConclusaoVendaFinanciamento(painelConclusaoVendaFinanciamento(), concessionariaView(), a, tipo, login);
        }
        return controladorTelaConclusaoVendaFinanciamento;
    }

    public PainelConclusaoVendaFinanciamento painelConclusaoVendaFinanciamento() {
        if (painelConclusaoVendaFinanciamento == null) {
            painelConclusaoVendaFinanciamento = new PainelConclusaoVendaFinanciamento();
        }
        return painelConclusaoVendaFinanciamento;
    }

    public ControladorTelaConclusaoVendaAVista controladorTelaConclusaoVendaAVista(int a, String tipo) throws IOException {
        if (controladorTelaConclusaoVendaAVista == null) {
            controladorTelaConclusaoVendaAVista = new ControladorTelaConclusaoVendaAVista(painelConclusaoVendaAVista(), concessionariaView(), a, tipo, login);
        }
        return controladorTelaConclusaoVendaAVista;
    }

    public PainelConclusaoVendaAVista painelConclusaoVendaAVista() {
        if (painelConclusaoVendaAVista == null) {
            painelConclusaoVendaAVista = new PainelConclusaoVendaAVista();
        }
        return painelConclusaoVendaAVista;
    }
}
