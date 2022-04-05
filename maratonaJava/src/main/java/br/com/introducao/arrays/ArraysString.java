package br.com.introducao.arrays;

public class ArraysString {

    public static void main(String[] args) {

        String[] nomes = new String[3];

        nomes[0] = "Mateus";
        nomes[1] = "Henrique";
        nomes[2] = "Scarin";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        
        nomes = new String[4];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
