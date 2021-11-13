package br.com.williamsilva.pedido;

import br.com.williamsilva.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa() {
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(this.cliente, data, orcamento);

        System.out.println("Salvar o pedido no banco de dados");
        System.out.println("Enviar e-mail com dados do novo pedido");
    }
}
