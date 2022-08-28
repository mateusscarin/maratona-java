package br.com.orientacaoobjetos.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Mateus
 */
public class PatternMatcherTest2 {

    public static void main(String[] args) {

        String regex = "\\W";
//        String texto = "abaaba";
        String texto2 = "@#d4ef f6";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições Encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
