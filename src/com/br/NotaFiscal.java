package com.br;

import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.util.*;

    public class NotaFiscal implements INotaFiscal {

        public static List<String> geraParcelas(int Parcelas, double valorTotal) {
            List<String> parcelas = new ArrayList<String>();
            String parcela;
            DefaultTableModel tableModel;

            Double NotaFiscal;
            int nrParcelas;

            NotaFiscal = valorTotal;
            nrParcelas = Parcelas;

            DecimalFormat df = new java.text.DecimalFormat("#,##0.00");

            for (int i = 1; i <= nrParcelas; i++) {
                parcela = i + " de " + nrParcelas + " parcelas no valor de: " + df.format(NotaFiscal / nrParcelas);
                parcelas.add(parcela);

            }
            return parcelas;
        }
    }











