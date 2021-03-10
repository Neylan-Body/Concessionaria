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
import javax.swing.JOptionPane;
import model.Arrays;
import view.ConcessionariaView;
import model.PainelCadastroPasseio;
import model.PainelInicio;
import model.PainelVendaPasseio;
import model.Passeio;
import model.TesteCadastroCarro;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaCadastroPasseio implements ActionListener {

    private static ControladorTelaInicial controladorTelaInicial;
    private static ConcessionariaView concessionariaView;
    private static PainelCadastroPasseio painelCadastroPasseio;
    private static PainelVendaPasseio painelVendaPasseio;
    private static PainelInicio painelInicio;
    private TesteCadastroCarro testeCadastroCarro;
    private File file;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader ler;
    private BufferedReader reader;
    private PrintWriter imp;
    String marca;
    String modelo;
    String potencia;
    String chassis;
    String tamanho_carroceria;
    String peso_maximo_carga;
    String peso_total;
    String altura_carga_maxima;
    int ano_fabricacao = 0;
    int ano_modelo = 0;
    double valor_compra = 0;
    double valor_venda = 0;
    int numPassageiros = 0;
    int litragemPortaMalas = 0;

    public ControladorTelaCadastroPasseio(PainelCadastroPasseio painelCadastroPasseio, ConcessionariaView concessionariaView) {
        this.concessionariaView = concessionariaView;
        this.painelCadastroPasseio = painelCadastroPasseio;
        EventosTelaCadastroPasseio();
    }

    private void EventosTelaCadastroPasseio() {
        painelCadastroPasseio().BtnCadastroPasseio().addActionListener(this);
    }

    private void ZerarPasseio() {
        painelCadastroPasseio().TxtMarca().setText("");
        painelCadastroPasseio().TxtModelo().setText("");
        painelCadastroPasseio().TxtPotencia().setText("");
        painelCadastroPasseio().TxtAnoFabricacao().setText("");
        painelCadastroPasseio().TxtAnoModelo().setText("");
        painelCadastroPasseio().TxtValor().setText("");
        painelCadastroPasseio().TxtNumeroChassis().setText("");
        painelCadastroPasseio().TxtLitragemPortaMalas().setText("");
        painelCadastroPasseio().TxtNumeroPassageiros().setText("");
    }

    /**
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == painelCadastroPasseio().BtnCadastroPasseio()) {
            if (testeCadastroCarro().TelaCadastroPasseio()) {
                marca = painelCadastroPasseio().TxtMarca().getText();
                modelo = painelCadastroPasseio().TxtModelo().getText();
                potencia = painelCadastroPasseio().TxtPotencia().getText();
                ano_fabricacao = Integer.parseInt(painelCadastroPasseio().TxtAnoFabricacao().getText());
                ano_modelo = Integer.parseInt(painelCadastroPasseio().TxtAnoModelo().getText());
                valor_compra = Double.parseDouble(painelCadastroPasseio().TxtValor().getText());
                valor_venda = valor_compra*1.36;
                chassis = painelCadastroPasseio().TxtNumeroChassis().getText();
                litragemPortaMalas = Integer.parseInt(painelCadastroPasseio().TxtLitragemPortaMalas().getText());
                numPassageiros = Integer.parseInt(painelCadastroPasseio().TxtNumeroPassageiros().getText());

                Arrays.CarroPasseio().add((new Passeio(litragemPortaMalas, numPassageiros, marca, modelo, potencia,
                        ano_fabricacao, ano_modelo, valor_compra, valor_venda, chassis,
                        false, false, false, false, false)));
                try {
                    if (!file().exists()) {
                        file().createNewFile();
                    } else {
                        file().delete();
                        file().createNewFile();
                        imp = null;
                    }
                    for (int i = 0; i < Arrays.CarroPasseio().size(); i++) {
                        imp().println(Arrays.CarroPasseio().get(i).getLitragem_porta_mala());
                        imp().println(Arrays.CarroPasseio().get(i).getNum_passageiros());
                        imp().println(Arrays.CarroPasseio().get(i).getMarca());
                        imp().println(Arrays.CarroPasseio().get(i).getModelo());
                        imp().println(Arrays.CarroPasseio().get(i).getMotorizacao());
                        imp().println(Integer.toString(Arrays.CarroPasseio().get(i).getAno_fabricacao()));
                        imp().println(Integer.toString(Arrays.CarroPasseio().get(i).getAno_modelo()));
                        imp().println(Double.toString(Arrays.CarroPasseio().get(i).getValor_compra()));
                        imp().println(Double.toString(Arrays.CarroPasseio().get(i).getValor_venda()));
                        imp().println(Arrays.CarroPasseio().get(i).getChassis());
                        imp().println();
                        imp().println();
                    }
                    imp().close();
                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaCadastroPasseio.class.getName()).log(Level.SEVERE, null, ex);
                }
                ZerarPasseio();
            } else {
                JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Falha no cadastro");
            }
        }
    }

    public static PainelVendaPasseio painelVendaPasseio() {
        if (painelVendaPasseio == null) {
            painelVendaPasseio = new PainelVendaPasseio();
        }
        return painelVendaPasseio;
    }

    public static ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }

    public static PainelCadastroPasseio painelCadastroPasseio() {
        if (painelCadastroPasseio == null) {
            painelCadastroPasseio = new PainelCadastroPasseio();
        }
        return painelCadastroPasseio;
    }

    public static PainelInicio painelInicio() {
        if (painelInicio == null) {
            painelInicio = new PainelInicio();
        }
        return painelInicio;
    }

    public static ControladorTelaInicial controladorTelaInicial() throws IOException {
        if (controladorTelaInicial == null) {
            controladorTelaInicial = new ControladorTelaInicial(concessionariaView());
        }
        return controladorTelaInicial;
    }

    public TesteCadastroCarro testeCadastroCarro() {
        if (testeCadastroCarro == null) {
            testeCadastroCarro = new TesteCadastroCarro(null, painelCadastroPasseio());
        }
        return testeCadastroCarro;
    }

    public File file() {
        if (file == null) {
            file = new File("Carros Passeio.txt");
        }
        return file;
    }

    public FileWriter fw() throws IOException {
        if (fw == null) {
            fw = new FileWriter(file().getAbsoluteFile());
        }
        return fw;
    }

    public BufferedWriter bw() throws IOException {
        if (bw == null) {
            bw = new BufferedWriter(fw());
        }
        return bw;
    }

    public FileReader ler() throws FileNotFoundException {
        if (ler == null) {
            ler = new FileReader("Carros Passeio.txt");
        }
        return ler;
    }

    public BufferedReader reader() throws FileNotFoundException {
        if (reader == null) {
            reader = new BufferedReader(ler());
        }
        return reader;
    }

    public PrintWriter imp() throws FileNotFoundException {
        if (imp == null) {
            imp = new PrintWriter(file());
        }
        return imp;
    }
}
