package br.com.estruturascondicionais;

public class EstruturasCondicionaisSwitch {

    public static void main(String[] args) {

        int dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'm':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Homem");
                break;
            case 'f':
                System.out.println("Homem");
                break;
            default:
                System.out.println("Opção digitada inválida");
                break;
        }

    }
}
