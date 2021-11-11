package br.com.williamsilva;

import br.com.williamsilva.imposto.*;
import br.com.williamsilva.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        /*Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        BigDecimal valorImposto = calculadora.calcular(orcamento, TipoImposto.ICMS);
        System.out.println(valorImposto);*/

        // Com padrão strategy
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        BigDecimal valorImpostoIcms = calculadora.calcular(orcamento, icms);
        BigDecimal valorImpostoIss = calculadora.calcular(orcamento, iss);
        System.out.println(valorImpostoIcms);
        System.out.println(valorImpostoIss);
    }
}
