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
import model.Cliente;
import model.PainelCadastroCliente;
import model.TesteCadastroCliente;
import view.ConcessionariaView;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaCadastroCliente implements ActionListener {

    private PainelCadastroCliente painelCadastroCliente;
    private TesteCadastroCliente testeCadastroCliente;
    private ConcessionariaView concessionariaView;
    private File file;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader ler;
    private BufferedReader reader;
    private PrintWriter imp;

    public ControladorTelaCadastroCliente(PainelCadastroCliente painelCadastroCliente, ConcessionariaView concessionariaView) {
        this.concessionariaView = concessionariaView;
        this.painelCadastroCliente = painelCadastroCliente;
        Eventos();
    }

    public void Eventos() {
        painelCadastroCliente().BtnCadastroCliente().addActionListener(this);
    }

    private void ZerarCliente() {
        painelCadastroCliente().TxtBairro().setText("");
        painelCadastroCliente().TxtCidade().setText("");
        painelCadastroCliente().TxtCpf().setText("");
        painelCadastroCliente().TxtEstado().setText("");
        painelCadastroCliente().TxtNome().setText("");
        painelCadastroCliente().TxtNumero().setText("");
        painelCadastroCliente().TxtRg().setText("");
        painelCadastroCliente().TxtRua().setText("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == painelCadastroCliente().BtnCadastroCliente()) {
            if (testeCadastroCliente().TelaCadastroCliente()) {
                Arrays.Cliente().add(new Cliente(painelCadastroCliente().TxtNome().getText(), painelCadastroCliente().TxtCpf().getText(),
                        painelCadastroCliente().TxtRg().getText(), painelCadastroCliente().TxtRua().getText(),
                        painelCadastroCliente().TxtBairro().getText(), Integer.parseInt(painelCadastroCliente().TxtNumero().getText()),
                        painelCadastroCliente().TxtCidade().getText(), painelCadastroCliente().TxtEstado().getText()));

                try {
                    if (!file().exists()) {
                        file().createNewFile();
                    } else {
                        file().delete();
                        file().createNewFile();
                        imp = null;
                    }
                    for (int i = 0; i < Arrays.Cliente().size(); i++) {
                        imp().println(Arrays.Cliente().get(i).getNome());
                        imp().println(Arrays.Cliente().get(i).getCpf());
                        imp().println(Arrays.Cliente().get(i).getRg());
                        imp().println(Arrays.Cliente().get(i).getRua());
                        imp().println(Arrays.Cliente().get(i).getBairro());
                        imp().println(Integer.toString(Arrays.Cliente().get(i).getNumeroEndereco()));
                        imp().println(Arrays.Cliente().get(i).getCidade());
                        imp().println(Arrays.Cliente().get(i).getEstado());
                        imp().println();
                        imp().println();
                    }
                    imp().close();

                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                ZerarCliente();
            } else {
                JOptionPane.showMessageDialog(painelCadastroCliente().PainelCadastroCliente(), "Falha no cadastro");
            }
        }
    }

    public PainelCadastroCliente painelCadastroCliente() {
        if (painelCadastroCliente == null) {
            painelCadastroCliente = new PainelCadastroCliente();
        }
        return painelCadastroCliente;
    }

    public TesteCadastroCliente testeCadastroCliente() {
        if (testeCadastroCliente == null) {
            testeCadastroCliente = new TesteCadastroCliente(painelCadastroCliente());
        }
        return testeCadastroCliente;
    }
    
    public ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }

    public File file() {
        if (file == null) {
            file = new File("Clientes.txt");
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
            ler = new FileReader("Clientes.txt");
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
