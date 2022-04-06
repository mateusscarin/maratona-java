package br.com.orientacaoobjetos.associacao.test;

import java.util.Scanner;

public class LeituraDeDados2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua pergunta que eu responderei SIM ou NÃO");
        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' '){
        System.out.println("SIM");
        }else {
            System.out.println("NÃO");}
    }
}
