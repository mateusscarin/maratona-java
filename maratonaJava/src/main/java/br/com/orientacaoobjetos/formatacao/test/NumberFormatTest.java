package br.com.orientacaoobjetos.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    public static void main(String[] args) {

        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeUS = Locale.US;

        NumberFormat[] nft = new NumberFormat[4];
        nft[0] = NumberFormat.getInstance();
        nft[1] = NumberFormat.getInstance(localePT);
        nft[2] = NumberFormat.getInstance(localeJP);
        nft[3] = NumberFormat.getInstance(localeUS);

        NumberFormat[] moedas = new NumberFormat[4];
        moedas[0] = NumberFormat.getCurrencyInstance();
        moedas[1] = NumberFormat.getCurrencyInstance(localePT);
        moedas[2] = NumberFormat.getCurrencyInstance(localeJP);
        moedas[3] = NumberFormat.getCurrencyInstance(localeUS);

        double valor = 10000.2130;

        for (NumberFormat numberFormat : nft) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }

        for (NumberFormat numberFormat : moedas) {
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "$10,000.21";
        try {
            System.out.println(moedas[3].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
