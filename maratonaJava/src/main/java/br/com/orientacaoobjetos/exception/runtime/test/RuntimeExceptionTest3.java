package br.com.orientacaoobjetos.exception.runtime.test;

public class RuntimeExceptionTest3 {

    public static void main(String[] args) {

        abreConexao();
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Fazendo alterações no arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");

        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Fazendo alterações no arquivo");
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");

        }
    }
}
