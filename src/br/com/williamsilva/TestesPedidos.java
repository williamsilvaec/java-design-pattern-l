package br.com.williamsilva;

import br.com.williamsilva.pedido.GeraPedido;
import br.com.williamsilva.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependecias*/);
        handler.executa(gerador);
    }
}
