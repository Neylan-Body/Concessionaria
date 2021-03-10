/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Arrays;
import model.PainelConclusaoVendaFinanciamento;
import model.PainelVendedor;
import view.ConcessionariaView;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaConclusaoVendaFinanciamento implements ActionListener {

    private PainelConclusaoVendaFinanciamento painelConclusaoVendaFinanciamento;
    private PainelVendedor painelVendedor;
    private ControladorTelaVendedor controladorTelaVendedor;
    private ConcessionariaView concessionariaView;
    private File filePasseio;
    private FileWriter fwPasseio;
    private BufferedWriter bwPasseio;
    private FileReader lerPasseio;
    private BufferedReader readerPasseio;
    private PrintWriter impPasseio;
    private File fileCarga;
    private FileWriter fwCarga;
    private BufferedWriter bwCarga;
    private FileReader lerCarga;
    private BufferedReader readerCarga;
    private PrintWriter impCarga;
    double valorMensal = 0;
    int qtde = 0;
    int a = 0;
    String tipo, login;

    public ControladorTelaConclusaoVendaFinanciamento(PainelConclusaoVendaFinanciamento painelConclusaoVendaFinanciamento, ConcessionariaView concessionariaView, int a, String tipo, String login) throws IOException {
        this.concessionariaView = concessionariaView;
        this.painelConclusaoVendaFinanciamento = painelConclusaoVendaFinanciamento;
        this.login = login;
        this.a = a;
        this.tipo = tipo;
        concessionariaView().setContentPane(painelConclusaoVendaFinanciamento().painelConclusaoVendaFinanciamento());
        concessionariaView().repaint();
        concessionariaView().validate();
        Eventos();
    }

    public void Eventos() {
        painelConclusaoVendaFinanciamento().BtnSimular().addActionListener(this);
        painelConclusaoVendaFinanciamento().BtnVender().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == painelConclusaoVendaFinanciamento().BtnSimular()) {
            try {
                if (tipo.equals("Carga")) {
                    qtde = Integer.parseInt(painelConclusaoVendaFinanciamento().SpParcelas().getValue().toString());
                    valorMensal = (Arrays.CarroCarga().get(a).getValor_venda() / qtde);
                    valorMensal *= 1.0218;
                }
                if (tipo.equals("Passeio")) {
                    qtde = Integer.parseInt(painelConclusaoVendaFinanciamento().SpParcelas().getValue().toString());
                    valorMensal = (Arrays.CarroPasseio().get(a).getValor_venda() / qtde);
                    valorMensal *= 1.0218;
                }
                painelConclusaoVendaFinanciamento().LblValorParcelas1().setText(Double.toString(valorMensal));
                painelConclusaoVendaFinanciamento().LblValorVeiculo1().setText(Double.toString(valorMensal * qtde));
                concessionariaView().repaint();
                concessionariaView().validate();
                painelConclusaoVendaFinanciamento().BtnVender().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(ControladorTelaConclusaoVendaFinanciamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (ae.getSource() == painelConclusaoVendaFinanciamento().BtnVender()) {
            try {
                if (tipo.equals("Carga")) {
                    for (int i = 0; i < Arrays.VendedorSalario().size(); i++) {
                        if (Arrays.VendedorSalario().get(i).getLogin().equals(login)) {
                            Arrays.acumuladoCarga += valorMensal * qtde;
                            Arrays.acumulado += valorMensal * qtde;
                            Arrays.carrosVendidos++;
                            Arrays.carrosVendidosCarga++;
                            Arrays.VendedorSalario().get(i).setCarrosCarga(Arrays.VendedorSalario().get(i).getCarrosCarga() + 1);
                            Arrays.VendedorSalario().get(i).setVenda((Arrays.VendedorSalario().get(i).getVenda()) + (valorMensal * qtde));
                            if (Arrays.Vendedor().get(i).getLogin().equals(login)) {
                                if (Arrays.VendedorSalario().get(i).getA() == 0) {
                                    Arrays.Vendedor().get(i).setSalario(((valorMensal * qtde) * 0.05) + Arrays.Vendedor().get(i).getSalario());
                                }
                                if (Arrays.VendedorSalario().get(i).getVenda() > Arrays.Vendedor().get(i).getMeta()) {
                                    Arrays.VendedorSalario().get(i).setA(1);
                                }
                                while (Arrays.VendedorSalario().get(i).getVenda() > Arrays.Vendedor().get(i).getMeta() + 10000) {
                                    Arrays.Vendedor().get(i).setSalario(200 + Arrays.Vendedor().get(i).getSalario());
                                    Arrays.Vendedor().get(i).setMeta(Arrays.Vendedor().get(i).getMeta() + 10000);
                                }
                            }
                        }
                    }
                    Arrays.CarroCarga().remove(a);
                    try {
                        if (!fileCarga().exists()) {
                            fileCarga().createNewFile();
                        } else {
                            fileCarga().delete();
                            fileCarga().createNewFile();
                            impCarga = null;
                        }
                        for (int i = 0; i < Arrays.CarroCarga().size(); i++) {
                            impCarga().println(Arrays.CarroCarga().get(i).getTamanho_carroceria());
                            impCarga().println(Arrays.CarroCarga().get(i).getPeso_maximo_carga());
                            impCarga().println(Arrays.CarroCarga().get(i).getPeso_total());
                            impCarga().println(Arrays.CarroCarga().get(i).getAltura_carga_maxima());
                            impCarga().println(Arrays.CarroCarga().get(i).getMarca());
                            impCarga().println(Arrays.CarroCarga().get(i).getModelo());
                            impCarga().println(Arrays.CarroCarga().get(i).getMotorizacao());
                            impCarga().println(Integer.toString(Arrays.CarroCarga().get(i).getAno_fabricacao()));
                            impCarga().println(Integer.toString(Arrays.CarroCarga().get(i).getAno_modelo()));
                            impCarga().println(Double.toString(Arrays.CarroCarga().get(i).getValor_compra()));
                            impCarga().println(Double.toString(Arrays.CarroCarga().get(i).getValor_venda()));
                            impCarga().println(Arrays.CarroCarga().get(i).getChassis());
                            impCarga().println();
                            impCarga().println();
                        }
                        impCarga().close();

                    } catch (IOException ex) {
                        Logger.getLogger(ControladorTelaCadastroCarga.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (tipo.equals("Passeio")) {
                    for (int i = 0; i < Arrays.VendedorSalario().size(); i++) {
                        if (Arrays.VendedorSalario().get(i).getLogin().equals(login)) {
                            Arrays.acumulado += valorMensal * qtde;
                            Arrays.acumuladoPasseio += valorMensal * qtde;
                            Arrays.carrosVendidos++;
                            Arrays.carrosVendidosPasseio++;
                            Arrays.VendedorSalario().get(i).setCarrosPasseio(Arrays.VendedorSalario().get(i).getCarrosPasseio() + 1);
                            Arrays.VendedorSalario().get(i).setVenda((Arrays.VendedorSalario().get(i).getVenda()) + (valorMensal * qtde));
                            if (Arrays.Vendedor().get(i).getLogin().equals(login)) {
                                if ((Arrays.Vendedor().get(i).getMeta() <= Arrays.VendedorSalario().get(i).getVenda()) && (Arrays.VendedorSalario().get(i).getA() == 0)) {
                                    Arrays.Vendedor().get(i).setSalario(((valorMensal * qtde) * 0.05) + Arrays.Vendedor().get(i).getSalario());
                                    Arrays.VendedorSalario().get(i).setA(1);
                                }
                                while (Arrays.VendedorSalario().get(i).getVenda() > Arrays.Vendedor().get(i).getMeta() + 10000) {
                                    Arrays.Vendedor().get(i).setSalario(Arrays.Vendedor().get(i).getComissao() + Arrays.Vendedor().get(i).getSalario());
                                    Arrays.Vendedor().get(i).setMeta(Arrays.Vendedor().get(i).getMeta() + 10000);
                                }
                            }
                        }
                    }
                    Arrays.CarroPasseio().remove(a);
                    try {
                        if (!filePasseio().exists()) {
                            filePasseio().createNewFile();
                        } else {
                            filePasseio().delete();
                            filePasseio().createNewFile();
                            impPasseio = null;
                        }
                        for (int i = 0; i < Arrays.CarroPasseio().size(); i++) {
                            impPasseio().println(Arrays.CarroPasseio().get(i).getLitragem_porta_mala());
                            impPasseio().println(Arrays.CarroPasseio().get(i).getNum_passageiros());
                            impPasseio().println(Arrays.CarroPasseio().get(i).getMarca());
                            impPasseio().println(Arrays.CarroPasseio().get(i).getModelo());
                            impPasseio().println(Arrays.CarroPasseio().get(i).getMotorizacao());
                            impPasseio().println(Integer.toString(Arrays.CarroPasseio().get(i).getAno_fabricacao()));
                            impPasseio().println(Integer.toString(Arrays.CarroPasseio().get(i).getAno_modelo()));
                            impPasseio().println(Double.toString(Arrays.CarroPasseio().get(i).getValor_compra()));
                            impPasseio().println(Double.toString(Arrays.CarroPasseio().get(i).getValor_venda()));
                            impPasseio().println(Arrays.CarroPasseio().get(i).getChassis());
                            impPasseio().println();
                            impPasseio().println();
                        }
                        impPasseio().close();
                    } catch (IOException ex) {
                        Logger.getLogger(ControladorTelaCadastroPasseio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                controladorTelaVendedor = null;
                controladorTelaVendedor();
            } catch (IOException ex) {
                Logger.getLogger(ControladorTelaConclusaoVendaFinanciamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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

    public PainelVendedor painelVendedor() {
        if (painelVendedor == null) {
            painelVendedor = new PainelVendedor();
        }
        return painelVendedor;
    }

    public ControladorTelaVendedor controladorTelaVendedor() throws IOException {
        if (controladorTelaVendedor == null) {
            controladorTelaVendedor = new ControladorTelaVendedor(painelVendedor(), concessionariaView(), login);
        }
        return controladorTelaVendedor;
    }

    public File filePasseio() {
        if (filePasseio == null) {
            filePasseio = new File("Carros Passeio.txt");
        }
        return filePasseio;
    }

    public FileWriter fwPasseio() throws IOException {
        if (fwPasseio == null) {
            fwPasseio = new FileWriter(filePasseio().getAbsoluteFile());
        }
        return fwPasseio;
    }

    public BufferedWriter bwPasseio() throws IOException {
        if (bwPasseio == null) {
            bwPasseio = new BufferedWriter(fwPasseio());
        }
        return bwPasseio;
    }

    public FileReader lerPasseio() throws FileNotFoundException {
        if (lerPasseio == null) {
            lerPasseio = new FileReader("Carros Passeio.txt");
        }
        return lerPasseio;
    }

    public BufferedReader readerPasseio() throws FileNotFoundException {
        if (readerPasseio == null) {
            readerPasseio = new BufferedReader(lerPasseio());
        }
        return readerPasseio;
    }

    public PrintWriter impPasseio() throws FileNotFoundException {
        if (impPasseio == null) {
            impPasseio = new PrintWriter(filePasseio());
        }
        return impPasseio;
    }

    public File fileCarga() {
        if (fileCarga == null) {
            fileCarga = new File("Carros Carga.txt");
        }
        return fileCarga;
    }

    public FileWriter fwCarga() throws IOException {
        if (fwCarga == null) {
            fwCarga = new FileWriter(fileCarga().getAbsoluteFile());
        }
        return fwCarga;
    }

    public BufferedWriter bwCarga() throws IOException {
        if (bwCarga == null) {
            bwCarga = new BufferedWriter(fwCarga());
        }
        return bwCarga;
    }

    public FileReader lerCarga() throws FileNotFoundException {
        if (lerCarga == null) {
            lerCarga = new FileReader("Carros Carga.txt");
        }
        return lerCarga;
    }

    public BufferedReader readerCarga() throws FileNotFoundException {
        if (readerCarga == null) {
            readerCarga = new BufferedReader(lerCarga());
        }
        return readerCarga;
    }

    public PrintWriter impCarga() throws FileNotFoundException {
        if (impCarga == null) {
            impCarga = new PrintWriter(fileCarga());
        }
        return impCarga;
    }
}
