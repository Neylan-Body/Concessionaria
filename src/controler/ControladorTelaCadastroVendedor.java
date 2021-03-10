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
import model.PainelCadastroVendedor;
import model.Salario;
import model.TesteCadastroVendedor;
import model.Vendedor;
import view.ConcessionariaView;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaCadastroVendedor implements ActionListener {

    private PainelCadastroVendedor painelCadastroVendedor;
    private ConcessionariaView concessionariaView;
    private TesteCadastroVendedor testeCadastroVendedor;
    private File file;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader ler;
    private BufferedReader reader;
    private PrintWriter imp;

    public ControladorTelaCadastroVendedor(PainelCadastroVendedor painelCadastroVendedor, ConcessionariaView concessionariaView) {
        this.concessionariaView = concessionariaView;
        this.painelCadastroVendedor = painelCadastroVendedor;
        Eventos();
    }

    private void ZerarVendedor() {
        painelCadastroVendedor().TxtAgencia().setText("");
        painelCadastroVendedor().TxtBairro().setText("");
        painelCadastroVendedor().TxtCidade().setText("");
        painelCadastroVendedor().TxtComissao().setText("");
        painelCadastroVendedor().TxtConta().setText("");
        painelCadastroVendedor().TxtData_admissao().setText("");
        painelCadastroVendedor().TxtEstado().setText("");
        painelCadastroVendedor().TxtLogin().setText("");
        painelCadastroVendedor().TxtMeta().setText("");
        painelCadastroVendedor().TxtNome().setText("");
        painelCadastroVendedor().TxtNumeroEndereco().setText("");
        painelCadastroVendedor().TxtRua().setText("");
        painelCadastroVendedor().TxtSalario().setText("");
        painelCadastroVendedor().TxtSenha().setText("");
    }

    public void Eventos() {
        painelCadastroVendedor().BtnCadastroVendedor().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == painelCadastroVendedor().BtnCadastroVendedor()) {
            if (testeCadastroVendedor().TelaCadastroVendedor()) {
                Arrays.Vendedor().add(new Vendedor(painelCadastroVendedor().TxtNome().getText(), painelCadastroVendedor().TxtRua().getText(),
                        painelCadastroVendedor().TxtBairro().getText(), Integer.parseInt(painelCadastroVendedor().TxtNumeroEndereco().getText()),
                        painelCadastroVendedor().TxtCidade().getText(), painelCadastroVendedor().TxtEstado().getText(), painelCadastroVendedor().TxtAgencia().getText(),
                        painelCadastroVendedor().TxtConta().getText(), Double.parseDouble(painelCadastroVendedor().TxtSalario().getText()),
                        painelCadastroVendedor().TxtData_admissao().getText(), Double.parseDouble(painelCadastroVendedor().TxtMeta().getText()),
                        Double.parseDouble(painelCadastroVendedor().TxtComissao().getText()), painelCadastroVendedor().TxtLogin().getText(),
                        painelCadastroVendedor().TxtSenha().getText()));
                String nome = painelCadastroVendedor().TxtNome().getText();
                String login = painelCadastroVendedor().TxtLogin().getText();
                double sal = Double.parseDouble(painelCadastroVendedor().TxtSalario().getText());
                Arrays.VendedorSalario().add((new Salario(nome, login, sal, 0, 0, 0, 0, 0)));

                try {
                    if (!file().exists()) {
                        file().createNewFile();
                    } else {
                        file().delete();
                        file().createNewFile();
                        imp = null;
                    }
                    for (int i = 0; i < Arrays.Vendedor().size(); i++) {
                        imp().println(Arrays.Vendedor().get(i).getNome());
                        imp().println(Arrays.Vendedor().get(i).getRua());
                        imp().println(Arrays.Vendedor().get(i).getBairro());
                        imp().println(Arrays.Vendedor().get(i).getNumeroEndereco());
                        imp().println(Arrays.Vendedor().get(i).getCidade());
                        imp().println(Arrays.Vendedor().get(i).getEstado());
                        imp().println(Arrays.Vendedor().get(i).getAgencia());
                        imp().println(Arrays.Vendedor().get(i).getConta());
                        imp().println(Arrays.Vendedor().get(i).getSalario());
                        imp().println(Arrays.Vendedor().get(i).getData_admissao());
                        imp().println(Arrays.Vendedor().get(i).getMeta());
                        imp().println(Arrays.Vendedor().get(i).getComissao());
                        imp().println(Arrays.Vendedor().get(i).getLogin());
                        imp().println(Arrays.Vendedor().get(i).getSenha());
                        imp().println();
                        imp().println();
                    }
                    imp().close();

                } catch (IOException ex) {
                    Logger.getLogger(ControladorTelaCadastroVendedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                ZerarVendedor();
            } else {
                JOptionPane.showMessageDialog(painelCadastroVendedor().PainelCadastroVendedor(), "Falha no cadastro");
            }
        }
    }

    public PainelCadastroVendedor painelCadastroVendedor() {
        if (painelCadastroVendedor == null) {
            painelCadastroVendedor = new PainelCadastroVendedor();
        }
        return painelCadastroVendedor;
    }

    public ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }

    public TesteCadastroVendedor testeCadastroVendedor() {
        if (testeCadastroVendedor == null) {
            testeCadastroVendedor = new TesteCadastroVendedor(painelCadastroVendedor());
        }
        return testeCadastroVendedor;
    }

    public File file() {
        if (file == null) {
            file = new File("Vendedores.txt");
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
            ler = new FileReader("Vendedores.txt");
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
