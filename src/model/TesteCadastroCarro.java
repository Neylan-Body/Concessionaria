/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class TesteCadastroCarro {
    
    
    private PainelCadastroPasseio painelCadastroPasseio;
    private PainelCadastroCarga painelCadastroCarga;
    
    public TesteCadastroCarro (PainelCadastroCarga painelCadastroCarga, PainelCadastroPasseio painelCadastroPasseio){
        this.painelCadastroCarga = painelCadastroCarga;
        this.painelCadastroPasseio = painelCadastroPasseio;
    }
    
    public boolean TelaCadastroPasseio() {
        try {
            if (Integer.parseInt(painelCadastroPasseio().TxtAnoFabricacao().getText()) < 1769) {
                JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Digite ano de fabricação correto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Digite ano de fabricação correto");
            return false;
        }
        try {
            if (Integer.parseInt(painelCadastroPasseio().TxtAnoModelo().getText()) < 1769) {
                JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Digite ano de modelo correto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Digite ano de modelo correto");
            return false;
        }
        try {
            if (Double.parseDouble(painelCadastroPasseio().TxtValor().getText()) < 0) {
                JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Digite um valor correto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Digite um valor correto");
            return false;
        }
        try {
            if (Integer.parseInt(painelCadastroPasseio().TxtLitragemPortaMalas().getText()) <= 0) {
                JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Digite uma quantidade correta de litros");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Digite uma quant idade correta de litros");
            return false;
        }
        try {
            if (Integer.parseInt(painelCadastroPasseio().TxtNumeroPassageiros().getText()) <= 0) {
                JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Digite uma quantidade de passageiros correta");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Digite uma quantidade de passageiros correta");
            return false;
        }
        for (int i = 0; i < Arrays.CarroPasseio().size(); i++) {
            if(painelCadastroPasseio().TxtNumeroChassis().getText().equals(Arrays.CarroPasseio().get(i).getChassis())){
                JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Este carro ja existe");
                return false;
            }
        }
        if (painelCadastroPasseio().TxtMarca().getText().isEmpty() || painelCadastroPasseio().TxtModelo().getText().isEmpty() || painelCadastroPasseio().TxtPotencia().getText().isEmpty() || painelCadastroPasseio().TxtNumeroChassis().getText().isEmpty()) {
            JOptionPane.showMessageDialog(painelCadastroPasseio().PainelCadastroPasseio(), "Existem campos vazios, preencha!");
            return false;
        }
        return true;
    }

    public boolean TelaCadastroCarga() {
        try {
            if (Integer.parseInt(painelCadastroCarga().TxtAnoFabricacao().getText()) < 1769) {
                JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite ano de fabricação correto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite ano de fabricação correto");
            return false;
        }
        try {
            if (Integer.parseInt(painelCadastroCarga().TxtAnoModelo().getText()) < 1769) {
                JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite ano de modelo correto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite ano de modelo correto");
            return false;
        }
        try {
            if (Double.parseDouble(painelCadastroCarga().TxtValor().getText()) < 0) {
                JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite um valor correto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite um valor correto");
            return false;
        }
        try {
            if (Integer.parseInt(painelCadastroCarga().TxtTamanhoCarroceria().getText()) <= 0) {
                JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Tamanho da carroceria incorreto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Tamanho da carroceria intcorreto");
            return false;
        }
        try {
            if (Integer.parseInt(painelCadastroCarga().TxtPesoMaximoCarga().getText()) <= 0) {
                JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite o peso maximo da carga correto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite o peso maximo da carga correto");
            return false;
        }
        try {
            if (Integer.parseInt(painelCadastroCarga().TxtPesoTotal().getText()) <= 0) {
                JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite o peso total correto");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite o peso total correto");
            return false;
        }
        try {
            if (Integer.parseInt(painelCadastroCarga().TxtAlturaCarga().getText()) <= 0) {
                JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite a altura maxima da carga correta");
                return false;
            }
        } catch (NumberFormatException ev) {
            JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Digite a altura maxima da carga correta");
            return false;
        }
        for (int i = 0; i < Arrays.CarroCarga().size(); i++) {
            if(painelCadastroCarga().TxtNumeroChassis().getText().equals(Arrays.CarroCarga().get(i).getChassis())){
                JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Este carro ja existe");
                return false;
            }
        }
        if (painelCadastroCarga().TxtMarca().getText().isEmpty() || painelCadastroCarga().TxtModelo().getText().isEmpty() || painelCadastroCarga().TxtPotencia().getText().isEmpty() || painelCadastroCarga().TxtNumeroChassis().getText().isEmpty()) {
            JOptionPane.showMessageDialog(painelCadastroCarga().PainelCadastroCarga(), "Existem campos vazios, preencha!");
            return false;
        }
        return true;
    }
    
    public PainelCadastroPasseio painelCadastroPasseio() {
        if (painelCadastroPasseio == null) {
            painelCadastroPasseio = new PainelCadastroPasseio();
        }
        return painelCadastroPasseio;
    }

    public PainelCadastroCarga painelCadastroCarga() {
        if (painelCadastroCarga == null) {
            painelCadastroCarga = new PainelCadastroCarga();
        }
        return painelCadastroCarga;
    }    
}
