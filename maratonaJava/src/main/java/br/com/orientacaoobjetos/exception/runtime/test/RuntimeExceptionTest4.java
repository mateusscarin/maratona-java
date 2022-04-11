package br.com.orientacaoobjetos.exception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest4 {

    public static void main(String[] args) {

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException e) {
            System.out.println("Dentro do SQLException");
        } catch (IOException e) {
            System.out.println("Dentro do FileNotFoundExecption");
        }

        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void talvezLanceException() throws SQLException, FileNotFoundException {

    }

}
