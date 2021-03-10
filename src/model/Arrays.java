/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class Arrays {

    private static ArrayList<Salario> vendedorSalario;
    private static ArrayList<Carga> carroCarga;
    private static ArrayList<Passeio> carroPasseio;
    private static ArrayList<Vendedor> vendedor;
    private static ArrayList<Cliente> cliente;
    public static double acumulado = 0;
    public static double lucroTotal = 0;
    public static double lucroCarga = 0;
    public static double lucroPasseio = 0;
    public static int carrosVendidos = 0;
    public static double acumuladoCarga = 0;
    public static double acumuladoPasseio = 0;
    public static int carrosVendidosCarga = 0;
    public static int carrosVendidosPasseio = 0;
    private static FileReader frCarga, frPasseio, frVendedor, frCliente;
    private static BufferedReader brCarga, brPasseio, brVendedor, brCliente;
    private static File fileCarga, filePasseio, fileVendedor, fileCliente;

    public Arrays() throws FileNotFoundException, IOException {
        if (fileCarga().exists()) {
            try {
                String s;
                while ((s = brCarga().readLine()) != null) {
                    CarroCarga().add(new Carga(s, brCarga().readLine(),
                            brCarga().readLine(), brCarga().readLine(), brCarga().readLine(),
                            brCarga().readLine(), brCarga().readLine(), Integer.parseInt(brCarga().readLine()),
                            Integer.parseInt(brCarga().readLine()), Double.parseDouble(brCarga().readLine()),
                            Double.parseDouble(brCarga().readLine()), brCarga().readLine(),
                            false, false, false, false, false));
                    brCarga().readLine();
                    brCarga().readLine();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Arquivo inexistente");
            } finally {
                brCarga().close();
            }
        }
        if (filePasseio().exists()) {
            try {
                String s;
                while ((s = brPasseio().readLine()) != null) {
                    CarroPasseio().add(new Passeio(Integer.parseInt(s), Integer.parseInt(brPasseio().readLine()),
                            brPasseio().readLine(), brPasseio().readLine(), brPasseio().readLine(),
                            Integer.parseInt(brPasseio().readLine()), Integer.parseInt(brPasseio().readLine()),
                            Double.parseDouble(brPasseio().readLine()), Double.parseDouble(brPasseio().readLine()),
                            brPasseio().readLine(), false, false, false, false, false));
                    brPasseio().readLine();
                    brPasseio().readLine();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Arquivo inexistente");
            } finally {
                brPasseio().close();
            }
        }
        if (fileVendedor().exists()) {
            try {
                String s;
                while ((s = brVendedor().readLine()) != null) {
                    Vendedor().add(new Vendedor(s, brVendedor().readLine(), brVendedor().readLine(), Integer.parseInt(brVendedor().readLine()),
                            brVendedor().readLine(), brVendedor().readLine(), brVendedor().readLine(), brVendedor().readLine(),
                            Double.parseDouble(brVendedor().readLine()), brVendedor().readLine(),
                            Double.parseDouble(brVendedor().readLine()), Double.parseDouble(brVendedor().readLine()), brVendedor().readLine(),
                            brVendedor().readLine()));
                    brVendedor().readLine();
                    brVendedor().readLine();
                }
                for (int j = 0; j < Arrays.Vendedor().size(); j++) {
                    String nome = Arrays.Vendedor().get(j).getNome();
                    String login = Arrays.Vendedor().get(j).getLogin();
                    double sal = Arrays.Vendedor().get(j).getSalario();
                    Arrays.VendedorSalario().add((new Salario(nome, login, sal, 0, 0, 0, 0, 0)));
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Arquivo inexistente");
            } finally {
                brVendedor().close();
            }
        }
        if (fileCliente().exists()) {
            try {
                String s;
                while ((s = brCliente().readLine()) != null) {
                    Cliente().add(new Cliente(s, brCliente().readLine(), brCliente().readLine(), brCliente().readLine(),
                            brCliente().readLine(), Integer.parseInt(brCliente().readLine()), brCliente().readLine(), brCliente().readLine()));
                    brCliente().readLine();
                    brCliente().readLine();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Arquivo inexistente");
            } finally {
                brCliente().close();
            }
        }
    }

    public static ArrayList<Carga> CarroCarga() {
        if (carroCarga == null) {
            carroCarga = new ArrayList<Carga>();
        }
        return carroCarga;
    }

    public static ArrayList<Salario> VendedorSalario() {
        if (vendedorSalario == null) {
            vendedorSalario = new ArrayList<Salario>();
        }
        return vendedorSalario;
    }

    public static ArrayList<Passeio> CarroPasseio() {
        if (carroPasseio == null) {
            carroPasseio = new ArrayList<Passeio>();
        }
        return carroPasseio;
    }

    public static ArrayList<Vendedor> Vendedor() {
        if (vendedor == null) {
            vendedor = new ArrayList<Vendedor>();
        }
        return vendedor;
    }

    public static ArrayList<Cliente> Cliente() {
        if (cliente == null) {
            cliente = new ArrayList<Cliente>();
        }
        return cliente;
    }

    public static FileReader frCarga() throws FileNotFoundException {
        if (frCarga == null) {
            frCarga = new FileReader("Carros Carga.txt");
        }
        return frCarga;
    }

    public static BufferedReader brCarga() throws FileNotFoundException {
        if (brCarga == null) {
            brCarga = new BufferedReader(frCarga());
        }
        return brCarga;
    }

    public static FileReader frPasseio() throws FileNotFoundException {
        if (frPasseio == null) {
            frPasseio = new FileReader("Carros Passeio.txt");
        }
        return frPasseio;
    }

    public static BufferedReader brPasseio() throws FileNotFoundException {
        if (brPasseio == null) {
            brPasseio = new BufferedReader(frPasseio());
        }
        return brPasseio;
    }

    public static FileReader frVendedor() throws FileNotFoundException {
        if (frVendedor == null) {
            frVendedor = new FileReader("Vendedores.txt");
        }
        return frVendedor;
    }

    public static BufferedReader brVendedor() throws FileNotFoundException {
        if (brVendedor == null) {
            brVendedor = new BufferedReader(frVendedor());
        }
        return brVendedor;
    }

    public static FileReader frCliente() throws FileNotFoundException {
        if (frCliente == null) {
            frCliente = new FileReader("Clientes.txt");
        }
        return frCliente;
    }

    public static BufferedReader brCliente() throws FileNotFoundException {
        if (brCliente == null) {
            brCliente = new BufferedReader(frCliente());
        }
        return brCliente;
    }

    public static File fileCarga() {
        if (fileCarga == null) {
            fileCarga = new File("Carros Carga.txt");
        }
        return fileCarga;
    }

    public static File filePasseio() {
        if (filePasseio == null) {
            filePasseio = new File("Carros Passeio.txt");
        }
        return filePasseio;
    }

    public static File fileVendedor() {
        if (fileVendedor == null) {
            fileVendedor = new File("Vendedores.txt");
        }
        return fileVendedor;
    }

    public static File fileCliente() {
        if (fileCliente == null) {
            fileCliente = new File("Clientes.txt");
        }
        return fileCliente;
    }
}
