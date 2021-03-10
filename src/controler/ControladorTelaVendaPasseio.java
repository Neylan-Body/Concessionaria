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
import model.PainelCadastroPasseio;
import model.PainelConclusaoVendaAVista;
import model.PainelConclusaoVendaFinanciamento;
import model.PainelVendaPasseio;
import view.ConcessionariaView;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaVendaPasseio implements ActionListener {

    private PainelVendaPasseio painelVendaPasseio;
    private PainelCadastroPasseio painelCadastroPasseio;
    private PainelConclusaoVendaFinanciamento painelConclusaoVendaFinanciamento;
    private PainelConclusaoVendaAVista painelConclusaoVendaAVista;
    private ControladorTelaCadastroPasseio controladorTelaCadastroPasseio;
    private ConcessionariaView concessionariaView;
    private ControladorTelaConclusaoVendaFinanciamento controladorTelaConclusaoVendaFinanciamento;
    private ControladorTelaConclusaoVendaAVista controladorTelaConclusaoVendaAVista;
    String login;

    public ControladorTelaVendaPasseio(PainelVendaPasseio painelVendaPasseio, ConcessionariaView concessionariaView, String login) throws IOException {
        this.login = login;
        this.concessionariaView = concessionariaView;
        this.painelVendaPasseio = painelVendaPasseio;
        concessionariaView().setContentPane(painelVendaPasseio().PainelVendaPasseio());
        concessionariaView().repaint();
        concessionariaView().validate();
        for (int i = 0; i < Arrays.CarroPasseio().size(); i++) {
            painelVendaPasseio().ListaCarroPasseio().addItem(Arrays.CarroPasseio().get(i).getModelo());
        }
        painelVendaPasseio().ListaCarroPasseio().addActionListener(this);
        painelVendaPasseio().JrbAlarmeNao().addActionListener(this);
        painelVendaPasseio().JrbAlarmeSim().addActionListener(this);
        painelVendaPasseio().JrbArNao().addActionListener(this);
        painelVendaPasseio().JrbArSim().addActionListener(this);
        painelVendaPasseio().JrbSomNao().addActionListener(this);
        painelVendaPasseio().JrbSomSim().addActionListener(this);
        painelVendaPasseio().JrbTravaEletricaNao().addActionListener(this);
        painelVendaPasseio().JrbTravaEletricaSim().addActionListener(this);
        painelVendaPasseio().JrbVidroEletricoNao().addActionListener(this);
        painelVendaPasseio().JrbVidroEletricoSim().addActionListener(this);
        painelVendaPasseio().JrbFormasPagamentoAVista().addActionListener(this);
        painelVendaPasseio().JrbFormasPagamentoFinanciamento().addActionListener(this);
        painelVendaPasseio().BtnCpfCliente().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int i = painelVendaPasseio().ListaCarroPasseio().getSelectedIndex();
        if (ae.getSource() == painelVendaPasseio().ListaCarroPasseio()) {
            painelVendaPasseio().LblAnoFabricacao().setText(Integer.toString(Arrays.CarroPasseio().get(i).getAno_fabricacao()));
            painelVendaPasseio().LblAnoModelo().setText(Integer.toString(Arrays.CarroPasseio().get(i).getAno_modelo()));
            painelVendaPasseio().LblLitragemPortaMalas().setText(Integer.toString(Arrays.CarroPasseio().get(i).getLitragem_porta_mala()));
            painelVendaPasseio().LblNumeroPassageiros().setText(Integer.toString(Arrays.CarroPasseio().get(i).getNum_passageiros()));
            painelVendaPasseio().LblMarca().setText(Arrays.CarroPasseio().get(i).getMarca());
            painelVendaPasseio().LblModelo().setText(Arrays.CarroPasseio().get(i).getModelo());
            painelVendaPasseio().LblNumeroChassis().setText(Arrays.CarroPasseio().get(i).getChassis());
            painelVendaPasseio().LblPotencia().setText(Arrays.CarroPasseio().get(i).getMotorizacao());
        }
        if (ae.getSource() == painelVendaPasseio().JrbAlarmeNao()) {
            if (painelVendaPasseio().JrbAlarmeNao().isSelected()) {
                painelVendaPasseio().JrbAlarmeSim().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaPasseio().JrbAlarmeSim()) {
            if (painelVendaPasseio().JrbAlarmeSim().isSelected()) {
                painelVendaPasseio().JrbAlarmeNao().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaPasseio().JrbArNao()) {
            if (painelVendaPasseio().JrbArNao().isSelected()) {
                painelVendaPasseio().JrbArSim().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaPasseio().JrbArSim()) {
            if (painelVendaPasseio().JrbArSim().isSelected()) {
                painelVendaPasseio().JrbArNao().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaPasseio().JrbSomNao()) {
            if (painelVendaPasseio().JrbSomNao().isSelected()) {
                painelVendaPasseio().JrbSomSim().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaPasseio().JrbSomSim()) {
            if (painelVendaPasseio().JrbSomSim().isSelected()) {
                painelVendaPasseio().JrbSomNao().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaPasseio().JrbTravaEletricaNao()) {
            if (painelVendaPasseio().JrbTravaEletricaNao().isSelected()) {
                painelVendaPasseio().JrbTravaEletricaSim().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaPasseio().JrbTravaEletricaSim()) {
            if (painelVendaPasseio().JrbTravaEletricaSim().isSelected()) {
                painelVendaPasseio().JrbTravaEletricaNao().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaPasseio().JrbVidroEletricoNao()) {
            if (painelVendaPasseio().JrbVidroEletricoNao().isSelected()) {
                painelVendaPasseio().JrbVidroEletricoSim().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaPasseio().JrbVidroEletricoSim()) {
            if (painelVendaPasseio().JrbVidroEletricoSim().isSelected()) {
                painelVendaPasseio().JrbVidroEletricoNao().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaPasseio().JrbFormasPagamentoAVista()) {
            if (painelVendaPasseio().JrbFormasPagamentoAVista().isSelected()) {
                painelVendaPasseio().JrbFormasPagamentoFinanciamento().setSelected(false);
            }
        }
        if (ae.getSource() == painelVendaPasseio().JrbFormasPagamentoFinanciamento()) {
            if (painelVendaPasseio().JrbFormasPagamentoFinanciamento().isSelected()) {
                painelVendaPasseio().JrbFormasPagamentoAVista().setSelected(false);
            }
        }
        int a = 0;
        if (ae.getSource() == painelVendaPasseio().BtnCpfCliente()) {
            for (int j = 0; j < Arrays.Cliente().size(); j++) {
                if (painelVendaPasseio().TxtCpfCliente().getText().equals(Arrays.Cliente().get(j).getCpf())) {
                    a = 1;
                    if (painelVendaPasseio().JrbAlarmeSim().isSelected()) {
                        Arrays.CarroPasseio().get(i).setValor_venda(Arrays.CarroPasseio().get(i).getValor_venda() + (1500 * 1.36));
                    }
                    if (painelVendaPasseio().JrbArSim().isSelected()) {
                        Arrays.CarroPasseio().get(i).setValor_venda(Arrays.CarroPasseio().get(i).getValor_venda() + (1500 * 1.36));
                    }
                    if (painelVendaPasseio().JrbSomSim().isSelected()) {
                        Arrays.CarroPasseio().get(i).setValor_venda(Arrays.CarroPasseio().get(i).getValor_venda() + (1200 * 1.36));
                    }
                    if (painelVendaPasseio().JrbTravaEletricaSim().isSelected()) {
                        Arrays.CarroPasseio().get(i).setValor_venda(Arrays.CarroPasseio().get(i).getValor_venda() + (292 * 1.36));
                    }
                    if (painelVendaPasseio().JrbVidroEletricoSim().isSelected()) {
                        Arrays.CarroPasseio().get(i).setValor_venda(Arrays.CarroPasseio().get(i).getValor_venda() + (435 * 1.36));
                    }
                    if (painelVendaPasseio().JrbFormasPagamentoFinanciamento().isSelected()) {
                        try {
                            String tipo = new String("Passeio");
                            Arrays.lucroPasseio += (Arrays.CarroPasseio().get(i).getValor_venda() / 1.36) * 0.36;
                            Arrays.lucroTotal += (Arrays.CarroPasseio().get(i).getValor_venda() / 1.36) * 0.36;
                            controladorTelaConclusaoVendaFinanciamento(i, tipo);
                        } catch (IOException ex) {
                            Logger.getLogger(ControladorTelaVendaPasseio.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if (painelVendaPasseio().JrbFormasPagamentoAVista().isSelected()) {
                        try {
                            String tipo = new String("Passeio");
                            Arrays.lucroPasseio += (Arrays.CarroPasseio().get(i).getValor_venda() / 1.36) * 0.36;
                            Arrays.lucroTotal += (Arrays.CarroPasseio().get(i).getValor_venda() / 1.36) * 0.36;
                            controladorTelaConclusaoVendaAVista(i, tipo);
                        } catch (IOException ex) {
                            Logger.getLogger(ControladorTelaVendaPasseio.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
            if (a == 0) {
                try {
                    JOptionPane.showMessageDialog(concessionariaView(), "Cliente inexistente, faça o cadastro");
                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaVendaPasseio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public PainelVendaPasseio painelVendaPasseio() {
        if (painelVendaPasseio == null) {
            painelVendaPasseio = new PainelVendaPasseio();
        }
        return painelVendaPasseio;
    }

    public ControladorTelaCadastroPasseio controladorTelaCadastroPasseio() throws IOException {
        if (controladorTelaCadastroPasseio == null) {
            controladorTelaCadastroPasseio = new ControladorTelaCadastroPasseio(painelCadastroPasseio(), concessionariaView());
        }
        return controladorTelaCadastroPasseio;
    }

    public ControladorTelaConclusaoVendaFinanciamento controladorTelaConclusaoVendaFinanciamento(int a, String tipo) throws IOException {
        if (controladorTelaConclusaoVendaFinanciamento == null) {
            controladorTelaConclusaoVendaFinanciamento = new ControladorTelaConclusaoVendaFinanciamento(painelConclusaoVendaFinanciamento(), concessionariaView(), a, tipo, login);
        }
        return controladorTelaConclusaoVendaFinanciamento;
    }

    public PainelCadastroPasseio painelCadastroPasseio() {
        if (painelCadastroPasseio == null) {
            painelCadastroPasseio = new PainelCadastroPasseio();
        }
        return painelCadastroPasseio;
    }

    public ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
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
