package br.com.orientacaoobjetos.string.test;

public class StringBuilderTest {

    public static void main(String[] args) {

        String nome = "Mateus Scarin";
        nome.concat(" Fatec");
        System.out.println(nome);
        
        StringBuilder sb = new StringBuilder("Mateus Scarin");
        sb.append(" Fatec").append(" Jales");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 2);
        System.out.println(sb);
    }
}
