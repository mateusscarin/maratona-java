package br.com.orientacaoobjetos.formatacao.test;

import java.util.Locale;

public class LocaleTest2 {

    public static void main(String[] args) {

        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        System.out.println("");
        
        for (String isoContrie : isoCountries) {
            System.out.print(isoContrie + " ");
        }
    }
}
