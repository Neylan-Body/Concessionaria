/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import model.Arrays;
import model.PainelAdministrador;
import model.PainelInicio;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ConcessionariaView extends JFrame {

    /**
     * @param args the command line arguments
     */
    int posicaoCarga = 0, posicaoPasseio = 0;
    int cont = 0;
    private JMenuBar menuBar;

    private JMenu administracao;
    private JMenuItem vendedorCadastro;
    private JMenu vendedorLogin;
    private JMenuItem loginVendedor;
    private JMenuItem loginAdministrador;

    private JMenu cadastroVeiculos;
    private JMenu cadastroVendedor;
    private JMenu cadastroCliente;
    private JMenu relatorios;
    private JMenu voltar;
    private JMenuItem cadastroPasseio;
    private JMenuItem cadastroCarga;
    private JMenuItem logof;
    private JMenuItem relatorio;
    private JMenuItem cliente;
    private JMenuItem cadastroVendedorItem;
    
    private JMenu vendaPasseio;
    private JMenu vendaCarga;
    private JMenuItem passeio;
    private JMenuItem carga; 

    private PainelAdministrador painelAdministrador;
    private PainelInicio painelIncio;

    public ConcessionariaView() throws IOException {
        super("Concessionaria");
        this.setSize(1080, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(painelInicio().PainelIncio());
        new Arrays();
    }

    public JMenuBar MenuBar() {
        if (menuBar == null) {
            menuBar = new JMenuBar();
        }
        return menuBar;
    }

    public JMenu Administracao() {
        if (administracao == null) {
            administracao = new JMenu("Administração");
        }
        return administracao;
    }

    public JMenuItem VendedorCadastro() {
        if (vendedorCadastro == null) {
            vendedorCadastro = new JMenuItem("Cadastrar vendedor");
        }
        return vendedorCadastro;
    }
    
    public JMenu VendedorLogin() {
        if (vendedorLogin == null) {
            vendedorLogin = new JMenu("Vendedor");
        }
        return vendedorLogin;
    }

    public JMenuItem LoginVendedor() {
        if (loginVendedor == null) {
            loginVendedor = new JMenuItem("Login Vendedor");
        }
        return loginVendedor;
    }

    public JMenuItem LoginAdministrador() {
        if (loginAdministrador == null) {
            loginAdministrador = new JMenuItem("Login Administrador");
        }
        return loginAdministrador;
    }

    public JMenu CadastroVendedor() {
        if (cadastroVendedor == null) {
            cadastroVendedor = new JMenu("Cadastrar vendedor");
        }
        return cadastroVendedor;
    }

    public JMenu CadastroVeiculos() {
        if (cadastroVeiculos == null) {
            cadastroVeiculos = new JMenu("Cadastrar veiculos");
        }
        return cadastroVeiculos;
    }

    public JMenu CadastroCliente() {
        if (cadastroCliente == null) {
            cadastroCliente = new JMenu("Cadastrar cliente");
        }
        return cadastroCliente;
    }

    public JMenu Relatorios() {
        if (relatorios == null) {
            relatorios = new JMenu("Relatorios");
        }
        return relatorios;
    }
    
    public JMenuItem Relatorio() {
        if (relatorio == null) {
            relatorio = new JMenuItem("Relatorios");
        }
        return relatorio;
    }

    public JMenu Voltar() {
        if (voltar == null) {
            voltar = new JMenu("Voltar");
        }
        return voltar;
    }

    public JMenuItem CadastroPasseio() {
        if (cadastroPasseio == null) {
            cadastroPasseio = new JMenuItem("Veículo de passeio");
        }
        return cadastroPasseio;
    }

    public JMenuItem CadastroCarga() {
        if (cadastroCarga == null) {
            cadastroCarga = new JMenuItem("Veículo de carga");
        }
        return cadastroCarga;
    }

    public JMenuItem cadastroVendedor() {
        if (cadastroVendedorItem == null) {
            cadastroVendedorItem = new JMenuItem("Cadastrar vendedor");
        }
        return cadastroVendedorItem;
    }

    public JMenuItem Cliente() {
        if (cliente == null) {
            cliente = new JMenuItem("Cadastrar cliente");
        }
        return cliente;
    }

    public JMenuItem Logof() {
        if (logof == null) {
            logof = new JMenuItem("Voltar");
        }
        return logof;
    }
    
    public JMenu VendaPasseio() {
        if (vendaPasseio == null) {
            vendaPasseio = new JMenu("Carro Passeio");
        }
        return vendaPasseio;
    }
    
    public JMenu VendaCarga() {
        if (vendaCarga == null) {
            vendaCarga = new JMenu("Carro Carga");
        }
        return vendaCarga;
    }
    
    public JMenuItem Passeio() {
        if (passeio == null) {
            passeio = new JMenuItem("Carro Passeio");
        }
        return passeio;
    }
    
    public JMenuItem Carga() {
        if (carga == null) {
            carga = new JMenuItem("Carro Carga");
        }
        return carga;
    }

    public PainelInicio painelInicio() {
        if (painelIncio == null) {
            painelIncio = new PainelInicio();
        }
        return painelIncio;
    }

    public PainelAdministrador painelAdministrador() {
        if (painelAdministrador == null) {
            painelAdministrador = new PainelAdministrador();
        }
        return painelAdministrador;
    }
}