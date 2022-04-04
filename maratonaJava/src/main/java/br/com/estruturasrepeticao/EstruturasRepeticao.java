package br.com.estruturasrepeticao;

public class EstruturasRepeticao {

    public static void main(String[] args) {

        int count = 0;

        while (count < 10) {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println(count);
            count++;
        } while (count < 10);

        for (int i = 0; i<10; i++) {
            System.out.println(i);
        }
    }

}
