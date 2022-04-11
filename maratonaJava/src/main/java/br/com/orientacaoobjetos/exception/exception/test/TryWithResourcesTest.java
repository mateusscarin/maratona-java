package br.com.orientacaoobjetos.exception.exception.test;

import br.com.orientacaoobjetos.exception.exception.model.Leitor1;
import br.com.orientacaoobjetos.exception.exception.model.Leitor2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest {

    public static void main(String[] args) {

        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        } catch (IOException e) {
        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
