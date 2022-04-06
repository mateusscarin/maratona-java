package br.com.orientacaoobjetos.modificadoresestaticos.model;

public class Serie {

    private String nome;
    private static int[] episodios = {1, 2, 3, 4, 5};

    static {
        System.out.println("Bloco de inicializacao estático");
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    
    {
        System.out.println("Bloco de inicializaçao não estático");
    }

    public Serie() {
        
        for (int episodio : Serie.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println("");
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
