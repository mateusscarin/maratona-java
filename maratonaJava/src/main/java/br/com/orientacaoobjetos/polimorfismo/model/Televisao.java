package br.com.orientacaoobjetos.polimorfismo.model;

public class Televisao extends Produto{

    public static final double IMPOSTO_POR_CENTO = 0.30;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do televisao");
        return this.valor * IMPOSTO_POR_CENTO;
    }
    
}
