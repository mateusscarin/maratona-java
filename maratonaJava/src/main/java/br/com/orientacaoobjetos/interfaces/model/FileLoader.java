package br.com.orientacaoobjetos.interfaces.model;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");

    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }

}
