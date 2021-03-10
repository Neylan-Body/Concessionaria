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
import model.Carga;
import model.PainelCadastroCarga;
import model.PainelInicio;
import model.PainelVendaCarga;
import model.TesteCadastroCarro;
import view.ConcessionariaView;

/**
 * 
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaCadastroCarga implements ActionListener {

    private static ControladorTelaInicial controladorTelaInicial;
    private TesteCadastroCarro testeCadastroCarro;
    private static ConcessionariaView concessionariaView;
    private static PainelCadastroCarga painelCadastroCarga;
    private static PainelInicio painelInicio;
    private static PainelVendaCarga painelVendaCarga;
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

    public ControladorTelaCadastroCarga(PainelCadastroCarga painelCadastroCarga, ConcessionariaView concessionariaView) {
        this.concessionariaView = concessionariaView;
        this.painelCadastroCarga = painelCadastroCarga;
        EventosTelaCadastroCarga();
    }

    private void EventosTelaCadastroCarga() {
        painelCadastroCarga().BtnCadastroCarga().addActionListener(this);
    }

    private void ZerarCarga() {

        painelCadastroCarga().TxtMarca().setText("");
        painelCadastroCarga().TxtModelo().setText("");
        painelCadastroCarga().TxtPotencia().setText("");
        painelCadastroCarga().TxtAnoFabricacao().setText("");
        painelCadastroCarga().TxtAnoModelo().setText("");
        painelCadastroCarga().TxtValor().setText("");
        painelCadastroCarga().TxtNumeroChassis().setText("");
        painelCadastroCarga().TxtTamanhoCarroceria().setText("");
        painelCadastroCarga().TxtPesoMaximoCarga().setText("");
        painelCadastroCarga().TxtPesoTotal().setText("");
        painelCadastroCarga().TxtAlturaCarga().setText("");

    }

    /**
     *
     * @param ae
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == painelCadastroCarga().BtnCadastroCarga()) {
            if (testeCadastroCarro().TelaCadastroCarga()) {
                marca = painelCadastroCarga().TxtMarca().getText();
                modelo = painelCadastroCarga().TxtModelo().getText();
                potencia = painelCadastroCarga().TxtPotencia().getText();
                ano_fabricacao = Integer.parseInt(painelCadastroCarga().TxtAnoFabricacao().getText());
                ano_modelo = Integer.parseInt(painelCadastroCarga().TxtAnoModelo().getText());
                valor_compra = Double.parseDouble(painelCadastroCarga().TxtValor().getText());
                valor_venda = valor_compra*1.226;
                chassis = painelCadastroCarga().TxtNumeroChassis().getText();
                tamanho_carroceria = painelCadastroCarga().TxtTamanhoCarroceria().getText();
                peso_maximo_carga = painelCadastroCarga().TxtPesoMaximoCarga().getText();
                peso_total = painelCadastroCarga().TxtPesoTotal().getText();
                altura_carga_maxima = painelCadastroCarga().TxtAlturaCarga().getText();

                Arrays.CarroCarga().add((new Carga(tamanho_carroceria, peso_maximo_carga,
                        peso_total, altura_carga_maxima, marca, modelo, potencia,
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
                    for (int i = 0; i < Arrays.CarroCarga().size(); i++) {
                        imp().println(Arrays.CarroCarga().get(i).getTamanho_carroceria());
                        imp().println(Arrays.CarroCarga().get(i).getPeso_maximo_carga());
                        imp().println(Arrays.CarroCarga().get(i).getPeso_total());
                        imp().println(Arrays.CarroCarga().get(i).getAltura_carga_maxima());
                        imp().println(Arrays.CarroCarga().get(i).getMarca());
                        imp().println(Arrays.CarroCarga().get(i).getModelo());
                        imp().println(Arrays.CarroCarga().get(i).getMotorizacao());
                        imp().println(Integer.toString(Arrays.CarroCarga().get(i).getAno_fabricacao()));
                        imp().println(Integer.toString(Arrays.CarroCarga().get(i).getAno_modelo()));
                        imp().println(Double.toString(Arrays.CarroCarga().get(i).getValor_compra()));
                        imp().println(Double.toString(Arrays.CarroCarga().get(i).getValor_venda()));
                        imp().println(Arrays.CarroCarga().get(i).getChassis());
                        imp().println();
                        imp().println();
                    }
                    imp().close();

                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaCadastroCarga.class.getName()).log(Level.SEVERE, null, ex);
                }
                ZerarCarga();
            } else {
                JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Falha no cadastro");
            }
        }
    }

    public static ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }

    public static PainelCadastroCarga painelCadastroCarga() {
        if (painelCadastroCarga == null) {
            painelCadastroCarga = new PainelCadastroCarga();
        }
        return painelCadastroCarga;
    }

    public static PainelInicio painelInicio() {
        if (painelInicio == null) {
            painelInicio = new PainelInicio();
        }
        return painelInicio;
    }

    public static PainelVendaCarga painelVendaCarga() {
        if (painelVendaCarga == null) {
            painelVendaCarga = new PainelVendaCarga();
        }
        return painelVendaCarga;
    }

    public static ControladorTelaInicial controladorTelaInicial() throws IOException {
        if (controladorTelaInicial == null) {
            controladorTelaInicial = new ControladorTelaInicial(concessionariaView());
        }
        return controladorTelaInicial;
    }

    public TesteCadastroCarro testeCadastroCarro() {
        if (testeCadastroCarro == null) {
            testeCadastroCarro = new TesteCadastroCarro(painelCadastroCarga(), null);
        }
        return testeCadastroCarro;
    }

    public File file() {
        if (file == null) {
            file = new File("Carros Carga.txt");
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
            ler = new FileReader("Carros Carga.txt");
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
