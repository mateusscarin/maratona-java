package br.com.orientacaoobjetos.modificadorfinal.model;

public class Carro {

    private String nome;
    public static final double VELOCIDADE_LIMITE = 180;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
