package br.com.orientacaoobjetos.enumeracao.test;

import br.com.orientacaoobjetos.enumeracao.model.Cliente;
import br.com.orientacaoobjetos.enumeracao.model.TipoCliente;
import br.com.orientacaoobjetos.enumeracao.model.TipoPagamento;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Mateus", TipoCliente.PESSOA_FISICA, TipoPagamento.CRÉDITO);
        Cliente cliente2 = new Cliente("Mateus", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DÉBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DÉBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CRÉDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
