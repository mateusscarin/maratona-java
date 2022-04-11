package br.com.orientacaoobjetos.string.test;

public class StringTest2 {

    public static void main(String[] args) {
        
        String nome = "Mateus";
        String numeros = "012345";
        String trim = "        trim        ";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("s", "z"));
        System.out.println(nome.replace("z", "s"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3, 5));
        System.out.println(trim);
        System.out.println(trim.trim());
    }
}
