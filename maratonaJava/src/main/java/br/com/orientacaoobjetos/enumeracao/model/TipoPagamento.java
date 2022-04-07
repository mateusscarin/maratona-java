package br.com.orientacaoobjetos.enumeracao.model;

public enum TipoPagamento {
    DÉBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }

    },
    CRÉDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);

}
