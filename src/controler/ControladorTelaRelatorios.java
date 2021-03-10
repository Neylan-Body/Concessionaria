/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import model.Arrays;
import model.PainelRelatorios;
import view.ConcessionariaView;

/**
 *
 * @author Wellington
 * @author Danilo
 * @author Neylan
 */
public class ControladorTelaRelatorios implements ActionListener {

    private PainelRelatorios painelRelatorios;
    private ConcessionariaView concessionariaView;

    public ControladorTelaRelatorios(PainelRelatorios painelRelatorios, ConcessionariaView concessionariaView) throws IOException {
        this.painelRelatorios = painelRelatorios;
        this.concessionariaView = concessionariaView;
        String dados = "";
        for (int i = 0; i < Arrays.Vendedor().size(); i++) {
            dados = dados + "NOME : " + Arrays.Vendedor().get(i).getNome() + "\n"
                    + "SALARIO : " + Double.toString(Arrays.Vendedor().get(i).getSalario()) + " R$" + "\n"
                    + "CARGA : " + Integer.toString(Arrays.VendedorSalario().get(i).getCarrosCarga()) + " Carros" + "\n"
                    + "PASSEIO : " + Integer.toString(Arrays.VendedorSalario().get(i).getCarrosPasseio()) + " Carros" + "\n"
                    + "TOTAL VENDIDO : " + Double.toString(Arrays.VendedorSalario().get(i).getVenda()) + " R$" + "\n\n";
        }
        dados = dados + "\n";
        dados = dados + "QUANTIDADE DE CARROS VENDIDOS : " + Integer.toString(Arrays.carrosVendidos) + "\n"
                + "QUANTIDADE DE CARROS CARGA VENDIDOS : " + Integer.toString(Arrays.carrosVendidosCarga) + "\n"
                + "QUANTIDADE DE CARROS PASSEIO VENDIDOS : " + Integer.toString(Arrays.carrosVendidosPasseio) + "\n"
                + "TOTAL BRUTO : " + Double.toString(Arrays.acumulado) + " R$" + "\n"
                + "TOTAL CARGA BRUTO : " + Double.toString(Arrays.acumuladoCarga) + " R$" + "\n"
                + "TOTAL PASSEIO BRUTO : " + Double.toString(Arrays.acumuladoPasseio) + " R$" + "\n"
                + "LUCRO TOTAL : " + Double.toString(Arrays.lucroTotal) + " R$" + "\n"
                + "LUCRO TOTAL CARGA : " + Double.toString(Arrays.lucroCarga) + " R$" + "\n"
                + "LUCRO TOTAL PASSEIO : " + Double.toString(Arrays.lucroPasseio) + " R$" + "\n";
        painelRelatorios().TxaRelatorio().setText(dados);
        concessionariaView().setContentPane(painelRelatorios().PainelRelatorios());
        concessionariaView().repaint();
        concessionariaView().validate();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PainelRelatorios painelRelatorios() {
        if (painelRelatorios == null) {
            painelRelatorios = new PainelRelatorios();
        }
        return painelRelatorios;
    }

    public ConcessionariaView concessionariaView() throws IOException {
        if (concessionariaView == null) {
            concessionariaView = new ConcessionariaView();
        }
        return concessionariaView;
    }
}
