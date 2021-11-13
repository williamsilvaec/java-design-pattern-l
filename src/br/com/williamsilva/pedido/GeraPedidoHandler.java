package br.com.williamsilva.pedido;

import br.com.williamsilva.orcamento.Orcamento;
import br.com.williamsilva.pedido.acao.EnviarEmailPedido;
import br.com.williamsilva.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    // construtor com injeção de dependências: repository, service, etc.
    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido email = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

        salvar.executa(pedido);
        email.executa(pedido);
    }
}
