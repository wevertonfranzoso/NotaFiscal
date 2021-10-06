package com.br;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main implements INotaFiscal {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        List<String> parcelasResult = new ArrayList<String>();

        Double NotaFiscal = 0.00;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da nota fiscal");
        NotaFiscal = sc.nextDouble();

        int nrParcelas;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite em quantas vezes quer parcelar");
        nrParcelas = scan.nextInt();

        DecimalFormat df = new java.text.DecimalFormat("#,##0.00");

        for (int i = 1; i <= nrParcelas; i++) {
            System.out.printf(i + " de " + nrParcelas + " parcelas no valor de: " + df.format(NotaFiscal / nrParcelas));
            System.out.println();

            // System.out.printf(i + " de " + nrParcelas + " parcelas no valor de: " + df.format(NotaFiscal / nrParcelas));
            // System.out.println();
        }
    }
}


