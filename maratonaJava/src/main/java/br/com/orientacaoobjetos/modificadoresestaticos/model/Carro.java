package br.com.orientacaoobjetos.modificadoresestaticos.model;

public class Carro {

    private String nome;
    private double velocidaMaxima;
    public static double velocidadeLimite = 250;

    public Carro(String nome, double velocidaMaxima) {
        this.nome = nome;
        this.velocidaMaxima = velocidaMaxima;
    }

    public void imprime() {
        System.out.println("-------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Máxima " + this.velocidaMaxima);
        System.out.println("Velocidade Limite " + Carro.velocidadeLimite);

    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidaMaxima() {
        return velocidaMaxima;
    }

    public void setVelocidaMaxima(double velocidaMaxima) {
        this.velocidaMaxima = velocidaMaxima;
    }
}
