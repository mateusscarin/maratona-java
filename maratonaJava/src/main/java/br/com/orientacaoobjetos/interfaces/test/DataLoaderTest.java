package br.com.orientacaoobjetos.interfaces.test;

import br.com.orientacaoobjetos.interfaces.model.DatabaseLoader;
import br.com.orientacaoobjetos.interfaces.model.FileLoader;

public class DataLoaderTest {

    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
}
