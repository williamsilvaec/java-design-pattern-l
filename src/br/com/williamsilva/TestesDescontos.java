package br.com.williamsilva;

import br.com.williamsilva.desconto.CalculadoraDeDescontos;
import br.com.williamsilva.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 4);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(primeiroOrcamento));
        System.out.println(calculadora.calcular(segundoOrcamento));
    }
}
