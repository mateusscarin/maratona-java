package br.com.orientacaoobjetos.string.test;

public class StringTest {

    public static void main(String[] args) {
        
        String nome = "Mateus"; //String constant pool
        String nome2 = "Mateus";
        nome = nome.concat(" Scarin");
        
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Mateus");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
