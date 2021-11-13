package br.com.williamsilva.pedido;

import br.com.williamsilva.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    // construtor com injeção de dependências: repository, service, etc.
    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar o pedido no banco de dados");
        System.out.println("Enviar e-mail com dados do novo pedido");
    }
}
