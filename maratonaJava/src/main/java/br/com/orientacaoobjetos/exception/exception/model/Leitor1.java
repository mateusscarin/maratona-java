package br.com.orientacaoobjetos.exception.exception.model;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 1");
    }

    
}
