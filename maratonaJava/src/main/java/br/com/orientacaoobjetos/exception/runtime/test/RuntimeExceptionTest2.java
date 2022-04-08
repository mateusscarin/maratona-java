package br.com.orientacaoobjetos.exception.runtime.test;

public class RuntimeExceptionTest2 {

    public static void main(String[] args) {

        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    private static int divisao(int a, int b) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, segundo valor não pode ser 0");
        }
        return 0;
    }
}
