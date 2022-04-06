package br.com.orientacaoobjetos.blocosinicializacao.model;

public class Serie {

    private String nome;
    private int[] episodios = {1, 2, 3, 4, 5};

    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Serie() {
        
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public Serie(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
