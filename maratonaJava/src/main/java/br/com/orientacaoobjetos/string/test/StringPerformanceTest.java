package br.com.orientacaoobjetos.string.test;

public class StringPerformanceTest {

    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");
    }

    public static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
