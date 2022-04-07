package br.com.orientacaoobjetos.interfaces.model;

public class DatabaseLoader implements DataLoader{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    
}
