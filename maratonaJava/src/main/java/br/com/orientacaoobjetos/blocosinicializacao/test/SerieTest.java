package br.com.orientacaoobjetos.blocosinicializacao.test;

import br.com.orientacaoobjetos.blocosinicializacao.model.Serie;

public class SerieTest {
    
    public static void main(String[] args) {
        
        Serie serie = new Serie();
        for(int episodio : serie.getEpisodios()){
            System.out.print(episodio + " ");}
        
    }
}
